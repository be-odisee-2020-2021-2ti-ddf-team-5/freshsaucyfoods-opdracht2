package be.odisee.team5.fsfopdracht2;
import java.time.LocalDate;
import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
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
    @When("^Ik \"([^\"]*)\" zet in het ([^\"]*) field$")
    public void Idsfqs(String enteredText, String fieldName) throws Throwable{
        driver.findElement(By.id(fieldName)).sendKeys(enteredText);
    }
    @When("^Ik \"([^\"]*)\" zet in het ([^\"]*)")
    public void Ik_AantalLiter_Ingeef(String aantalLiter, String fieldName) throws Throwable {
        driver.findElement(By.id(fieldName)).sendKeys(aantalLiter);
    }
    @When("^Ik \"([^\"]*)\" zet in heet ([^\"]*)")
    public void Ik_gewensteDatum_ingeef(String datumStartproductie, String fieldName) throws Throwable {
        driver.findElement(By.id(fieldName)).sendKeys(datumStartproductie);
    }
    @When("^Ik op de submit-button klik^")
    public void i_press_on_the_Submit_button() throws Throwable {
        driver.findElement(By.name("submit")).click();
    }
    @Then("^Zou ik een lijst moeten zien met \"([^\"]*)\"$")
    public void Ik_zou_een_lijst_moeten_zien(String text2bFound) throws Throwable {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions
                        .textToBePresentInElementLocated(By.tagName("body"), "Details van persoon"));

        String bodyText = driver.findElement(By.tagName("body")).getText();
        Assert.assertTrue("Did not find this text: " + text2bFound +"\n",bodyText.contains(text2bFound));
    }
}
class LabelData {
    String label;
    String data;
}