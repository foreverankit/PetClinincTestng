package selenium.automation.test;

import static org.testng.Assert.*;
//import static org.testng.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.*;

public class FirstTest{
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    public static String chromeDriverPath = "/usr/bin/chromedriver";

    @BeforeClass
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        options.setBinary("/usr/bin/google-chrome");
        driver = new ChromeDriver(options);
        //System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        // 	DesiredCapabilities capabilities = DesiredCapabilities.phantomjs();
        //   driver = new PhantomJSDriver(capabilities);
        //    baseUrl = "http://ec2-3-232-123-215.compute-1.amazonaws.com:31090";
        baseUrl = "https://www.google.com";
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void realTest() throws InterruptedException {
        driver.get(baseUrl);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Naman1997");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
