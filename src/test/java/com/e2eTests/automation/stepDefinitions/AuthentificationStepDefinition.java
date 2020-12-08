package com.e2eTests.automation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.pageObjects.AuthentificationPage;
import com.e2eTests.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinition {
	
	public WebDriver driver;
	private AuthentificationPage authentificationPage = new AuthentificationPage();
	
	public AuthentificationStepDefinition() {
		driver = Setup.driver;
	}
	
	@Given("^J ouvre l application OrangeHRM$")
	public void jOuvreLApplicationOrangeHRM() throws Throwable {
		String url="https://opensource-demo.orangehrmlive.com/";
		driver.get(url); 
	}

	@When("^Je saisie le login$")
	public void jeSaisieLeLogin() throws Throwable {
		PageFactory.initElements(driver, AuthentificationPage.class);
		authentificationPage.fillUserName();
	}

	@When("^Je saisie le mot de passe$")
	public void jeSaisieLeMotDePasse() throws Throwable {
		authentificationPage.fillPassword();
	}

	@When("^Je clique sur le boutton login$")
	public void jeCliqueSurLeBouttonLogin() throws Throwable {
		authentificationPage.clickLoginButton();
	}

	@Then("^Je verifie le compte admin$")
	public void jeVerifieLeCompteAdmin() throws Throwable {
	  System.out.println("Successfully login");
	}


}
