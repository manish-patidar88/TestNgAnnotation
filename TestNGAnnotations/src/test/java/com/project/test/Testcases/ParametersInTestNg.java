package com.project.test.Testcases;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNg {
	
	@Test
	@Parameters({"username","password"})
	public void loginTest(@Optional("usernameOptional") String username,@Optional("passwordOptional") String password) {
		System.out.println("UserName: "+ username + " Password: "+password);
	}

}
