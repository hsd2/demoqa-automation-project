import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {

    protected WebDriver driver;
    PracticeFormPage practiceFormPage;

    @BeforeAll
    public void setUp(){

   // System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
     WebDriverManager.chromedriver().setup();

     driver = new ChromeDriver();
       // driver = new FirefoxDriver();

    driver.get("https://demoqa.com/automation-practice-form");

        System.out.println("Test basladi");
        practiceFormPage = new PracticeFormPage(driver);
    }

    @AfterAll
    public void tearDown(){
        System.out.println("Test Bitti");
        driver.quit();
    }
}
