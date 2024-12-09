package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.nio.file.Files;

public class MobilePage {
    ChromeDriver driver;

    By firstMobile = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[2]");
    By addToCartButton = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button");

    public MobilePage(WebDriver driver) {
        this.driver = (ChromeDriver) driver;
    }

    public void selectFirstMobile() {
        driver.findElement(firstMobile).click();
    }

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void takeScreenshot(String filePath) {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screenshot.toPath(), new File(filePath).toPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
