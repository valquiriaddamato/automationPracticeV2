package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertTrue;

public class CheckoutPage extends BasePage{

    public CheckoutPage(WebDriver browser) {
        super(browser);
    }

    public CheckoutPage clickOnProceedToCheckoutSummaryPage(){
        browser.findElement(By.xpath("//div[@id=\"center_column\"]/p[2]/a[1]")).click();

        return this;
    }

    public CheckoutPage selectAddress(String nameAddress){
        WebElement selectAddressOption = browser.findElement(By.id("id_address_delivery"));
        new Select(selectAddressOption).selectByVisibleText(nameAddress);

        return this;
    }

    public CheckoutPage selectSameDeliveryAddress(){
        Boolean select = browser.findElement(By.id("addressesAreEquals")).isSelected();
        if(!select){
            browser.findElement(By.id("addressesAreEquals")).click();
        }

        return this;
    }

    public CheckoutPage commentDelivery(String comment){
        browser.findElement(By.xpath("//div[@id=\"ordermsg\"]/textarea")).sendKeys(comment);

        return this;
    }

    public CheckoutPage clickOnProceedToCheckoutButtonAddressPage(){
        browser.findElement(By.xpath("//div[@id=\"center_column\"]/form/p/button")).click();

        return this;
    }

    public CheckoutPage selectShipping(){
        browser.findElement(By.className("delivery_option_radio")).click();

        return this;
    }

    public CheckoutPage selectTermsAndConditions(){
        Boolean select = browser.findElement(By.id("cgv")).isSelected();
        if(!select){
            browser.findElement(By.id("cgv")).click();
        }

        return this;
    }

    public CheckoutPage clickOnProceedToCheckoutButton(){
        browser.findElement(By.xpath("//form[@id=\"form\"]/p/button")).click();

        return this;
    }

    public CheckoutPage clickOnPayByBankWire(){
        browser.findElement(By.xpath("//div[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();

        return this;
    }

    public CheckoutPage clickCompletedOrder(){
        browser.findElement(By.xpath("//p[@id=\"cart_navigation\"]/button")).click();

        return this;
    }

    public CheckoutPage orderConfirmed(String messageOrderConfirmed){
        String getmessageOrderConfirmed = browser.findElement(By.className("cheque-indent")).getText();
        assertTrue("Order Confirmed", getmessageOrderConfirmed.contains(messageOrderConfirmed));

        return this;
    }
}