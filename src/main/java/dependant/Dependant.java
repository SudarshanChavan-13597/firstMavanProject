package dependant;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependant {
	
	@Test
	public void verifyThatUserCanLoginWithValidCredentials()
	{
		System.out.println("verify That User Can Login With Valid Credentials");
		Assert.assertTrue(true);
	} 
	
	@Test (dependsOnMethods = {"verifyThatUserCanLoginWithValidCredentials"})
	public void verifyUserCanSendEmail()
	{
		System.out.println("verify User Can Send Email");
		Assert.assertTrue(false);		
	}
	
	@Test (dependsOnMethods = {"verifyUserCanSendEmail"})
	
	public void verifyUserCanSeeSentEmailInSentbox()
	{
		System.out.println("verify User Can See Sent Email In Sentbox");
	}

}
