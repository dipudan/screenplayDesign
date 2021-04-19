package page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@class='form-control mobileNumberInput']")
    WebElement txtMobileLogin;
    @FindBy(xpath = "//div[@class='submitBottomOption']")
    WebElement btnSubmit;


    public void loginUsingMobileNumber(){
        txtMobileLogin.sendKeys("9447045529");
        btnSubmit.click();
    }

}
