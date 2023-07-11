package homework.week6;

import homework.week6.Steps.SearchPostOfficeSteps;
import homework.week6.TestBases.TestBase;
import org.testng.annotations.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FirstTestNP extends TestBase {

    private static final String ADDRESS_OF_POST_OFFICE = "просп. М.Бажана, 3 (м. Харківська)";
    private static final String TYPE_OF_POST_OFFICE = "Поштове відділення";
    private static final String MAX_WEIGHT = "До 30 кг";

    @Test
    public void firstTest(){
        SearchPostOfficeSteps searchPostOfficeSteps = new SearchPostOfficeSteps(driver);
        searchPostOfficeSteps.goToTimetable();
        searchPostOfficeSteps.searchOfPostOffice();
        assertThat(searchPostOfficeSteps.postOfficePage.getAddress()).contains(ADDRESS_OF_POST_OFFICE);
        assertThat(searchPostOfficeSteps.postOfficePage.getTypeOfWarehouse()).contains(TYPE_OF_POST_OFFICE);
        assertThat(searchPostOfficeSteps.postOfficePage.getWeight()).contains(MAX_WEIGHT);
    }

}

// for proper work of test on firefox "action.perform();" field has to be commented at PostOfficeByNumbOrAddressPage page