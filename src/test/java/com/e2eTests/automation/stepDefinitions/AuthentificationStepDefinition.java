package com.e2eTests.automation.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.e2eTests.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinition {
	
	public WebDriver driver;
	
	public AuthentificationStepDefinition() {
		driver = Setup.driver;
	}
	
	@Given("^J ouvre l application OrangeHRM$")
	public void jOuvreLApplicationOrangeHRM() throws Throwable {
	    
	}

	@When("^Je saisie le login$")
	public void jeSaisieLeLogin() throws Throwable {

	}

	@When("^Je saisie le mot de passe$")
	public void jeSaisieLeMotDePasse() throws Throwable {
	   ;
	}

	@When("^Je clique sur le boutton login$")
	public void jeCliqueSurLeBouttonLogin() throws Throwable {
	   
	}

	@Then("^Je verifie le compte admin$")
	public void jeVerifieLeCompteAdmin() throws Throwable {
	  
	}


}
