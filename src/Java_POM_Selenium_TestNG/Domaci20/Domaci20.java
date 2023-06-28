package Java_POM_Selenium_TestNG.Domaci20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Domaci20 {

//    WebDriver driver;
//    WebDriverWait wait;
//
//    @BeforeClass
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromeDriver\\chromeDriver.exe");
//        driver = new ChromeDriver();
//
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    }

    @BeforeMethod
    public void beforeEachTest() throws InterruptedException {
        driver.get("https://vue-demo.daniel-avellaneda.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

//    @Test(priority = 0)
//    public void verifySignContain() throws InterruptedException {
//        WebElement signUpBtn = driver.findElement(By.xpath("//a[@href='/signup']"));
//        signUpBtn.click();
//        Thread.sleep(2000);
//        Assert.assertTrue(driver.getCurrentUrl().contains("/signup"));
//        Thread.sleep(2000);

        WebElement atributContainEmail= driver.findElement(By.xpath("//input[contains(@type,'email')]"));
        String atributTXT= atributContainEmail.getAttribute("type");
        Thread.sleep(2000);

        String expectedEmail= "email";
        Assert.assertEquals(atributTXT,expectedEmail);

        WebElement atributContainPass= driver.findElement(By.xpath("//input[contains(@type,'password')]"));
        String atributPassTxt= atributContainPass.getAttribute("type");
        Thread.sleep(2000);

        String expectedPass= "password";
        Assert.assertEquals(atributPassTxt,expectedPass);
    }



    @Test
    public void noInputs() throws InterruptedException {
        WebElement signUpBtn = driver.findElement(By.xpath("//a[@href='/signup']"));
        signUpBtn.click();
        Thread.sleep(1000);
        WebElement signMeUpBtn= driver.findElement(By.xpath("//button[@type='submit']"));
        signMeUpBtn.click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='v-messages__message']"))));
        WebElement errorMsg= driver.findElement(By.xpath("//div[@class='v-messages__message']"));
        String expectedMsg= "This field is required";
        errorMsg.isDisplayed();
        Assert.assertEquals(errorMsg.getText(),expectedMsg);

        }


    @DataProvider (name = "testDataProvider")
    public Object[][] testData() {
        return new Object[][]{
                {" ", "sdfscom@", "123", "123"}, {"1 ", "iaefcafg.", "32432", "12"}, {" a", "a@.grt.", "a1fsd2f", " "}, {" Nikola", "adf@mail./com", "32323", "3232352"}

        };
    }


    @Test(dataProvider = "testDataProvider")
    public void otherInputs(String name,String email, String password, String confirmPass) throws InterruptedException {

        WebElement signUpBtn = driver.findElement(By.xpath("//a[@href='/signup']"));
        signUpBtn.click();
        Thread.sleep(1000);

        WebElement nameField = driver.findElement(By.xpath("//input[@name='name']"));
        nameField.isSelected();
        nameField.sendKeys(name);

        WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
        emailField.isSelected();
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.isSelected();
        passwordField.sendKeys(password);

        WebElement confirmPassword = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
        confirmPassword.isSelected();
        confirmPassword.sendKeys(confirmPass);


        WebElement signMeUpBtn= driver.findElement(By.xpath("//button[@type='submit']"));
        signMeUpBtn.click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(),'Valid email is required')]"))));
        Thread.sleep(1000);
        WebElement errorMsg= driver.findElement(By.xpath("//div[contains(text(),'Valid email is required')]"));
        String expectedMsg= "Valid email is required";
        errorMsg.isDisplayed();
        Assert.assertEquals(errorMsg.getText(),expectedMsg);

    }
    @AfterClass
    public void cleanUp() {
        driver.close();
    }

}
