package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

	WebDriver driver;

	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
	}

	By placeOrder = By.xpath("//button[text()='Place Order']");

	public void placeOrderClick() {

		driver.findElement(placeOrder).click();
	}

}
