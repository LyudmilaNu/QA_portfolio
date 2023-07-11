package homework.week6.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RobotaUaVacancyPage {

    private static final String BUTTON_APPLY = "//button[@class='primary-normal santa-block santa-typo-regular-bold']";
    WebDriver driver;

    public RobotaUaVacancyPage(WebDriver driver) {
        this.driver = driver;
    }
    public void switchToCurrentTab() {
        String currentTab = driver.getWindowHandle();
        for (String tab : driver.getWindowHandles()){
            if(!tab.equals(currentTab)){
                driver.switchTo().window(tab);
            }
        }
    }
    public void clickButtonApply() {
        driver.findElement(By.xpath(BUTTON_APPLY)).click();
    }

}
