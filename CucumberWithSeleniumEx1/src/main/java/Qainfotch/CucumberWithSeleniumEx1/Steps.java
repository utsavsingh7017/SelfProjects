package Qainfotch.CucumberWithSeleniumEx1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	 @Given("^Open the Firefox and launch the application$")				
	    public void open_the_Firefox_and_launch_the_application() throws Throwable							
	    {		
	        System.out.println("This Step open the Firefox and launch the application.");
	    }		

	    @When("^Enter the Username and Password$")					
	    public void enter_the_Username_and_Password() throws Throwable 							
	    {		
	       System.out.println("This step enter the Username and Password on the login page.");					
	    }		

	    @Then("^Reset the credential$")					
	    public void Reset_the_credential() throws Throwable 							
	    {    		
	        System.out.println("This step click on the Reset button.");					
	    }	
	    
	    @Given("^Open the Chrome and launch the application$")
	    public void open_the_Chrome_and_launch_the_application() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	System.out.println("This Step open the Chrome and launch the application.");
	    }
	    
	    @When("^Enter the Username and Pwd$")
	    public void enter_the_Username_and_Pwd() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	System.out.println("This step enter the Username and Password on the login page.");	
	    }
	    
	    @Then("^Login current user$")
	    public void login_current_user() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	 System.out.println("This step click on the Login button.");	
	    }
	  
}
