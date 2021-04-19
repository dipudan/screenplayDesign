package core;

import org.openqa.selenium.WebDriver;
import page.HomePage;
import page.LoginPage;
import page.OtpPage;

public class User{

    public HomePage objHomePage;
    public LoginPage objLoginPage;
    public OtpPage objOtpPage;
    public BasePage objBasePage;

    public User(WebDriver driver){
        objHomePage= new HomePage(driver);
        objLoginPage= new LoginPage(driver);
        objOtpPage= new OtpPage(driver);
    }
    public User LaunchApplication(String sUrl){
        objHomePage.launchApplication(sUrl);
        return this;
    }
    public User NavigateToLoginPage(){
        objHomePage.navigateToLoginPage();
        return this;
    }
    public User LoginUsingMobileNumber(){
        objLoginPage.loginUsingMobileNumber();
        return this;
    }
    public User VerifyOtpPage(){
        objOtpPage.verifyOtpPage();
        return this;
    }
}
