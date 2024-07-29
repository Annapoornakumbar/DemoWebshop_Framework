package testscripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generatelibary.BaseTest;
import pomrepository.BooksPage;
import pomrepository.FictionExProductPage;
import pomrepository.WishListPage;

public class WishList extends BaseTest{
	
		@Test(groups = "system")
	public void verify_User_Is_Ablle_To_WishList()
	{
		home_Page.getBooksLinks().click();
		
		//Validate
		if(driver.getTitle().equals("Demo Web Shop. Books"))
		{
			System.out.println("Navigated to Books page successfull");
		}
		else
		{
			System.out.println("Navigated to Books page successfull");
		}
		
		BooksPage books_page=new BooksPage(driver);
		String expProdName=books_page.getFictionExProductName().getText();
		books_page.getFictionExProductName().click();
		
		//Validate
		
		if(driver.getTitle().equals("Demo Web Shop. Fiction EX"))
		{
			System.out.println("Navigated to FictionEX page successfull");
		}
		else
		{
			System.out.println("Navigated to FictionEX page fail");
		}
		
		FictionExProductPage product_Page=new FictionExProductPage(driver);
		product_Page.getAddToWishListButton().click();
		
		home_Page.getWishListLink().click();
		
		//Validate
		
		driver.navigate().refresh();
		
		WishListPage wishlist_Page=new WishListPage(driver);
		String actProdName=wishlist_Page.getFindExWishlist().getText();
		
		if(expProdName.equals(actProdName))
		{
			System.out.println("verify_User_Is_Ablle_To_WishList is Pass");
		}
		else
		{
			System.out.println("verify_User_Is_Ablle_To_WishList is Fail");
		}
		
		List<WebElement> allRemoveCheckBox= (List<WebElement>) wishlist_Page.getRemoveCheckbox();
		for(WebElement checkbox:allRemoveCheckBox)
		{
			checkbox.click();
		}
		wishlist_Page.getUpdateWishlist().click();
	}
	}

	


