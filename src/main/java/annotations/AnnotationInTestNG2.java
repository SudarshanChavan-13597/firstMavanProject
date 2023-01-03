package annotations;

import org.testng.annotations.Test;

public class AnnotationInTestNG2 {
	@Test
	public void verifyUserCanSendEmail()
	{
		System.out.println("verify User Can Send Email");
	}
	
	@Test
	public void verifySendEmailWillBeDisplayedInSendItem()
	{
		System.out.println("verify Send Email Will Be Displayed In Send Item");
		
	}

}
