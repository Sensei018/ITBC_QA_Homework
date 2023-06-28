package Java_POM_Selenium_TestNG.Domaci19;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Domaci19 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromeDriver\\chromeDriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        Faker faker = new Faker();
        String fullName = faker.name().fullName();
        String email = faker.internet().emailAddress();
        String currentAddress = faker.address().fullAddress();
        String permanentAddress = faker.address().fullAddress();


        WebElement fullNameInput = driver.findElement(By.cssSelector("input[id='userName']"));
        fullNameInput.sendKeys(fullName);

        WebElement emailInput = driver.findElement(By.cssSelector("input[id='userEmail']"));
        emailInput.sendKeys(email);

        WebElement currentAddressInput = driver.findElement(By.cssSelector("textarea[id='currentAddress']"));
        currentAddressInput.sendKeys(currentAddress);

        WebElement permanentAddressInput = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddressInput.sendKeys(permanentAddress);

        WebElement submitButton = driver.findElement(By.cssSelector("button[id='submit']"));
        submitButton.click();


        //WebElement output= driver.findElement(By.xpath("//div[@id='output']"));


        WebElement fullNameElement = driver.findElement(By.xpath("//p[@id='name']"));
        WebElement emailElement = driver.findElement(By.xpath("//p[@id='email']"));

        String fullNameTxt= fullNameElement.getText().trim();
        String emailElementTxt= emailElement.getText().trim();

        boolean isFullNameSame= fullNameTxt.substring(5).equals(fullName);
        boolean isEmailSame= emailElementTxt.substring(6).equals(email);

//        boolean isFullNameSame= fullNameTxt.equals(fullName);
//        boolean isEmailSame= emailElementTxt.equals(email);

        if (isFullNameSame && isEmailSame ) {

            System.out.println("Podaci se nisu promenili.");
        } else {
            System.out.println("Podaci su se promenili.");
        }

        driver.close();
    }
}
