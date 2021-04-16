package be.odisee.team5.fsfopdracht2;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@ComponentScan({"securityconfig","be.odisee.team5.fsfopdracht2"})
@EntityScan("be.odisee.brainstorm.domain")
public class Fsfopdracht2Application extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(Fsfopdracht2Application.class, args);
    }
    @Bean
    public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf) {
        return hemf.getSessionFactory();
    }

}
