package com.e2eTests.automation.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2eTests.automation.pageObjects.AccueilPage;
import com.e2eTests.automation.util.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccueilStepDefinition {
	
	public WebDriver driver;
	private AccueilPage accueilPage = new AccueilPage();
	
	public AccueilStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AccueilPage.class);
	}

	@When("^Je clique sur le module Recruitment$")
	public void jeCliqueSurLeModuleRecruitment() throws Throwable {
		accueilPage.goToRecruitment();
	}

	@Then("^Je verifie l affichage de la page Recruitment \"([^\"]*)\"$")
	public void jeVerifieLAffichageDeLaPageRecruitment(String sub_menu_rec) throws Throwable {
		String pageRecruitment = AccueilPage.pageRecruitment.getText();
		Assert.assertTrue(pageRecruitment.contains(sub_menu_rec));
	}

	@When("^Je clique sur le module PIM$")
	public void jeCliqueSurLeModulePIM() throws Throwable {
		accueilPage.goToPIM();
	}

	@Then("^Je verifie l affichage de la page PIM \"([^\"]*)\"$")
	public void jeVerifieLAffichageDeLaPagePIM(String sub_menu_PIM) throws Throwable {	
		String pagePIM = AccueilPage.pagePIM.getText();
		//Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.visibilityOf(AccueilPage.pagePIM));
		Assert.assertTrue(pagePIM.contains(sub_menu_PIM));
	}
}
