package homework.week6.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostOfficePage {
    private static final String POST_OFFICE_PAGE = "//div[@class='text']";
    WebDriver driver;

    public PostOfficePage(WebDriver driver) {
        this.driver = driver;
    }
    public String getAddress() {
        return driver.findElement(By.xpath(POST_OFFICE_PAGE)).getText();
    }
    public String getTypeOfWarehouse() {
        return driver.findElement(By.xpath(POST_OFFICE_PAGE)).getText();
    }
    public String getWeight() {
        return driver.findElement(By.xpath(POST_OFFICE_PAGE)).getText();
    }
}
