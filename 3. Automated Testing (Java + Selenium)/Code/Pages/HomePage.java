package homework.week6.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private static final String TIMETABLE = ".timetable";
    private static final String COST_OF_DELIVERY = ".cost";
    private static final String ALL_VACANCIES_LIST = "a[href='https://novaposhta.ua/all_jobs']";
    WebDriver driver;
    WebDriverWait wait;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public void clickTimetable() {
        driver.findElement(By.cssSelector(TIMETABLE)).click();
    }
    public void openDeliveryCalculation() {
        driver.findElement(By.cssSelector(COST_OF_DELIVERY)).click();
    }
    public void openVacanciesPage() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(ALL_VACANCIES_LIST))).click();
    }
}
