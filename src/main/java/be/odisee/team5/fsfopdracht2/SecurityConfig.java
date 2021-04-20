package be.odisee.team5.fsfopdracht2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource datasource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.jdbcAuthentication()
                .dataSource(datasource)
                .usersByUsernameQuery("select emailadres, paswoord, true as enabled from PERSONEN where emailadres=?")
                .authoritiesByUsernameQuery("select personen.emailadres, rollen.type as authority from PERSOONS,rollen"+
                        " where personen.id=rollen.persoon_id and emailadres=?");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.
//                formLogin()
//                .loginPage("/login")
//                .defaultSuccessUrl("/menu.html")
//                .failureUrl("/login?login_error=1")
//                .and()
//                .logout().logoutSuccessUrl("/logoutSuccess.html").permitAll()
//                .and()
//                .httpBasic()
//                .and()
//                .authorizeRequests()
//                .antMatchers("/login*").permitAll()
//                .antMatchers("/logout*").permitAll()
//                .antMatchers("/logoutSuccess*").permitAll()
//                .antMatchers("/accessDenied*").permitAll()
//                .antMatchers("/admin/**").hasAuthority("Administrator")
//                .antMatchers("/organisator/**").hasAuthority("Organisator")
//                .antMatchers("/brainstorm/**").hasAnyAuthority("Facilitator","Deelnemer")
//                .antMatchers("/**").authenticated()
//                .anyRequest().authenticated()
//                .and()
//                .exceptionHandling().accessDeniedPage("/accessDenied");
//        http.exceptionHandling().accessDeniedPage("/403");
//        http.csrf().disable();// NEEDED FOR H2 CONSOLE
//        http.headers().frameOptions().disable();

        http.authorizeRequests()
                .antMatchers("/favicon.ico").permitAll()
                .antMatchers("/login*").permitAll()
                .antMatchers("/images/**").permitAll()
                .antMatchers("/css/**").permitAll()
                .antMatchers("/admin", "/h2/**").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .failureUrl("/login-error")
                .defaultSuccessUrl("/timesheet",true)
                .permitAll()
                .and()
                .logout()
                .invalidateHttpSession(true)
                .logoutSuccessUrl("/byebye")
                .permitAll();
        http.exceptionHandling().accessDeniedPage("/403");
        http.csrf().disable();                                  // NEEDED FOR H2 CONSOLE
        http.headers().frameOptions().disable();
    }
}