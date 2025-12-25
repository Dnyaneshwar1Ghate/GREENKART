package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import pages.CartPage;
import pages.CheckOutPage;
import pages.ChooseCountry;
import pages.HomePage;
import pages.HomePageLogoVeriFy;

public class AddToCartTest extends BaseTest {

	@Test
	public void addVegetablesToCartTest() throws InterruptedException {

		HomePage homePage = new HomePage(getDriver());
		homePage.addProductToCart("Beans");
		homePage.addProductToCart("Tomato");
		homePage.openCart();

		CartPage cartPage = new CartPage(getDriver());
		cartPage.proceedToCheckout();

		CheckOutPage order = new CheckOutPage(getDriver());
		order.placeOrderClick();

		ChooseCountry choose = new ChooseCountry(getDriver());
		choose.getCuntryList("india");
		choose.agreeAndProceed();

		HomePageLogoVeriFy home = new HomePageLogoVeriFy(getDriver());

		Assert.assertTrue(home.isHomePageLogoDisplayed(), "Home page logo not displayed after order redirect");
		System.out.println("Test case pass for addToCartTest");

	}
}