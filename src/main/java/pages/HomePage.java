package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Page Factory WebElements
    
    @FindBy(css = "h4.product-name")
    List<WebElement> productNames;

    @FindBy(xpath = "//button[text()='ADD TO CART']")
    List<WebElement> addToCartButtons;

    @FindBy(css = "a.cart-icon")
    WebElement cartIcon;

    // Add specific product to cart
    public void addProductToCart(String productName) {
        for (int i = 0; i < productNames.size(); i++) {
            if (productNames.get(i).getText().contains(productName)) {
                addToCartButtons.get(i).click();
                break;
            }
        }
    }

    // Open cart
    public void openCart() {
        cartIcon.click();
    }
}


/*package pages;

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

}*/
