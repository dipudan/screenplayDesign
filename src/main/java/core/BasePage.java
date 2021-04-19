package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {

    protected static ThreadLocal<ChromeDriver> driver=new ThreadLocal<ChromeDriver>();


    @BeforeMethod
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","S:\\dependencies\\chromedriver.exe");
        driver.set(new ChromeDriver());
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get().manage().window().maximize();
        driver.get().get("https://www.myntra.com");
    }

    protected WebDriver getDriver() {return driver.get();}



    @AfterMethod
    public void closeBrowser(){
        driver.get().close();
        driver = null;
    }

}
