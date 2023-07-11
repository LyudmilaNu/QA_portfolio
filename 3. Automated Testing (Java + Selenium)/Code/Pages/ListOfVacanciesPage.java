package homework.week6.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListOfVacanciesPage {
    private static final String VIEW_VACANCY = "//*[@id='GridView1_ctl02_btnViewVacancy']";
    private static final String IFRAME = "RUAFRAME";
    WebDriver driver;
    public ListOfVacanciesPage(WebDriver driver) {
        this.driver = driver;
    }
    public void openVacancy() {
        driver.switchTo().frame(IFRAME);
        driver.findElement(By.xpath(VIEW_VACANCY)).click();
    }

}
