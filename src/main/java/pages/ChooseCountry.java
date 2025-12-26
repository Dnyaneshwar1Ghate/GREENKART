package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseCountry {

    WebDriver driver;

    // Constructor
    public ChooseCountry(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Page Factory WebElements
    @FindBy(xpath = "//label[text()='Choose Country']/following::select[1]/option")
    List<WebElement> options;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement agree;

    @FindBy(xpath = "//button[text()='Proceed']")
    WebElement proceed;

    // Select country from dropdown
    public void selectCountry(String chooseCountry) {
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase(chooseCountry)) {
                option.click();
                break;
            }
        }
    }

    // Agree and proceed
    public void agreeAndProceed() {
        agree.click();
        proceed.click();
    }
}


/*package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChooseCountry {

	WebDriver driver;

	public ChooseCountry(WebDriver driver) {
		this.driver = driver;
	}

	By options = By.xpath("//label[text()='Choose Country']/following::select[1]/option");
	By agree = By.xpath("//input[@type='checkbox']");
	By proceed = By.xpath("//button[text()='Proceed']");

	public void getCuntryList(String chooseCountry) {

		for (WebElement option : driver.findElements(options)) {
			if (option.getText().equalsIgnoreCase(chooseCountry)) {
				option.click();
				break;

			}
		}
	}

	public void agreeAndProceed() {
		driver.findElement(agree).click();
		driver.findElement(proceed).click();
	}
}*/
