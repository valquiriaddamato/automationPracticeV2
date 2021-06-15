package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.CartPage;

public class CartPageStepsDefinitions {

    private BaseStepsDefinitions context;
    private WebDriver browser;
    private CartPage cartPage;

    public CartPageStepsDefinitions(BaseStepsDefinitions context) {
        this.context = context;
        browser = this.context.browser;
        cartPage = new CartPage(browser);
    }

    @And("^I select the quantity (.*), size (.*) and color (.*)$")
    public void selectConf(String quantity, String size, String color){
        cartPage.selectQuantity(quantity);
        cartPage.selectSize(size);
        cartPage.selectColor(color);
    }

    @And("^I add to cart$")
    public void addItemCart(){
        cartPage.clickOnAddItemCart();
    }

    @Then("^should I view the confirm page with a icon$")
    public void iconConfirmPage(){
        cartPage.checkIconConfirm();
    }

    @And("^I click in Continue Shopping")
    public void continueShopping(){
        cartPage.clickOnContinueShopping();
    }

    @And("^I click in Proceed to checkout Link$")
    public void checkItemToCart(){
        cartPage.clickOnProceedToCheckoutLink();
    }

    @Then("^should I view the cart page (.*)$")
    public void nameCartPage(String nameCartPage){
        cartPage.checkCartPage(nameCartPage);
    }
}
