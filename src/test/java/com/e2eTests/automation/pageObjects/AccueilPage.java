package com.e2eTests.automation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccueilPage {

	final static String BUTTON_RECRUITMENT_ID = "menu_recruitment_viewRecruitmentModule";
	final static String PAGE_RECRUITMENT_ID = "menu_recruitment_viewCandidates";
	final static String BUTTON_PIM_ID = "menu_pim_viewPimModule";
	final static String PAGE_PIM_ID = "menu_pim_Configuration";


	/* @FindBy */
	@FindBy(how = How.ID, using = BUTTON_RECRUITMENT_ID)
	public static WebElement btnRecruitment;
	@FindBy(how = How.ID, using = PAGE_RECRUITMENT_ID)
	public static WebElement pageRecruitment;	
	@FindBy(how = How.ID, using = BUTTON_PIM_ID)
	public static WebElement btnPIM;	
	@FindBy(how = How.ID, using = PAGE_PIM_ID)
	public static WebElement pagePIM;

	
	/* Method */
	public void goToRecruitment() {
		btnRecruitment.click();
	}
	
	public void goToPIM() {
		btnPIM.click();
	}	
}
