package co.stepdefinitions;

import co.runners.GoogleSearch;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import pages.GoogleHome;
import utils.Generator;

public class GoogleSearchStep  {

    @Managed(driver = "chrome")
    public WebDriver webDriver;


    @Given("^Im on the homepage$")
    public void imOnTheHomepage() throws Exception {
       Generator.getInstance(GoogleHome.class,webDriver).goToGooglePage();
    }

    @When("^I do a search of (.*)$")
    public void iDoASearchOf(String text) throws Exception {
        Generator.getInstance(GoogleHome.class,webDriver).searchGoogleTextBox(text);

    }


}
