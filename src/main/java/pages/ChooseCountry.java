package pages;

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
}
