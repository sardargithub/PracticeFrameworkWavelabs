package AutomationPractice.SwagLabsAutomationPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutYourInformationpage 
{
	@FindBy(name="firstName")
	WebElement fName;
	
	@FindBy(name="lastName")
	WebElement lName;
	
	@FindBy(name="postalCode")
	WebElement postalcode;
	
	@FindBy(name="continue")
	WebElement Continue;
	
	@FindBy(name="cancel")
	WebElement Cancel;
	
	public CheckoutYourInformationpage()
	{
		PageFactory.initElements(Baseclass.driver,this);
	}
	
	public void enterPersonalDetails(String fn,String ln,String code) {
		fName.sendKeys(fn);
		lName.sendKeys(ln);
		postalcode.sendKeys(code);
		Continue.click();
	}
}
