package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CheckoutPage;

import java.util.Map;

public class CheckoutStepsDefinitions {

    private BaseStepsDefinitions context;
    private WebDriver browser;
    private CheckoutPage checkoutPage;

    public CheckoutStepsDefinitions(BaseStepsDefinitions context) {
        this.context = context;
        browser = this.context.browser;
        checkoutPage = new CheckoutPage(browser);
    }

    @When("^I completed the order with pay by bank wire$")
    public void completedOrderPayBankWire(DataTable dataTable){
        Map<String, String> map = dataTable.asMap(String.class, String.class);

        checkoutPage.clickOnProceedToCheckoutSummaryPage();
        checkoutPage.selectAddress(map.get("address"));
        checkoutPage.selectSameDeliveryAddress();
        checkoutPage.commentDelivery(map.get("commentDelivery"));
        checkoutPage.clickOnProceedToCheckoutButtonAddressPage();
        checkoutPage.selectShipping();
        checkoutPage.selectTermsAndConditions();
        checkoutPage.clickOnProceedToCheckoutButton();
        checkoutPage.clickOnPayByBankWire();
        checkoutPage.clickCompletedOrder();
    }

    @Then("^should I view the confirm order page with the following message (.*)$")
    public void confirmedOrder(String messageConfirmed){
        checkoutPage.orderConfirmed(messageConfirmed);
    }
}
