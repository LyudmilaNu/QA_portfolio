package homework.week6.TestBases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.time.Duration;

public class TestBase {
    private static final String HOME_PAGE_URL = "https://novaposhta.ua/";
    public WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        //driver = new EdgeDriver();
        //driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.navigate().to(HOME_PAGE_URL);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id='popup_info']//i[@class='click close btn_x']")).click();

    }

    @AfterTest
    public void tearDown(){

        driver.quit();
    }
}
