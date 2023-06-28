package Java_POM_Selenium_TestNG.Domaci21.domaci21v3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    @FindBy(name="name")
    WebElement name;
    @FindBy(name="email")
    WebElement email;
    @FindBy(name="password")
    WebElement password;
    @FindBy(name="confirmpassword")
    WebElement confirmpassword;
    @FindBy(name="signInBtn")
    WebElement signInBtn;
    @FindBy(name="errorMsg")
     WebElement errorMsg;

public WebElement getName(){
    this.name=getDriver().findElement(By.xpath("//input[@id='name']"));
    return name;
}
    public WebElement getEmail(){
        this.email=getDriver().findElement(By.xpath("//input[@id='email']"));
        return email;
    }
    public WebElement getPassword(){
        this.password=getDriver().findElement(By.xpath("//input[@id='password']"));
        return password;
    }
    public WebElement getConfirmpassword(){
        this.confirmpassword=getDriver().findElement(By.xpath("//input[@id='confirmPassword']"));
        return confirmpassword;
    }
    public WebElement getSignInBtn(){
        this.signInBtn=getDriver().findElement(By.xpath("//span[contains(text(), 'Sign Up')]"));
        return signInBtn;
    }

    public WebElement getErrorMsg() {
        this.errorMsg=getDriver().findElement(By.xpath("//div[contains(text(),'Valid email is required')]"));
        return errorMsg;
    }

//    private By nameField = By.xpath("//input[@id='name']");
//    private By emailField= By.xpath("//input[@id='email']");
//    private By passwordField= By.xpath("//input[@id='password']");
//    private By confirmPasswordField= By.xpath("//input[@id='confirmPassword']");
//    private By signInBtn= By.xpath("//span[contains(text(), 'Sign Up')]");
//    private By errorMsg= By.xpath("//div[contains(text(),'Valid email is required')]");



    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(getDriver(), this);

    }


    public void enterName(String text){
        name.sendKeys(text);
    }

    public void enterEmail(String text){
        email.sendKeys(text);
    }

    public void enterPassword(String text){
        password.sendKeys(text);
    }
    public void enterConfirmPassword(String text){
        confirmpassword.sendKeys(text);
    }
    public void clickLoginButton(){
        signInBtn.click();
    }

    public void showErrorMsg(){
        errorMsg.isDisplayed();

    }
    public void open(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");

    }

}
