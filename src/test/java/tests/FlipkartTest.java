package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.HomePage;
import pages.MobilePage;

public class FlipkartTest {
     WebDriver driver;

    @BeforeClass
    public void setup() {
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void flipkartWorkflow() throws InterruptedException {
        // Step 1: Verify the heading
        HomePage homePage = new HomePage(driver);
        String heading = homePage.getHeading();
        Assert.assertTrue(heading.contains("Explore"), "Heading does not match!");

        homePage.clickMobiles();
        Thread.sleep(2000);

        // Step 3: Select a mobile and add to cart
        MobilePage mobilePage = new MobilePage(driver);
        mobilePage.selectFirstMobile();
        Thread.sleep(2000);
        mobilePage.addToCart();
        mobilePage.takeScreenshot("Screenshot.png");

        // Step 4: Place order
        CartPage cartPage = new CartPage(driver);
        cartPage.placeOrder();

        // Step 5: Go back to home
        cartPage.goToHome();
    }

   
}

