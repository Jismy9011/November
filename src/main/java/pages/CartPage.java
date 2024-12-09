package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    By placeOrderButton = By.xpath("//button[contains(text(),'Place Order')]");
    By homeButton = By.xpath("");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void placeOrder() {
        driver.findElement(placeOrderButton).click();
    }

    public void goToHome() {
        driver.findElement(homeButton).click();
    }
}
