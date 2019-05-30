package Steps;

import PageClasses.HomePage;
import PageClasses.LoginPage;
import Utility.ReadExcel;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertEquals;

public class LoginStep {

    WebDriver driver;
    ReadExcel reExcel = new ReadExcel();



    @Given("^I navigate to the login page of the applicaiton$")
    public void iNavigateToTheLoginPageOfTheApplicaiton() throws Throwable{
        System.out.println("Navigate to the Login Page of Guru99 Demo aplication");

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(reExcel.readExcel(1,0,".\\Data\\Data.xlsx","Sheet1"));
    }

    @And("^I enter the username and password$")
    public void iEnterTheUsernameAndPassword() throws Throwable{
        LoginPage lgPage = new LoginPage(driver);
        lgPage.setUserName(reExcel.readExcel(1,1,".\\Data\\Data.xlsx","Sheet1"));
        lgPage.setPassword(reExcel.readExcel(1,2,".\\Data\\Data.xlsx","Sheet1"));
    }

    @And("^I click the Login button$")
    public void iClickTheLoginButton() throws Throwable{
        LoginPage lgPage = new LoginPage(driver);
        System.out.println("Click the Login button");
        lgPage.clickLoginButton();
    }

    @Then("^I should see the Home Page$")
    public void iShouldSeeTheHomePage() throws Throwable{
        HomePage hmPage = new HomePage(driver);
        System.out.println("Home Page should be shown");
        assertEquals(hmPage.getHomePageTitle(),reExcel.readExcel(1,3,".\\Data\\Data.xlsx","Sheet1"));
        driver.close();
    }



}
