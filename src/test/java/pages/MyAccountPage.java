package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver browser) {
        super(browser);
    }

    public MyAccountPage captureMyAccountPage(String nameMyAccountPage){
        //Capture my account page
        String getNameMyAccountPage = browser.findElement(By.xpath("//div[@class=\"columns-container\"]/div/div[3]/div[@id=\"center_column\"]/h1")).getText();
        assertEquals(nameMyAccountPage, getNameMyAccountPage);

        return this;
    }
}