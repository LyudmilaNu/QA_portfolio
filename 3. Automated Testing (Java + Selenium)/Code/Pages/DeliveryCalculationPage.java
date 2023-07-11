package homework.week6.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeliveryCalculationPage {

    private static final String SENDER_CITY_DROPDOWN = "#DeliveryForm_senderCity";
    private static final String KYIV = "(//ul[@id='delivery_sender_cities']/li)[4]";
    private static final String RECIPIENT_CITY_DROPDOWN = "#DeliveryForm_recipientCity";
    private static final String MYKOLAYIV = "(//ul[@id='delivery_recipient_cities']/li)[7]";
    private static final String TYPE_OF_PACKAGE_DROPDOWN = "//div[@class='option_select']";
    private static final String DOCUMENTS = "(//div[@class='dropdown']//li)[3]";
    private static final String BUTTON_SUBMIT = "//input[@class='btn submit']";
    WebDriver driver;

    public DeliveryCalculationPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickSenderCityDropdown() {
        driver.findElement(By.cssSelector(SENDER_CITY_DROPDOWN)).click();
    }
    public void clickKyiv() {
        driver.findElement(By.xpath(KYIV)).click();
    }
    public void clickRecipientCityDropdown() {
        driver.findElement(By.cssSelector(RECIPIENT_CITY_DROPDOWN)).click();
    }
    public void clickMykolayiv() {
        driver.findElement(By.xpath(MYKOLAYIV)).click();
    }
    public void clickTypeOfPackage() {
        driver.findElement(By.xpath(TYPE_OF_PACKAGE_DROPDOWN)).click();
    }
    public void chooseDocumentsInTheDropdown() {
        driver.findElement(By.xpath(DOCUMENTS)).click();
    }
    public void clickButtonSubmit() {
        driver.findElement(By.xpath(BUTTON_SUBMIT)).click();
    }

}
