package homework.week6.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VacancyPage {
    private static final String BUTTON_APPLY = "//a[@class='vac_links_apply']";
    WebDriver driver;
    public VacancyPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickButtonApply() {
        driver.findElement(By.xpath(BUTTON_APPLY)).click();
    }

}
