package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By productNames = By.cssSelector("h4.product-name");
	By addToCartButtons = By.xpath("//button[text()='ADD TO CART']");
	By cartIcon = By.cssSelector("a.cart-icon");

	public void addProductToCart(String productName) {

		List<WebElement> products = driver.findElements(productNames);

		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getText().contains(productName)) {

				driver.findElements(addToCartButtons).get(i).click();

				break;
			}
		}
	}

	public void openCart() {
		driver.findElement(cartIcon).click();
	}

}
