package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OtpPage extends BasePage {

    private WebDriver driver;

    public OtpPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[contains(text(),'Verify with OTP')]")
    WebElement lblVerifyOtp;

    public void verifyOtpPage(){
        Assert.assertTrue(lblVerifyOtp.isDisplayed());
    }
}
