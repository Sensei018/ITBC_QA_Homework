package Java_POM_Selenium_TestNG.Domaci21.domaci21;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Tests extends BaseTest{

    @Test
    public void verifySignUpPage(){
        getLoginPage().open();
        getLoginPage().clickLoginButton();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/signup"));

    }

    @Test(dataProvider = "testDataProvider", priority = 10)
    public void verifyLoginPage(String name, String email, String password, String confirmPassword){
        getLoginPage().open();
        getLoginPage().enterName(name);
        getLoginPage().enterEmail(email);
        getLoginPage().enterPassword(password);
        getLoginPage().enterConfirmPassword(confirmPassword);
        getLoginPage().clickLoginButton();
    Assert.assertTrue(getDriver().findElement(By.xpath("//div[contains(text(),'Valid email is required')]")).isDisplayed());

    }
}
