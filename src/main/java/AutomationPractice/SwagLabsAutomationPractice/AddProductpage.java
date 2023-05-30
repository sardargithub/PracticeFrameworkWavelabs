package AutomationPractice.SwagLabsAutomationPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Baseclass;

public class AddProductpage 
{
@FindBy(id="add-to-cart-sauce-labs-backpack")
WebElement productsLink;
@FindBy(xpath="//a[@class='shopping_cart_link']")
WebElement cartproduct;

public AddProductpage()
{
	PageFactory.initElements(Baseclass.driver,this);
}
public void addproductlink()
{
	productsLink.click();
}
public void addcartproduct()
{
	cartproduct.click();
}
}
