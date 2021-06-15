package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.MyAccountPage;

public class MyAccountStepsDefinitions {
    private BaseStepsDefinitions context;
    private WebDriver browser;
    private MyAccountPage myAccountPage;

    public MyAccountStepsDefinitions(BaseStepsDefinitions context) {
        this.context = context;
        browser = this.context.browser;
        myAccountPage = new MyAccountPage(browser);
    }

    @Then("^should I view the page name (.*) in the My account page$")
    public void nameMyAccountPage(String namePage){
        myAccountPage.captureMyAccountPage(namePage);
    }

    @Then("^should I view the name (.*) in the user logged in$")
    public void nameUser(String userName){
        myAccountPage.captureUsername(userName);
    }
}
