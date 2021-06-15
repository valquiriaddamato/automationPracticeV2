package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.SignUpFormPage;

import java.util.Map;

public class SignUpFormStepsDefinitions{

    private BaseStepsDefinitions context;
    private WebDriver browser;
    private SignUpFormPage signUpFormPage;
    private SignInStepsDefinitions emailRandom;

    public SignUpFormStepsDefinitions(BaseStepsDefinitions context) {
        this.context = context;
        browser = this.context.browser;
        signUpFormPage = new SignUpFormPage(browser);
    }

    @When("^I fill in the requested data of my user and then finish the registration$")
    public void registerCustomer(DataTable dataTable){
        Map<String, String> map = dataTable.asMap(String.class, String.class);

        String emailField = emailRandom.email;
        signUpFormPage.selectTitle();
        signUpFormPage.firstName(map.get("firstName"));
        signUpFormPage.lastName(map.get("lastName"));
        signUpFormPage.checkEmailFilled(emailField);
        signUpFormPage.password(map.get("password"));
        signUpFormPage.dayOfBirth(map.get("day"));
        signUpFormPage.monthOfBirth(map.get("month"));
        signUpFormPage.YearOfBirth(map.get("year"));
        signUpFormPage.selectNewsletter();
        signUpFormPage.firstNameAddress(map.get("firstNameAddress"));
        signUpFormPage.lastNameAddress(map.get("lastNameAddress"));
        signUpFormPage.companyName(map.get("company"));
        signUpFormPage.address(map.get("address"));
        signUpFormPage.city(map.get("city"));
        signUpFormPage.state(map.get("state"));
        signUpFormPage.postalCode(map.get("postalCode"));
        signUpFormPage.country(map.get("country"));
        signUpFormPage.mobilePhone(map.get("mobilePhone"));
        signUpFormPage.addressAlias(map.get("addressAlias"));
        signUpFormPage.clickOnRegister();
    }
}
