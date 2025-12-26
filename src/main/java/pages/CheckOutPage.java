

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

    WebDriver driver;

    // Constructor
    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Page Factory WebElement
    @FindBy(xpath = "//button[text()='Place Order']")
    WebElement placeOrder;

    // Action method
    public void placeOrderClick() {
        placeOrder.click();
    }
}



/*package pages;

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
*/