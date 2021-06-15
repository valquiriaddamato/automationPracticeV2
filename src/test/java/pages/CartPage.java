package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertTrue;

public class CartPage extends BasePage {

    public CartPage(WebDriver browser) {
        super(browser);
    }

    public CartPage selectQuantity(String quantity) {
        browser.findElement(By.id("quantity_wanted")).clear();
        browser.findElement(By.id("quantity_wanted")).sendKeys(quantity);

        return this;
    }

    public CartPage selectSize(String size) {
        WebElement selectSizes = browser.findElement(By.id("group_1"));
        new Select(selectSizes).selectByVisibleText(size);

        return this;
    }

    public CartPage selectColor(String color) {
        browser.findElement(By.name(color)).click();

        return this;
    }

    public CartPage clickOnAddItemCart() {
        browser.findElement(By.xpath("//p[@id=\"add_to_cart\"]/button")).click();

        return this;
    }

    public CartPage checkIconConfirm() {
        browser.findElement(By.className("icon-ok")).isDisplayed();

        return this;
    }

    public CartPage clickOnContinueShopping(){
        browser.findElement(By.xpath("//div[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")).click();

        return this;
    }

    public CartPage clickOnProceedToCheckoutLink() {
        browser.findElement(By.xpath("//div[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a[@title=\"Proceed to checkout\"]")).click();

        return this;
    }

    public CartPage checkCartPage(String nameCartPage) {
        String getNameCartPage = browser.findElement(By.id("cart_title")).getText();
        assertTrue("Cart Page", getNameCartPage.contains(nameCartPage));

        return this;
    }
}