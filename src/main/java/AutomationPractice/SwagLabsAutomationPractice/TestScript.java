package AutomationPractice.SwagLabsAutomationPractice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;


public class TestScript extends Baseclass
{
@Test
public void test() throws EncryptedDocumentException, IOException
{
	AddProductpage a1=new AddProductpage();
	a1.addproductlink();
	a1.addcartproduct();
	YourCartpage y1=new YourCartpage();
	y1.clickoncheckOutbutton();
	CheckoutYourInformationpage cyip=new CheckoutYourInformationpage();
	cyip.enterPersonalDetails("Sardar", "Sardar", "12345");
	CheckoutOverviewpage cop=new CheckoutOverviewpage();
	cop.clickonFinishbutton();
	CheckoutCompletepage ccp=new CheckoutCompletepage();
	ccp.retriveSuccessmessage();
}

}
