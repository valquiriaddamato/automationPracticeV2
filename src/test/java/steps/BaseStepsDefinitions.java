package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseStepsDefinitions {

    public WebDriver browser;

    public BaseStepsDefinitions(){
        // Opening the browser
        System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        browser.manage().window().maximize();
    }

    @Given("^that I access the Automation practice page$")
    public void UrlBase(){
        browser.get("http://www.automationpractice.com/index.php");
        browser.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        if(browser != null)
            browser.close();
    }
}
