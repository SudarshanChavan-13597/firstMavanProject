package annotations;

import org.testng.annotations.Test;

import testbase.TestBase;

public class AnnotationInTestNG extends TestBase {
	@Test
	public void verifyUserCanNotLoginWithInvalidCredentials() {
		System.out.println("verify user can not login with invalid credentials");
	}

	@Test
	public void verifyUserCanLoginWithValidCredentials() {
		System.out.println("verify User Can Login With Valid Credentials");
	}
}
