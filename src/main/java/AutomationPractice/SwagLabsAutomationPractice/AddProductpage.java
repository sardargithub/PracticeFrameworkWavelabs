package AutomationPractice.SwagLabsAutomationPractice;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import resources.Baseclass;

public class AddProductpage 
{
@FindBy(id="add-to-cart-sauce-labs-backpack")
WebElement productsLink;
@FindBy(xpath="//a[@class='shopping_cart_link']")
WebElement cartproduct;

@FindBy(xpath="//*[@class='inventory_list']/div")
List<WebElement> cartProducts;

public AddProductpage() {
	PageFactory.initElements(Baseclass.driver, this);
}

public void addproductlink() {
	productsLink.click();
}

public void addcartproduct() {
	cartproduct.click();
}

@Test
public int getListOfProducts() {
	//System.out.println(cartProducts.size());
	return cartProducts.size();
}

}
