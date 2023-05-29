package AutomationPractice.SwagLabsAutomationPractice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletepage 
{
	@FindBy(xpath = "//*[@class='complete-header']")
	WebElement successMessage;

	@FindBy(id = "back-to-products")
	WebElement backToHome;

	public CheckoutCompletepage() {
		PageFactory.initElements(Baseclass.driver, this);
	}

	public void backToHomePage() {
		backToHome.click();
	}

	public void retriveSuccessmessage() throws EncryptedDocumentException, IOException {
		String conformationmesage = successMessage.getText();
		System.out.println(conformationmesage);
		Exceloperation.writedata("Sheet1", 1, 5, conformationmesage);
		String Expected = Exceloperation.readdata("Sheet1", 1, 4);
		String Actual = Exceloperation.readdata("Sheet1", 1, 5);
		// assert.assertEquals(Expected, Actual);

		if (Expected.equals(Actual)) {
			System.out.println("Pass");
			Exceloperation.writedata("Sheet1", 1, 6, "Pass");
			System.out.println("Testing");
		} else {
			System.out.println("Fail");
			Exceloperation.writedata("Sheet1", 1, 6, "Fail");
		}

	}

}
