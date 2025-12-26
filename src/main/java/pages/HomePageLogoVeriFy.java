package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageLogoVeriFy {

    WebDriver driver;

    // Constructor
    public HomePageLogoVeriFy(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Page Factory WebElement
    @FindBy(xpath = "//div[@class='brand greenLogo']")
    WebElement logo;

    // Verify logo visibility
    public boolean isHomePageLogoDisplayed() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(logo));
            return logo.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}


/*package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageLogoVeriFy {

	// Thank you, your order has been placed successfully
	WebDriver driver;

	public HomePageLogoVeriFy(WebDriver driver) {
		this.driver = driver;
	}

	By logo = By.xpath("//div[@class='brand greenLogo']");

	public boolean isHomePageLogoDisplayed() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			return wait.until(ExpectedConditions.visibilityOfElementLocated(logo)).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

}*/
