package steps;

import generations.EmailCreate;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.SignInPage;

public class SignInStepsDefinitions {

    private BaseStepsDefinitions context;
    private WebDriver browser;
    private SignInPage signInPage;
    private EmailCreate emailRandom;
    public static String email;

    public SignInStepsDefinitions(BaseStepsDefinitions context) {
        this.context = context;
        browser = this.context.browser;
        signInPage = new SignInPage(browser);
    }

    @When("^I click in Sign In Link$")
    public void clickOnSignInLink(){
        signInPage.clickOnSignIn();
    }

    @When("^I login with the email (.*) and password (.*)$")
    public void login(String email, String password){
        signInPage.emailLoginForm(email);
        signInPage.passwordLoginForm(password);
        signInPage.clickOnSignInFormLogin();
    }

    @When("^I fill in the email and then confirm the start of registration$")
    public void startRegistration(){
        emailRandom = new EmailCreate();
        email = emailRandom.emailCreate();
        signInPage.emailSignInForm(email);
        signInPage.clickOnCreateAnAccount();
    }
}
