package Java_POM_Selenium_TestNG.Domaci21.domaci21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
private By nameField = By.xpath("//input[@id='name']");
private By emailField= By.xpath("//input[@id='email']");
private By passwordField= By.xpath("//input[@id='password']");
private By confirmPasswordField= By.xpath("//input[@id='confirmPassword']");
private By signInBtn= By.xpath("//span[contains(text(), 'Sign Up')]");
private By errorMsg= By.xpath("//div[contains(text(),'Valid email is required')]");



    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);

    }


    public void enterName(String text){
        getDriver().findElement(nameField).sendKeys(text);
    }

    public void enterEmail(String text){
        getDriver().findElement(emailField).sendKeys(text);
    }

    public void enterPassword(String text){
        getDriver().findElement(passwordField).sendKeys(text);
    }
    public void enterConfirmPassword(String text){
        getDriver().findElement(confirmPasswordField).sendKeys(text);
    }
    public void clickLoginButton(){
        getDriver().findElement(signInBtn).click();
    }

    public void showErrorMsg(){
        getDriver().findElement(errorMsg).isDisplayed();

    }
    public void open() {
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");

    }


}
