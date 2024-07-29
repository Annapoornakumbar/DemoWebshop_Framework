package pomrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {
	
	
		@FindBy(xpath = "//td[@class='remove-from-cart']/input")
	private WebElement removeCheckbox;
		
		@FindBy(xpath = "//input[@name='updatecart']")
	private WebElement updateWishlist;

		@FindBy(xpath = "//div[contains(text(),'The wishlist is empty!')]")
	private WebElement emptyWishListMessage;
		
		@FindBy(xpath = "//a[text()='Fiction EX']")
		private WebElement findExWishlist;
		
		@FindBy(xpath = "//td[@class='remove-from-cart']/input")
		private List<WebElement> allRemoveCheckBox;
		

		public WishListPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		public WebElement getRemoveCheckbox() {
			return removeCheckbox;
		}

		public WebElement getUpdateWishlist() {
			return updateWishlist;
		}

		public WebElement getEmptyWishListMessage() {
			return emptyWishListMessage;
		}
		public WebElement getFindExWishlist() {
			return findExWishlist;

	}
		}



	
	//@FindBy(xpath = "//a[text()='Fiction EX']")
	//private WebElement fictionExProduct;
	
	//@FindBy(xpath = "//td[@class='remove-from-cart']/input")
	//private List<WebElement> allRemoveCheckBox;
	
	//@FindBy(xpath = "//input[@value='Update wishlist']")
	//private WebElement updateProductButton;
	
	

	//public WishListPage(WebDriver driver)
	//{
	//	PageFactory.initElements(driver, this);
	//}

	//public WebElement getFictionExProduct() {
	//	return fictionExProduct;
	//}

	//public List<WebElement> getAllRemoveCheckBox() {
	//	return allRemoveCheckBox;
	//}

	//public WebElement getUpdateProductButton() {
	//	return updateProductButton;
	//}
	
	
	



