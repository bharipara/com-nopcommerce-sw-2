package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){

            //click on Computers tab
            driver.findElement(By.xpath("//a[text() ='Computers '][1]")).click();
            String expectedMessage = "Computers";
            WebElement actualTextElement = driver.findElement(By.xpath("//h1[text() ='Computers']"));
            String actualMessage = actualTextElement.getText();
            Assert.assertEquals("Verify computers text displayed", expectedMessage,actualMessage);

        }
        @Test
        public void userShouldNavigateToElectronicsPageSuccessfully(){
            //click on Electronics tab
            driver.findElement(By.xpath("//a[text() = 'Electronics '][1]")).click();
            String expectedMessage = "Electronics";
            WebElement actualTextElement = driver.findElement(By.xpath("//h1[text() ='Electronics']"));
            String actualMessage = actualTextElement.getText();
            Assert.assertEquals("Verify Electronics text displayed", expectedMessage,actualMessage);


        }
        @Test
        public void userShouldNavigateToApparelPageSuccessfully(){
            //click on Apparel tab
            driver.findElement(By.xpath("//a[text()='Apparel '][1]")).click();
            String expectedMessage = "Apparel";
            WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Apparel']"));
            String actualMessage = actualTextElement.getText();
            Assert.assertEquals("Verify Apparel text displayed", expectedMessage,actualMessage);


        }
        @Test
        public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
            //click on Digital downloads tab
            driver.findElement(By.xpath("//a[text() ='Digital downloads '][1]")).click();
            String expectedMessage = "Digital downloads";
            WebElement actualTextElement = driver.findElement(By.xpath("//h1[text() = 'Digital downloads']"));
            String actualMessage = actualTextElement.getText();
            Assert.assertEquals("Verify Digital downloads text displayed", expectedMessage,actualMessage);


        }
        @Test
        public void userShouldNavigateToBooksPageSuccessfully(){
            //click on books tab
            driver.findElement(By.xpath("//a[text() ='Books '][1]")).click();
            String expectedMessage = "Books";
            WebElement actualTextElement = driver.findElement(By.xpath("//h1[text() ='Books']"));
            String actualMessage = actualTextElement.getText();
            Assert.assertEquals("Verify Digital downloads text displayed", expectedMessage,actualMessage);


        }
        public void userShouldNavigateToJewelryPageSuccessfully(){
            //click on Jewelry tab
            driver.findElement(By.xpath("//a[text() ='Jewelry '][1]")).click();
            String expectedMessage = "Jewelry";
            WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Jewelry']"));
            String actualMessage = actualTextElement.getText();
            Assert.assertEquals("Verify Digital downloads text displayed", expectedMessage,actualMessage);


        }
        @Test
        public void userShouldNavigateToGiftCardsPageSuccessfully(){
            //click on Gift cards tab
            driver.findElement(By.xpath("//a[text()='Gift Cards '][1]")).click();
            String expectedMessage = "Gift Cards";
            WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Gift Cards']"));
            String actualMessage = actualTextElement.getText();
            Assert.assertEquals("Verify Digital downloads text displayed", expectedMessage,actualMessage);


        }

    }
