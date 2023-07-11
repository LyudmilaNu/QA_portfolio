package homework.week6;

import homework.week6.Pages.RobotaUaVacancyApplyPage;
import homework.week6.Steps.RobotaUaIntegrationSteps;
import homework.week6.TestBases.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ThirdTestNP extends TestBase {
    private static final String APPLY_BUTTON_CHECK = "Отправить резюме";
    private static final String NAME_AND_LAST_NAME = "Леся Милова";
    private static final String EMAIL = "l@gmail.com";



    @Test
    public void thirdTest() {
        RobotaUaIntegrationSteps robotaUaIntegrationSteps = new RobotaUaIntegrationSteps(driver);
        robotaUaIntegrationSteps.goToVacancyPage();
        robotaUaIntegrationSteps.applyingToFirstVacancyNP();
        robotaUaIntegrationSteps.applyingToVacancyRobotaUa(NAME_AND_LAST_NAME, EMAIL);
        assertThat(robotaUaIntegrationSteps.robotaUaVacancyApplyPage.getText()).contains(APPLY_BUTTON_CHECK);
    }
}

