package Java_POM_Selenium_TestNG.Domaci21.domaci21v3;

import domaci21.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private LoginPage loginPage;


    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C://Users//P//Desktop//chromedriver.exe");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        loginPage = new LoginPage(driver, wait);
        driver.get("https://vue-demo.daniel-avellaneda.com");
        driver.manage().window().maximize();

    }

    @DataProvider(name = "testDataProvider")
    public Object[][] testData() {
        return new Object[][]{
                {" ", "sdfscom@", "123", "123"}, {"1 ", "iaefcafg.", "32432", "12"}, {" a", "a@.grt.", "a1fsd2f", " "},
                {" Nikola", "adf@mail./com", "32323", "3232352"}

        };
    }



    public WebDriver getDriver() {
        return this.driver;
    }

    public void setWait(WebDriverWait wait) {
        this.wait = wait;
    }

    public LoginPage getLoginPage() {
        return this.loginPage;
    }
}
