package com.e2eTests.automation.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.e2eTests.automation.pageObjects.AdminPage;
import com.e2eTests.automation.util.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminStepDefinition {
	
	public WebDriver driver;
	private AdminPage adminPage = new AdminPage();
	
	public AdminStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AdminPage.class);
	}
	
	@When("^Je clique sur le module Admin$")
	public void jeCliqueSurLeModuleAdmin() throws Throwable {
		adminPage.goToAdmin();
	}

	@When("^Je saisie le username \"([^\"]*)\"$")
	public void jeSaisieLeUsername(String username) throws Throwable {
		adminPage.fillUsername(username);
	}

	@When("^Je clique sur le boutton Search$")
	public void jeCliqueSurLeBouttonSearch() throws Throwable {
		adminPage.clickSearch();
	}

	@Then("^Je verifie l affichage du message Search \"([^\"]*)\"$")
	public void jeVerifieLAffichageDuMessageSearch(String sub_message_search) throws Throwable {
	String messageSearch = AdminPage.messageSearch.getText();
	Assert.assertTrue(messageSearch.contains(sub_message_search));
	}

	@When("^Je verifie l affichage de la page Admin \"([^\"]*)\"$")
	public void jeVerifieLAffichageDeLaPageAdmin(String sub_message_admin) throws Throwable {
		String messageAdmin = AdminPage.pageAdmin.getText();
		Assert.assertTrue(messageAdmin.contains(sub_message_admin));
	}

	@When("^Je clique sur le boutton Add$")
	public void jeCliqueSurLeBouttonAdd() throws Throwable {
		adminPage.clickAdd();
	}

	@When("^Je choisis le role Admin$")
	public void jeChoisisLeRoleAdmin() throws Throwable {
		adminPage.clickUserRole();
	}

	@When("^Je saisie dans Employee Name \"([^\"]*)\"$")
	public void jeSaisieDansEmployeeName(String name) throws Throwable {
		adminPage.fillEmployeeName(name);
	}

	@When("^Je verifie le nom d'employee \"([^\"]*)\"$")
	public void jeVerifieLeNomDEmployee(String empName) throws Throwable {
		Thread.sleep(2000);
		String currentName = AdminPage.employeeName.getText();
		Assert.assertTrue(currentName.contains(empName));
	}

	@When("^Je saisie dans le username \"([^\"]*)\"$")
	public void jeSaisieDansLeUsername(String username1) throws Throwable {
		adminPage.fillName(username1);
	}

	@When("^Je choisis Disabled pour le Status$")
	public void jeChoisisDisabledPourLeStatus() throws Throwable {
		adminPage.clickStatus();
	}

	@When("^Je saisie dans le password \"([^\"]*)\"$")
	public void jeSaisieDansLePassword(String pswd1) throws Throwable {
		adminPage.fillPswd(pswd1);
	}

	@When("^Je saisie dans Confirm password \"([^\"]*)\"$")
	public void jeSaisieDansConfirmPassword(String pswd2) throws Throwable {
		adminPage.fillConfPswd(pswd2);
	}

	@When("^Je clique sur le boutton Save$")
	public void jeCliqueSurLeBouttonSave() throws Throwable {
		adminPage.clickSave();
	}

	@Then("^Je verifie l affichage du message Save \"([^\"]*)\"$")
	public void jeVerifieLAffichageDuMessageSave(String sub_message_saved) throws Throwable {
		String messageSave = AdminPage.messageSave.getText();
		Assert.assertTrue(messageSave.contains(sub_message_saved));
	}
}