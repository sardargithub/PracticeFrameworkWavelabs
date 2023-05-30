package AutomationPractice.SwagLabsAutomationPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Baseclass;

public class CheckoutOverviewpage 
{
	@FindBy(name="finish")
	WebElement Finishbutton;
	
	@FindBy(xpath="//*[@id='cancel']")
	WebElement Cancelbutton;
	
	
	public CheckoutOverviewpage()
	{
		PageFactory.initElements(Baseclass.driver,this);
	}
	
	public void clickonFinishbutton() {
		Finishbutton.click();
	}
	
	public void clickonCancelbutton()
	{
		Cancelbutton.click();
	}
}
