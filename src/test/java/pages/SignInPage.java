package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage{

    public SignInPage(WebDriver browser) {
        super(browser);
    }

    public SignInPage clickOnSignIn(){
        //Click on 'Sign In'
        browser.findElement(By.linkText("Sign in")).click();

        return this;
    }

    public SignInPage emailSignInForm (String email){
        //Fill in the email form 'Create an account'
        browser.findElement(By.id("email_create")).sendKeys(email);

        return this;
    }

    public SignUpFormPage clickOnCreateAnAccount (){
        //Click the 'Create an account' button
        browser.findElement(By.id("SubmitCreate")).click();

        return new SignUpFormPage(browser);
    }

    public SignInPage emailLoginForm (String emailLogin){
        //Fill in the email form Already registered
        browser.findElement(By.id("email")).sendKeys(emailLogin);

        return this;
    }

    public SignInPage passwordLoginForm (String passwordLogin){
        //Fill in the password form Already registered
        browser.findElement(By.id("passwd")).sendKeys(passwordLogin);

        return this;
    }

    public MyAccountPage clickOnSignInFormLogin (){
        //Click click the 'Sign In' button
        browser.findElement(By.id("SubmitLogin")).click();

        return new MyAccountPage(browser);
    }
}
