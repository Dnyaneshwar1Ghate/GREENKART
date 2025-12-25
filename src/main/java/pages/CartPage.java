package pages;

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

}
