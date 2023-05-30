package resources;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AutomationPractice.SwagLabsAutomationPractice.AddProductpage;
import AutomationPractice.SwagLabsAutomationPractice.CheckoutCompletepage;
import AutomationPractice.SwagLabsAutomationPractice.CheckoutOverviewpage;
import AutomationPractice.SwagLabsAutomationPractice.CheckoutYourInformationpage;
import AutomationPractice.SwagLabsAutomationPractice.YourCartpage;


public class TestScript extends Baseclass
{
@Parameters({"firstName","lastName","zipCode"})
@Test
public void test() throws EncryptedDocumentException, IOException
{
	AddProductpage a1=new AddProductpage();
	a1.addproductlink();
	a1.addcartproduct();
	YourCartpage y1=new YourCartpage();
	y1.clickoncheckOutbutton();
	CheckoutYourInformationpage cyip=new CheckoutYourInformationpage();
	cyip.enterPersonalDetails("firstName","lastName","zipCode");
	//cyip.enterPersonalDetails("Sardar", "Sardar", "12345");
	CheckoutOverviewpage cop=new CheckoutOverviewpage();
	cop.clickonFinishbutton();
	CheckoutCompletepage ccp=new CheckoutCompletepage();
	ccp.retriveSuccessmessage();
	Assert.assertTrue(false);
}

}
