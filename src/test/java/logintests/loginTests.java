package logintests;

import org.testng.Assert;
import org.testng.annotations.Test;


import login.App;

public class loginTests {
  @Test(description="valid test")
  public void validlogintest()
  {
	  App ap=new App();
	  boolean status=ap.userLogin("userdemo","password");
	  Assert.assertTrue(status,"Login Failed with valid Credential");
  }
  @Test(description="Invalid test")
  public void invalidlogintest()
  {
	  App ap=new App();
	  boolean status=ap.userLogin("userdemo","password123");
	  Assert.assertFalse(status);
  }
  
}
