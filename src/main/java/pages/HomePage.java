package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By heading = By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[1]/div[1]/a/picture/img");
    By mobilesOption = By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[2]/div/div/div/div/img");

    public HomePage( WebDriver driver) {
        this.driver = driver;
    }

    public String getHeading() {
        return driver.findElement(heading).getText();
    }

    public void clickMobiles() {
        driver.findElement(mobilesOption).click();
    }
}

