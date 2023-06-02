package AutomationPractice.SwagLabsAutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import resources.Baseclass;

public class CheckoutOverviewpage 
{
	public WebDriver driver;
	
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
	
	@FindBy(xpath="//*[contains(@class,'summary_tax_label')]")
	WebElement taxAmount;
	
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
	
	@Test 
	public String getTaxAmount() {
	String amount = taxAmount.getText();
	System.out.println(amount);
	return amount;
	}
	 
	@Test
	public void testMethod() {
		System.out.println("This method created for testing");
	}
	
}
