import core.BasePage;
import core.User;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class LoginTest extends BasePage {

    public WebDriver driver;

    @Test
    public void LoginTest(){

        User AsUser = new User(getDriver());

        AsUser.NavigateToLoginPage().
                LoginUsingMobileNumber().
                VerifyOtpPage();
    }

    @Test
    public void LoginTest2(){

        User AsUser = new User(getDriver());

        AsUser.NavigateToLoginPage().
                LoginUsingMobileNumber().
                VerifyOtpPage();
    }

  /*      @Test
    public void LoginTest(){

            System.setProperty("webdriver.chrome.driver","S:\\dependencies\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.manage().window().maximize();
            driver.get("https://www.myntra.com/");

            WebElement lblProfile = driver.findElement(
                    By.xpath("//span[@class='desktop-userTitle' and contains(text(),'Profile')]"));

            Actions mouseAction =  new Actions(driver);
            mouseAction.moveToElement(lblProfile).perform();
    }*/
}
