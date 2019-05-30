import PageClasses.HomePage;
import PageClasses.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import Utility.*;

import java.io.IOException;


public class LoginTest {

    WebDriver driver;

    @Test
    public void test() throws IOException {

        ReadExcel reExcel = new ReadExcel();

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(reExcel.readExcel(1,0,".\\Data\\Data.xlsx","Sheet1"));

        LoginPage lgPage = new LoginPage(driver);
        assertEquals(lgPage.getPageTitle(),reExcel.readExcel(1,3,".\\Data\\Data.xlsx","Sheet1"));
//        System.out.println(lgPage.getPageTitle());
        lgPage.setUserName(reExcel.readExcel(1,1,".\\Data\\Data.xlsx","Sheet1"));
        lgPage.setPassword(reExcel.readExcel(1,2,".\\Data\\Data.xlsx","Sheet1"));
        lgPage.clickLoginButton();

        HomePage hmPage = new HomePage(driver);
        assertEquals(hmPage.getHomePageTitle(),reExcel.readExcel(1,3,".\\Data\\Data.xlsx","Sheet1"));
//        System.out.println(hmPage.getHomePageTitle());

        driver.close();
    }

}
