package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver browser) {
        super(browser);
    }

    public SearchPage searchItem(String item){
        browser.findElement(By.id("search_query_top")).clear();
        browser.findElement(By.id("search_query_top")).sendKeys(item);

        return this;
    }

    public SearchPage clickOnSearch(){
        browser.findElement(By.name("submit_search")).click();

        return this;
    }

    public SearchPage returnItem(String item){
        String getItem = browser.findElement(By.linkText(item)).getText();
        assertEquals(item, getItem);

        return this;
    }

    public SearchPage clickOnImageViewMore(){
        browser.findElement(By.className("product_img_link")).click();

        return this;
    }

    public SearchPage informationItem(String nameInformationItem){
        String getInformationItem = browser.findElement(By.xpath("//div[@id=\"center_column\"]/div/div/div[3]/h1\n")).getText();
        assertEquals(nameInformationItem, getInformationItem);

        return this;
    }
}