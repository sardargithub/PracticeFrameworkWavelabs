package AutomationPractice.SwagLabsAutomationPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartpage
{
	@FindBy(id="checkout")
	WebElement checkOutbutton;
	
	@FindBy(id="continue-shopping")
	WebElement continueShoppingbutton;
	
	@FindBy(id="remove-sauce-labs-backpack")
	WebElement removeItembutton;
	
	@FindBy(xpath="//*[@class=\"inventory_item_name\"]")
	WebElement productName;
	
	public YourCartpage()
	{
		PageFactory.initElements(Baseclass.driver,this);
	}
	public void clickoncheckOutbutton() {
		checkOutbutton.click();
	}
	
	public void continueShopping() {
		continueShoppingbutton.click();
	}
	
	public void removeProduct() {
		removeItembutton.click();
	}
	
	public String getProductName() {
		return productName.getText();
	}
	
	
}
