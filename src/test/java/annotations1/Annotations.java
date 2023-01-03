package annotations1;

import org.testng.annotations.Test;

public class Annotations extends TestBAse

{
		@Test
		public void verifyUserCanNotLoginWithInvalidCredentials()
		{
			System.out.println("verify User Can Not Login With Invalid Credentials");
		}
	
		@Test
		public void verifyUserCanLoginWithVAlidCredential()
		{
			System.out.println("verify User Can Login With VAlid Credential");
		}
		
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
