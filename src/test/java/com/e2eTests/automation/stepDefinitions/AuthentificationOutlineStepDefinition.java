package com.e2eTests.automation.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.pageObjects.AccueilPage;
import com.e2eTests.automation.pageObjects.AuthentificationOutlinePage;
import com.e2eTests.automation.pageObjects.AuthentificationPage;
import com.e2eTests.automation.util.CommonMethods;
import com.e2eTests.automation.util.Setup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationOutlineStepDefinition {

	public WebDriver driver;
	private CommonMethods commonMethods = new CommonMethods();
	private AuthentificationOutlinePage authentificationOutlinePage = new AuthentificationOutlinePage();

	public AuthentificationOutlineStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthentificationOutlinePage.class);
	}

	@Given("^Je me connecte sur l application OrangeHRM$")
	public void jeMeConnecteSurLApplicationOrangeHRM() throws Throwable {
		commonMethods.readFromConfigFile("url");
	}

	@When("^Je saisie le login \"([^\"]*)\"$")
	public void jeSaisieLeLogin(String name) throws Throwable {
		PageFactory.initElements(driver, AuthentificationOutlinePage.class);
		authentificationOutlinePage.fillUserName(name);
	}

	@And("^Je saisie le mot de passe \"([^\"]*)\"$")
	public void jeSaisieLeMotDePasse(String pswd) throws Throwable {
		authentificationOutlinePage.fillPassword(pswd);
	}

	@And("^Je clique sur login$")
	public void jeCliqueSurLogin() throws Throwable {
		authentificationOutlinePage.clickLogin();
	}

	@Then("^Redirection vers l accueil$")
	public void redirectionVersLAccueil() throws Throwable {
		PageFactory.initElements(driver, AuthentificationPage.class);
		String text = AuthentificationPage.welcome.getText();
		Assert.assertTrue(text.contains("Welcome"));
	}

	@Then("^Je verifie les messages d'erreurs de la page connexion \"([^\"]*)\"$")
	public void jeVerifieLesMessagesDErreursDeLaPageConnexion(String expected_Message) throws Throwable {
		String actualMessage = AuthentificationOutlinePage.errorMessages.getText();
		Assert.assertTrue(actualMessage.contains(expected_Message));

	}
	
	@When("^Je clique sur le lien forgot your password \"([^\"]*)\"$")
	public void jeCliqueSurLeLienForgotYourPassword(String link) throws Throwable {
		authentificationOutlinePage.clickForgotPassword(link);
	}

	@When("^Je verifie la page Forgot Your Password \"([^\"]*)\"$")
	public void jeVerifieLaPageForgotYourPassword(String verification_message) throws Throwable {
		String forgotPswdMessage = AuthentificationOutlinePage.messageVerificationPassword.getText();
		Assert.assertTrue(forgotPswdMessage.contains(verification_message));
	}

	@When("^Je saisie username \"([^\"]*)\"$")
	public void jeSaisieUsername(String name) throws Throwable {
		authentificationOutlinePage.fillUsernameForgot(name);
	}

	@When("^Je clique sur le bouton Reset Password$")
	public void jeCliqueSurLeBoutonResetPassword() throws Throwable {
		authentificationOutlinePage.clickResetPassword();
	}
	
	@Then("^Je verifie la reinitialisation du mot de passe \"([^\"]*)\"$")
	public void jeVerifieLaReinitialisationDuMotDePasse(String actualResetMessage) throws Throwable {
		String resetMessage = AuthentificationOutlinePage.messageVerificationReset.getText();
		Assert.assertTrue(resetMessage.contains(actualResetMessage));
	}
	
	@When("^Je clique sur le widget LinkedIn$")
	public void jeCliqueSurLeWidgetLinkedIn() throws Throwable {
		authentificationOutlinePage.clickWidgetLinkedIn();
	}

	@Then("^Redirection vers la page LinkedIn$")
	public void redirectionVersLaPageLinkedIn() throws Throwable {
		boolean elementText= authentificationOutlinePage.isPageLinkedinDisplayed(AuthentificationOutlinePage.pageLinkedIn);
		Assert.assertTrue(elementText);
	}

	@When("^Je clique sur le widget Facebook$")
	public void jeCliqueSurLeWidgetFacebook() throws Throwable {
		authentificationOutlinePage.clickWidgetFacebook();
	}

	@Then("^Redirection vers la page Facebook$")
	public void redirectionVersLaPageFacebook() throws Throwable {
		String facebookPageMessage = AuthentificationOutlinePage.pageFacebook.getText();
		Assert.assertTrue(facebookPageMessage.contains("OrangeHRM - World's Most Popular Opensource HRIS"));
	}

	@When("^Je clique sur le widget Twitter$")
	public void jeCliqueSurLeWidgetTwitter() throws Throwable {
		authentificationOutlinePage.clickWidgetTwitter();
	}

	@Then("^Redirection vers la page Twitter$")
	public void redirectionVersLaPageTwitter() throws Throwable {
		String twitterPageMessage = AuthentificationOutlinePage.pageTwitter.getText();
		Assert.assertTrue(twitterPageMessage.contains("OrangeHRM Inc."));
	}

	@When("^Je clique sur le widget Youtube$")
	public void jeCliqueSurLeWidgetYoutube() throws Throwable {
		authentificationOutlinePage.clickWidgetYoutube();
	}

	@Then("^Redirection vers la page Youtube$")
	public void redirectionVersLaPageYoutube() throws Throwable {
		String youtubePageMessage = AuthentificationOutlinePage.pageYoutube.getText();
		Assert.assertTrue(youtubePageMessage.contains("OrangeHRM Inc"));
	}

}
