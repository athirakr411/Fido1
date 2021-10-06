package stepDefinitions;

import io.cucumber.java.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import base.DriverManager;
import pages.FidoHomePage;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class FidoSearchStepDefinitions {
    WebDriver driver = null;
    FidoHomePage fidoHomePage=null;
    DriverManager drivermanager=new DriverManager();



    @Before
    public void aSetup1(){
        System.out.println("this is Before tag");
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        driver.close();
        System.out.println("this is @After");
    }

    @BeforeStep
    public void beforestep() throws InterruptedException {

        System.out.println("this is @BeforeStep");
    }

    @AfterStep
    public void afterstep(){
        System.out.println("this is @AfterStep");
    }

    @When("user clicks on shop")
    public void userClicksOnShop() throws InterruptedException {
        fidoHomePage.clickOnShop();
        Thread.sleep(5000);
    }

    @And("continues selecting")
    public void continuesSelecting() throws InterruptedException {
        fidoHomePage.clickOnPhones();
        Thread.sleep(5000);
        fidoHomePage.clickOnDetails();
        Thread.sleep(5000);
        fidoHomePage.clickOnGetStarted();
        Thread.sleep(5000);
        fidoHomePage.clickOnPlan();
        Thread.sleep(5000);

    }

    @Then("Build your plan page will be displayed")
    public void buildYourPlanPageWillBeDisplayed() {
        System.out.println("Build your plan page is displayed");
    }

    @Given("fido webpage is launched in {string}")
    public void amazonWebpageIsLaunchedIn(String arg0) {
        driver=drivermanager.getBrowserDriver(arg0);
        driver.get("https://www.fido.ca/");
        fidoHomePage =new FidoHomePage(driver);
    }

    @Given("fido webpage is launched")
    public void fidoWebpageIsLaunched() throws InterruptedException {
        //WebDriverManager.chromedriver().setup();//sets up the chrome driver
        //WebDriver driver=new ChromeDriver();
        driver.get("https://www.fido.ca/");
        fidoHomePage =new FidoHomePage(driver);
        Thread.sleep(5000);//after going to website it's again loading
    }

    @Given("print")
    public void print() {
        System.out.println("printing");
    }
}
