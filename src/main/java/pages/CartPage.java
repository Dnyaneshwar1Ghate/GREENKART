package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    WebDriver driver;

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
        // Initialize elements with PageFactory
        PageFactory.initElements(driver, this);
    }

    // Page Factory - WebElement definition
    @FindBy(xpath = "//button[text()='PROCEED TO CHECKOUT']")
    WebElement proceedToCheckout;

    // Action method
    public void proceedToCheckout() {
        proceedToCheckout.click();
    }
}


//without page factory
/*package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	By proceedToCheckout = By.xpath("//button[text()='PROCEED TO CHECKOUT']");

	public void proceedToCheckout() {
		
		driver.findElement(proceedToCheckout).click();
	}

}*/
