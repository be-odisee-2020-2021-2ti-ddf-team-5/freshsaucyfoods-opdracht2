package be.odisee.team5.fsfopdracht2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefinitions {
    WebDriver driver;
    @Given("^Ik ben op de pagina waar ik een bestelling kan toevoegen")
    public void Ik_ben_op_de_pagina_waar_ik_een_bestelling_kan_toevoegen() throws Throwable {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

        driver = new FirefoxDriver();
        driver.navigate().to( "http://localhost:8080/bestelling");
    }
    @When("^Ik \"([^\"]*)\" zet in het ([^\"]*)$")
    public void Ik_Geef_BestellingTitel_ingeef(String enteredText, String fieldName) throws Throwable{
        driver.findElement(By.id(fieldName)).sendKeys(enteredText);
    }
    @When("^Ik \"([^\"]*)\" toevoeg in het ([^\"]*)")
    public void Ik_AantalLiter_Ingeef(String aantalLiter, String fieldName) throws Throwable {
      driver.findElement(By.id(fieldName)).sendKeys(aantalLiter);
    }

    @When("^Ik \"([^\"]*)\" aanduid in het ([^\"]*)")
   public void Ik_gewensteDatum_ingeef(String datumStartproductie, String fieldName) throws Throwable {
        datumStartproductie = datumStartproductie.replace("/","-");
        driver.findElement(By.id(fieldName)).click();
        driver.findElement(By.id(fieldName)).sendKeys(datumStartproductie);
    }
    @When("^Ik op de submit-button klik$")
    public void i_press_on_the_Submit_button() throws Throwable {
        driver.findElement(By.name("submit")).click();
    }
    @Then("^Zou ik \"([^\"]*)\" in de tabel zien verschijnen\\.$")
    public void Ik_zou_een_lijst_moeten_zien(String text2bFound) throws Throwable {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions
                        .textToBePresentInElementLocated(By.className("titeltoegevoegd"), text2bFound));

        String bodyText = driver.findElement(By.tagName("body")).getText();
        Assert.assertTrue("Did not find this text: " + text2bFound +"\n",bodyText.contains(text2bFound));
    }
    //==================================================================================================================
    // bestelling verwijderen
       @Given("^Ik ben op de pagina waar ik een bestelling kan verwijderen")
        public void Ik_ben_op_de_pagina_waar_ik_een_bestelling_kan_verwijderen() throws Throwable {
            System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

            driver = new FirefoxDriver();
            driver.navigate().to( "http://localhost:8080/bestelling");
        }
        @When("^Ik \"([^\"]*)\" zet in het ([^\"]*)$")
        public void Ik_Geef_BestellingTitel_ingeef_delete(String enteredText, String fieldName) throws Throwable{
            driver.findElement(By.id(fieldName)).sendKeys(enteredText);
        }
        @When("^Ik \"([^\"]*)\" toevoeg in het ([^\"]*)")
        public void Ik_AantalLiter_Ingeef_delete(String aantalLiter, String fieldName) throws Throwable {
          driver.findElement(By.id(fieldName)).sendKeys(aantalLiter);
        }

        @When("^Ik \"([^\"]*)\" aanduid in het ([^\"]*)")
       public void Ik_gewensteDatum_ingeef_delete(String datumStartproductie, String fieldName) throws Throwable {
            datumStartproductie = datumStartproductie.replace("/","-");
            driver.findElement(By.id(fieldName)).click();
            driver.findElement(By.id(fieldName)).sendKeys(datumStartproductie);
        }
        @When("^Ik op de submit-button klik$")
        public void i_press_on_the_delete_button() throws Throwable {
            driver.findElement(By.name("delete")).click();
        }
        @Then("^Zou ik \"([^\"]*)\" in de tabel zien verschijnen\\.$")
        public void Ik_zou_een_lijst_moeten_zien_delete(String text2bFound) throws Throwable {
            new WebDriverWait(driver, 10)
                    .until(ExpectedConditions
                            .textToBePresentInElementLocated(By.className("titeldeleted"), text2bFound));

            String bodyText = driver.findElement(By.tagName("body")).getText();
            Assert.assertTrue("Did not find this text: " + text2bFound +"\n",bodyText.contains(text2bFound));
        }
        //==============================================================================================================
           @Given("^Ik ben op de pagina waar ik een bestelling kan updaten")
            public void Ik_ben_op_de_pagina_waar_ik_een_bestelling_kan_updaten() throws Throwable {
                System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

                driver = new FirefoxDriver();
                driver.navigate().to( "http://localhost:8080/bestelling");
            }
            @When("^Ik \"([^\"]*)\" zet in het ([^\"]*)$")
            public void Ik_Geef_BestellingTitel_ingeef_updaten(String enteredText, String fieldName) throws Throwable{
                driver.findElement(By.id(fieldName)).sendKeys(enteredText);
            }
            @When("^Ik \"([^\"]*)\" toevoeg in het ([^\"]*)")
            public void Ik_AantalLiter_Ingeef_updaten(String aantalLiter, String fieldName) throws Throwable {
              driver.findElement(By.id(fieldName)).sendKeys(aantalLiter);
            }

            @When("^Ik \"([^\"]*)\" aanduid in het ([^\"]*)")
           public void Ik_gewensteDatum_ingeef_updaten(String datumStartproductie, String fieldName) throws Throwable {
                datumStartproductie = datumStartproductie.replace("/","-");
                driver.findElement(By.id(fieldName)).click();
                driver.findElement(By.id(fieldName)).sendKeys(datumStartproductie);
            }
            @When("^Ik op de update-button klik$")
            public void i_press_on_the_update_button() throws Throwable {
                driver.findElement(By.name("update")).click();
            }
            @Then("^Zou ik \"([^\"]*)\" in de tabel zien updaten\\.$")
            public void Ik_zou_een_lijst_moeten_zien_updaten(String text2bFound) throws Throwable {
                new WebDriverWait(driver, 10)
                        .until(ExpectedConditions
                                .textToBePresentInElementLocated(By.className("titelgeupdate"), text2bFound));

                String bodyText = driver.findElement(By.tagName("body")).getText();
                Assert.assertTrue("Did not find this text: " + text2bFound +"\n",bodyText.contains(text2bFound));
            }

}