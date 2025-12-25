package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    private static ThreadLocal<WebDriver> driverThread = new ThreadLocal<>();

    protected WebDriver driver;

    protected WebDriver getDriver() {
        return driverThread.get();
    }

    @BeforeClass
    public void setup() {

        boolean isJenkins = System.getenv("JENKINS_HOME") != null;

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        if (isJenkins) {
            options.addArguments("--headless=new");
            options.addArguments("--disable-gpu");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--window-size=1920,1080");
            System.out.println("Running in Jenkins → Headless Chrome");
        } else {
            options.addArguments("--start-maximized");
            System.out.println("Running locally → Normal Chrome");
        }

        WebDriver localDriver = new ChromeDriver(options);
        localDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driverThread.set(localDriver);
        driver = getDriver(); 

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    @AfterClass
    public void tearDown() {
        if (getDriver() != null) {
            getDriver().quit();
            driverThread.remove();
        }
    }
}
