package homework.week6.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeliveryCostPage {

    private static final String DELIVERY_RESULTS = "//div[@class='top results delivery-results']";
    WebDriver driver;
    public DeliveryCostPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getCost() {
        return driver.findElement(By.xpath(DELIVERY_RESULTS)).getText();
    }
}
