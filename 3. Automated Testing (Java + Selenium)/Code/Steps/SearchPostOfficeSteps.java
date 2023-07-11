package homework.week6.Steps;

import homework.week6.Pages.HomePage;
import homework.week6.Pages.PostOfficeByNumbOrAddressPage;
import homework.week6.Pages.PostOfficePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPostOfficeSteps {
    WebDriver driver;
    private HomePage homePage;
    PostOfficeByNumbOrAddressPage postOfficeByNumbOrAddressPage;
    public PostOfficePage postOfficePage;

    public  SearchPostOfficeSteps(WebDriver driver){
        homePage = new HomePage(driver);
        postOfficeByNumbOrAddressPage = new PostOfficeByNumbOrAddressPage(driver);
        postOfficePage = new PostOfficePage(driver);
    }
    public void goToTimetable(){
        homePage.clickTimetable();
    }
    public void searchOfPostOffice(){
        postOfficeByNumbOrAddressPage.clickCityFilter();
        postOfficeByNumbOrAddressPage.clickKyiv();
        postOfficeByNumbOrAddressPage.clickWarehouse();
        postOfficeByNumbOrAddressPage.movingToNumOfWarehouse();
        postOfficeByNumbOrAddressPage.clickWarehouseNum();
        postOfficeByNumbOrAddressPage.clickWarehouseInTheList();

    }
}
