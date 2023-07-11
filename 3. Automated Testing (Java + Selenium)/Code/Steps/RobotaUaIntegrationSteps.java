package homework.week6.Steps;

import homework.week6.Pages.*;
import org.openqa.selenium.WebDriver;

public class RobotaUaIntegrationSteps {

    private HomePage homePage;
    ListOfVacanciesPage listOfVacanciesPage;
    VacancyPage vacancyPage;
    RobotaUaVacancyPage robotaUaVacancyPage;
    public RobotaUaVacancyApplyPage robotaUaVacancyApplyPage;

    public RobotaUaIntegrationSteps(WebDriver driver){
        homePage = new HomePage(driver);
        listOfVacanciesPage = new ListOfVacanciesPage(driver);
        vacancyPage = new VacancyPage(driver);
        robotaUaVacancyPage = new RobotaUaVacancyPage(driver);
        robotaUaVacancyApplyPage = new RobotaUaVacancyApplyPage(driver);
    }

    public void goToVacancyPage(){
        homePage.openVacanciesPage();
    }
    public void applyingToFirstVacancyNP(){
        listOfVacanciesPage.openVacancy();
        vacancyPage.clickButtonApply();
    }

    public void applyingToVacancyRobotaUa(String nameAndLastName, String email){
        robotaUaVacancyPage.switchToCurrentTab();
        robotaUaVacancyPage.clickButtonApply();
        robotaUaVacancyApplyPage.uploadFile();
        robotaUaVacancyApplyPage.typeNameAndLastName(nameAndLastName);
        robotaUaVacancyApplyPage.typeEmail(email);
        robotaUaVacancyApplyPage.getText();
    }
}
