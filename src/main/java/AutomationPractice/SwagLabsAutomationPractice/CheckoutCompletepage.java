package AutomationPractice.SwagLabsAutomationPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletepage 
{
	@FindBy(xpath="//*[@class='complete-header']")
	WebElement confirmMessage;
	
	@FindBy(id="back-to-products")
	WebElement backToHome;
	
	public CheckoutCompletepage()
	{
		PageFactory.initElements(Baseclass.driver,this);
	}
	
	public String verifyConfirmationMessage() {
		String conformationmesage=confirmMessage.getText();
		return conformationmesage;
	}
	
	public void backToHomePage() {
		backToHome.click();
	}
}
