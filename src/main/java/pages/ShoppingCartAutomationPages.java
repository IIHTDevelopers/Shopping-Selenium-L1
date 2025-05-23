package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartAutomationPages extends StartupPage
{
	By shopOption = null; //TC-2
	By automationPracticeSiteLogo = null; //TC-4
	By newArrivalButton = null; //tc-5
	By seleniumRubyProduct = null; //TC-6
	By thinkingInHtmlProduct = null; 
	By masteringJavaScriptProduct = null; 
	By addToBasketButton = null; //TC-8
	By viewBasketButton = null; 
	By seleniumRubyInsideTheBasketPage = null; //TC-9
	By seleniumRubyProductPrice=null; //TC-12
	

	public ShoppingCartAutomationPages(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	/**@Test1
	 * about this method verifyNavigateTotTheShoppingCartpage() : Verify navigate to the shopping cart home page
	 * @param : null
	 * @description : go to this shopping cart page URL and validate the home page
	 * @return : return the current page tile as String
	 * @author : Yaksha
	 */
	public String verifyNavigateTotTheShoppingCartpage() throws Exception {
		return null;
	}
	/**@Test2
	 * about this method verifyShopOptionIsPresent() : Check Shop Menu Option is present or not
	 * @param : null
	 * @description : Check shop menu option is present or not
	 * @return : return true if shopOption is present, else false
	 * @author : Yaksha
	 */
	public boolean verifyShopOptionIsPresent() throws Exception {
		return false;
	}
	/**@Test3
	 * about this method clickOnShopMenuandValidateTheTitle() : Click on “Shop” Menu Option and validate successfully navigate to the shop page or not
	 * @param : null
	 * @description : click on the shop menu and validate the title of this shop page
	 * @return : return the current page tile as String
	 * @author : Yaksha
	 */
	public String clickOnShopMenuandValidateTheTitle() throws Exception {
		return null;

	}

	/**@Test4
	 * about this method clickOnLogoandVerifyItIsNavigateToTheHomePage() : Click on the Automation practice site logo Verify navigate to the home page by clicking on the Logo
	 * @param : null
	 * @description : validate the logo is present and click on the Automation practice site logo which is present at the left top corner
	 * 				  and verify the page title.
	 * @return : return the current page tile as String
	 * @author : Yaksha
	 */
	public String clickOnLogoandVerifyItIsNavigateToTheHomePage() throws Exception {
		return null;

	}

	/**@Test5
	 * about this method checkIfHomePageHasSectionOfNewArrivals() : Check if Home page has a section of new arrivals
	 * @param : null
	 * @description : check home page has a section of new arrival.
	 * @return : return true if newArrival Button is present, else false
	 * @author : Yaksha
	 */
	public boolean checkIfHomePageHasSectionOfNewArrivals() throws Exception {
		return false;
	}
	
	/**@Test6
	 * about this method checkOfArrivalsSectionhasExactly3ProductsEnlisted() : Check of “Arrivals” section has exactly 3 products enlisted
	 * @param : null
	 * @description : Check of “Arrivals” section has exactly 3 products enlisted
	 * @return : return true if all three products are  present, else false
	 * @author : Yaksha
	 */
	public boolean checkOfArrivalsSectionhasExactly3ProductsEnlisted() throws Exception {
		return false;
	}
	
	/**@Test7
	 * about this method clickOnSeleniumRubyProductAndValidatetheTitleOfThisPage() :Click on Selenium Ruby Product and validate the title of the page
	 * @param : null
	 * @description : Check of “Arrivals” section has exactly 3 products enlisted
	 * @return : return the current page tile as String
	 * @author : Yaksha
	 */
	public String clickOnSeleniumRubyProductAndValidatetheTitleOfThisPage() throws Exception {
		return null;

	}
	
	/**@Test8
	 * about this method verifyAddBasketButtonIsPresentAndClickOnAddBasket() : Check product details page has an option ADD TO BASKET and Click on ADD TO BASKET
	 * @param : null
	 * @description : verify add basket button is present then click on the Add to basket button
	 * @return : return true if "Add to Basket" Button is  present, else false
	 * @author : Yaksha
	 */
	public boolean verifyAddBasketButtonIsPresentAndClickOnAddBasket() throws Exception {
		return false;
	}
	/**@Test9
	 * about this method viewBasketButtonIsPresentAndClickOnIt() : Verify that view basket button is present after click on add to basket and click on View basket
	 * @param : null
	 * @description : verify view basket button is present then click on the view basket button
	 * @return : return true if "view Basket" Button is  present, else false
	 * @author : Yaksha
	 */
	public boolean viewBasketButtonIsPresentAndClickOnIt() throws Exception {
		return false;
	}
	
	/**@Test10
	 * about this method userIsNavigateToTheBasketPage() : Verify that user is navigate to the  Cart or Basket page
	 * @param : null
	 * @description : verify the title of the Basket Page
	 * @return : return the current page tile as String
	 * @author : Yaksha
	 */
	public String userIsNavigateToTheBasketPage() throws Exception {
		return null;

	}
	
	/**@Test11
	 * about this method seleniumrubyIsPresentInsideTheCartPage() : Verify after adding selenium ruby product in to cart verify the selenium ruby product is present inside the Cart page.
	 * @param : null
	 * @description :seleniumruby Is PresentInside The CartPage
	 * @return : return true if product "Selenium Ruby" is Inside The Basket Page, else false
	 * @author : Yaksha
	 */
	public Boolean seleniumrubyIsPresentInsideTheCartPage() throws Exception {
		return null;
	}
	
	/**@Test12
	 * about this method verifythatSeleniumRubyProductPriceIs500() : Verify that selenium ruby product price is 500 in the Cart page
	 * @param : null
	 * @description : verify that SeleniumRuby Product Price Is 500
	 * @return : return true if product price is displayed, else false
	 * @author : Yaksha
	 */
	public Boolean verifythatSeleniumRubyProductPriceIsDisplayed() throws Exception {
		return null;
	}
	
}
