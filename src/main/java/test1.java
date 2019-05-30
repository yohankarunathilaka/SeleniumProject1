import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {

    public static void main (String[] args){

        System.setProperty("webdriver.gecko.driver","C:\\apache_maven\\gecko_driver\\geckodriver.exe");
        WebDriver obj = new FirefoxDriver();
        obj.get("https://www.google.com");
        obj.close();

    }
}
