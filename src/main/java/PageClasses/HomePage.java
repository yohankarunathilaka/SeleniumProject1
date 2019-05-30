package PageClasses;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//html//body//div[2]//h2")
    WebElement homePageTitle;

    public HomePage (WebDriver driver){
        this.driver = driver;
        //this initElement method will create all elements
        PageFactory.initElements(driver,this);
    }

    public String getHomePageTitle (){
        return homePageTitle.getText();
    }
}
