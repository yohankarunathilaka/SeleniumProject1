package PageClasses;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;


public class LoginPage {

    WebDriver driver;

    @FindBy(name="uid")
    WebElement guru99UserName;

    @FindBy(name="password")
    WebElement guru99Password;

    @FindBy(className="barone")
    WebElement guru99LoginPageTitle;

    @FindBy(name="btnLogin")
    WebElement btnLogin;

    public LoginPage (WebDriver driver){
        this.driver = driver;
        //this initElement method will create all elements
        PageFactory.initElements(driver,this);
    }

    public void setUserName (String strUserName){
        guru99UserName.sendKeys(strUserName);
    }

    public void setPassword (String strPassword){
        guru99Password.sendKeys(strPassword);
    }

    public String getPageTitle (){
        return guru99LoginPageTitle.getText();
    }

    public void clickLoginButton (){
        btnLogin.click();
    }

}

