import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseTest {
    protected static WebDriver driver;


 @BeforeAll
    static void setup() {
     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.get("http://localhost:8080/login");



    }

//    @AfterAll
//    static void closeBrowser() {
//        driver.quit();
//    }

//    @AfterAll
//    public static void quiteDriver(){
//        driver.quit();
//    }
}