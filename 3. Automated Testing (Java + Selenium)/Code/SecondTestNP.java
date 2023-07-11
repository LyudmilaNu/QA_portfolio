package homework.week6;

import homework.week6.Steps.DeliveryCostSteps;
import homework.week6.TestBases.TestBase;
import org.testng.annotations.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SecondTestNP extends TestBase {

    private static final String COST_OF_DELIVERY = "Разом: 55.00 ... 125.00грн *";

    @Test
    public void secondTest() {
        DeliveryCostSteps deliveryCostSteps = new DeliveryCostSteps(driver);
        deliveryCostSteps.goToDeliveryCalculationPage();
        deliveryCostSteps.deliveryCalculationProcess();
        assertThat(deliveryCostSteps.deliveryCostPage.getCost()).contains(COST_OF_DELIVERY);
    }
}