package homework.week6.Steps;

import homework.week6.Pages.DeliveryCalculationPage;
import homework.week6.Pages.DeliveryCostPage;
import homework.week6.Pages.HomePage;
import org.openqa.selenium.WebDriver;

public class DeliveryCostSteps {
    HomePage homePage;
    DeliveryCalculationPage deliveryCalculationPage;
    public DeliveryCostPage deliveryCostPage;

    public DeliveryCostSteps (WebDriver driver){
      homePage = new HomePage(driver);
      deliveryCalculationPage = new DeliveryCalculationPage(driver);
      deliveryCostPage = new DeliveryCostPage(driver);
    }

    public void goToDeliveryCalculationPage(){
        homePage.openDeliveryCalculation();
    }
    public void deliveryCalculationProcess(){
        deliveryCalculationPage.clickSenderCityDropdown();
        deliveryCalculationPage.clickKyiv();
        deliveryCalculationPage.clickRecipientCityDropdown();
        deliveryCalculationPage.clickMykolayiv();
        deliveryCalculationPage.clickTypeOfPackage();
        deliveryCalculationPage.chooseDocumentsInTheDropdown();
        deliveryCalculationPage.clickButtonSubmit();
    }

}
