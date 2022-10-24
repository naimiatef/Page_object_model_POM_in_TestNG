package loginScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import Locators.LoginPage;

public class InvalidLogin {
	
	/*
	 * email:
	 * password: 
	 */
	
	LoginPage login = new  LoginPage();
	
	
	// Test Case 1: Click login button
  @Test(priority = 1)
  public void ClickMainLogin() throws InterruptedException {
	  login.ClickMainLoginButton().click();
	  
	  
	  
  }
  
  
  
	// Test Case 2: Insert invalid Data in LoginForm
  @Test(priority = 2)
  public void Enterinvalidemailpassword() throws InterruptedException {
	  
	  login.Enteremail().sendKeys("naimiatef@gmail.com");
	  login.Enterpassword().sendKeys("azerty");
	  login.ClickLogin_inpopup().click();
	  Assert.assertEquals(login.ActualErrorMessage(), "Invalid username or password.");
	  login.Enterpassword().clear();
	  
  }
}
