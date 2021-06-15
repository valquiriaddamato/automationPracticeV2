package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class SignUpFormPage extends BasePage{

    public SignUpFormPage(WebDriver browser) {
        super(browser);
    }

    public SignUpFormPage selectTitle(){
        //Select title
        browser.findElement(By.id("id_gender2")).click();

        return this;
    }

    public SignUpFormPage firstName(String firstName){
        //Fill in first name
        browser.findElement(By.id("customer_firstname")).sendKeys(firstName);

        return this;
    }

    public SignUpFormPage lastName(String lastName){
        //Fill in last name
        browser.findElement(By.id("customer_lastname")).sendKeys(lastName);

        return this;
    }

    public SignUpFormPage checkEmailFilled(String emailFilled){
        //Checks if the email has already been filled
        String validEmail = browser.findElement(By.id("email")).getAttribute("value");
        assertEquals(emailFilled, validEmail);

        return this;
    }

    public SignUpFormPage password(String password){
        //Fill in password
        browser.findElement(By.id("passwd")).sendKeys(password);

        return this;
    }

    public SignUpFormPage dayOfBirth(String day){
        //Select day of birth
        WebElement selectDays = browser.findElement(By.id("days"));
        new Select(selectDays).selectByValue(day);

        return this;
    }

    public SignUpFormPage monthOfBirth(String month){
        //Select month of birth
        WebElement selectMonth = browser.findElement(By.id("months"));
        new Select(selectMonth).selectByValue(month);

        return this;
    }

    public SignUpFormPage YearOfBirth(String year){
        //Select year of birth
        WebElement selectYear = browser.findElement(By.id("years"));
        new Select(selectYear).selectByValue(year);

        return this;
    }

    public SignUpFormPage selectNewsletter(){
        //Select newsletter
        browser.findElement(By.id("newsletter")).click();

        return this;
    }

    public SignUpFormPage firstNameAddress(String firstNameAddress){
        //Fill in first name address
        browser.findElement(By.id("firstname")).clear();
        browser.findElement(By.id("firstname")).sendKeys(firstNameAddress);

        return this;
    }

    public SignUpFormPage lastNameAddress(String lastNameAddress){
        //Fill in last name address
        browser.findElement(By.id("lastname")).clear();
        browser.findElement(By.id("lastname")).sendKeys(lastNameAddress);

        return this;
    }

    public SignUpFormPage companyName(String company){
        //Fill in company name
        browser.findElement(By.id("company")).sendKeys(company);

        return this;
    }

    public SignUpFormPage address(String address){
        //Fill in address
        browser.findElement(By.id("address1")).sendKeys(address);

        return this;
    }

    public SignUpFormPage city(String city){
        //Fill in city
        browser.findElement(By.id("city")).sendKeys(city);

        return this;
    }

    public SignUpFormPage state(String state){
        //Select state
        WebElement selectState = browser.findElement(By.id("id_state"));
        new Select(selectState).selectByVisibleText(state);

        return this;
    }

    public SignUpFormPage postalCode(String postalCode){
        //Fill in postal code
        browser.findElement(By.id("postcode")).sendKeys(postalCode);

        return this;
    }

    public SignUpFormPage country(String country){
        //Select country
        WebElement selectCountry = browser.findElement(By.id("id_country"));
        new Select(selectCountry).selectByVisibleText(country);

        return this;
    }

    public SignUpFormPage mobilePhone(String mobilePhone){
        //Fill in mobile phone
        browser.findElement(By.id("phone_mobile")).sendKeys(mobilePhone);

        return this;
    }

    public SignUpFormPage addressAlias(String addressAlias){
        //Fill an address alias
        browser.findElement(By.id("alias")).clear();
        browser.findElement(By.id("alias")).sendKeys(addressAlias);

        return this;
    }

    public MyAccountPage clickOnRegister(){
        //Click the 'Register' button
        browser.findElement(By.id("submitAccount")).click();

        return new MyAccountPage(browser);
    }
}
