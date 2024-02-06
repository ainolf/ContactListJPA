package resources;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddContactTest {
    private WebDriver webDriver;
    private static final String pathToChromeWebdriver = "/home/oscar/Oscar/Software/chromedriver";
    private static final String localhost = "http://localhost:8080";

    private static final Logger LOG = Logger.getLogger(ExampleResource.class);

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", pathToChromeWebdriver);
//        System.setProperty("webdriver.gecko.driver", pathToFirefoxDriver);
        webDriver = new ChromeDriver();
//        webDriver = new FirefoxDriver();
        // Wait before getting WebElements
//        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }

    @Given("I am in the contacts list page")
    public void i_am_in_the_contacts_list_page() {
        // Write code here that turns the phrase above into concrete actions
        webDriver.navigate().to(localhost);
    }
    @When("II provide {string} for the name")
    public void ii_provide_for_the_name(String name) {
        // Write code here that turns the phrase above into concrete actions
        webDriver.findElement(By.xpath("//input[@v-model='nam'")).sendKeys(name);
    }
    @When("I provide {string} for the surname")
    public void i_provide_for_the_surname(String string) {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("I provide {string} for the nif")
    public void i_provide_for_the_nif(String string) {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("I click the New button")
    public void i_click_the_new_button() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("The person with nif {string} is created in the agenda")
    public void the_person_with_nif_is_created_in_the_agenda(String string) {
        // Write code here that turns the phrase above into concrete actions
    }
}
