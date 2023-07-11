package homework.week6.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PostOfficeByNumbOrAddressPage {
    private static final String CITY_DROPDOWN = "#oCityFilter";
    private static final String KYIV = "(//ul[@class='list drop-down-ul map']//li)[1]";
    private static final String WAREHOUSE_DROPDOWN = "#oWarehouseFilter";
    private static final String MOVING_TO_WAREHOUSE_52 = "//li[@data-warehouse-ref='5a39e5ac-e1c2-11e3-8c4a-0050568002cf']";
    private static final String WAREHOUSE_52_IN_A_DROPDOWN = "//li[@data-warehouse-ref='5a39e5ac-e1c2-11e3-8c4a-0050568002cf']";
    private static final String WAREHOUSE_52_IN_THE_LIST = "a[href='/office/view/id/52/city/Київ']";
    WebDriver driver;

    public PostOfficeByNumbOrAddressPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickCityFilter() {
        driver.findElement(By.cssSelector(CITY_DROPDOWN)).click();
    }
    public void clickKyiv() {
        driver.findElement(By.xpath(KYIV)).click();
    }
    public void clickWarehouse() {
        driver.findElement(By.cssSelector(WAREHOUSE_DROPDOWN)).click();
    }
    public void movingToNumOfWarehouse() {
        WebElement num = driver.findElement(By.xpath(MOVING_TO_WAREHOUSE_52));
        Actions action = new Actions (driver);
        action.moveToElement(num);
        action.perform(); //for FireFox has to be commented
    }
    public void clickWarehouseNum() {
        driver.findElement(By.xpath(WAREHOUSE_52_IN_A_DROPDOWN)).click();
    }
    public void clickWarehouseInTheList() {
        driver.findElement(By.cssSelector(WAREHOUSE_52_IN_THE_LIST)).click();
    }
}
