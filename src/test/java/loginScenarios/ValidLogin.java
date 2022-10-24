package loginScenarios;

import org.testng.annotations.Test;

import Locators.LoginPage;

public class ValidLogin {
	
	/*
	 * 
	 */
	
	LoginPage login = new LoginPage();
	
 // Test CASE 3:Enter Valid Data	
	
  @Test (priority = 3)
  public void Entervalidemailpassword() throws InterruptedException {
	  login.Enteremail().sendKeys("naimiatef@gmail.com");
	  login.Enterpassword().sendKeys("Compaq610");
	  login.ClickLogin_inpopup();
	  
	  
  }
}
