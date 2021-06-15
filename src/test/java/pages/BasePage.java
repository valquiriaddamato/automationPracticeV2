package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;

public class BasePage{
    protected WebDriver browser;

    public BasePage(WebDriver browser){
        this.browser = browser;
    }

    public BasePage captureUsername(String userName){
        //Capture username
        String getUserName = browser.findElement(By.xpath("//div[@class=\"header_user_info\"]/a[@class=\"account\"]")).getText();
        assertEquals(userName, getUserName);

        return this;
    }
}
