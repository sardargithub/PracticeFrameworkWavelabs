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
	
	@FindBy(xpath="//*[@class='summary_value_label'][1]")
	WebElement paymentInformation;
	
	@FindBy(xpath="//*[@class='summary_value_label'][2]")
	WebElement shippingInformation;
	
	@FindBy(xpath="//*[contains(@class,'summary_info_label ')]")
	WebElement totalPrice;
	
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
	
	public String getPaymentInformation() {
		String paymentInfo=paymentInformation.getText();
		return paymentInfo;
	}
	
	public String getShippingInformation() {
		String shippingInfo=shippingInformation.getText();
		return shippingInfo;
	}
	
	public String getTotalPrice() {
		String price=totalPrice.getText();
		return price;
	}
}
