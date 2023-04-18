package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //find login link and click on login link
        WebElement loginLink = driver.findElement(By.xpath("//a[@class='ico-login'] "));
        loginLink.click();
        String expectedMessage = "Welcome, Please Sign In!";
        WebElement actualTestElement = driver.findElement(By.xpath("//h1[(text()='Welcome, Please Sign In!')] "));
        String actualMessage = actualTestElement.getText();
        Assert.assertEquals("Not redirected to login page",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //find login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // find the email field element and type email
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Prime123@gmail.com");

        // find the password field element and type the password
        driver.findElement(By.name("Password")).sendKeys("Prime123");

        //Find the Login btn Element and click
        WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginBtn.click();
        String expectedMessage = "Log Out";
        driver.quit();


    }
    @Test
    public void verifyTheErrorMessage(){
        //Find login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Find the Email Field Element
        WebElement emailField = driver.findElement(By.id("Email"));
        // Type the Email address to email field element
        emailField.sendKeys("prime12@gmail.com");
        //Find the Password Field Element and send password on password field
        driver.findElement(By.name("Password")).sendKeys("Prime123");
        //Find the Login btn Element and click
        WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginBtn.click();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class ='message-error validation-summary-errors']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Error message not displayed", expectedMessage, actualMessage);
    }
    public void tearDown(){
        closeBrowser();
    }


}
