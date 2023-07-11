package homework.week6.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RobotaUaVacancyApplyPage {
    private static final String UPLOAD_RESUME = "//input[@class='santa-opacity-0 santa-absolute santa-top-0 santa-left-0 santa-w-0 santa-h-0 santa-outline-none santa-appearance-none santa-border-0']";
    private static final String INPUT_NAME = "//*//div[1]/santa-input/div/input";
    private static final String INPUT_EMAIL = "//*//div[2]/santa-input/div/input";
    private static final String APPLY_PAGE = "//div[@class = 'santa-bg-white santa-p-20 760:santa-p-40 760:santa-rounded-5']";
    WebDriver driver;
    public RobotaUaVacancyApplyPage(WebDriver driver) {
        this.driver = driver;
    }
    public void uploadFile() {
        driver.findElement(By.xpath(UPLOAD_RESUME)).sendKeys("C:\\Users\\lucyb\\Desktop\\resume.txt");
    }
    public void typeNameAndLastName(String nameAndLastName) {
        driver.findElement(By.xpath(INPUT_NAME)).sendKeys(nameAndLastName);
    }
    public void typeEmail(String email) {
        driver.findElement(By.xpath(INPUT_EMAIL)).sendKeys(email);
    }
    public String getText() {
        return driver.findElement(By.xpath(APPLY_PAGE)).getText();
    }
}
