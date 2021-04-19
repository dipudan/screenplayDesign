package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='desktop-userTitle' and contains(text(),'Profile')]")
    private WebElement lblProfile;

    @FindBy(xpath = "//a[@class='desktop-linkButton' and contains(text(),'login / Signup')]")
    private WebElement lblLgnBtn;

    public void launchApplication(String sUrl){
        driver.get(sUrl);
    }

    public void navigateToLoginPage(){
        Actions mouseAction =  new Actions(driver);
        mouseAction.moveToElement(lblProfile).perform();
        lblLgnBtn.click();
    }
}
