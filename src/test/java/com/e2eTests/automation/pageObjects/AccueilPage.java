package com.e2eTests.automation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccueilPage {

	final static String BUTTON_RECRUITMENT_ID = "menu_recruitment_viewRecruitmentModule";
	final static String PAGE_RECRUITMENT_ID = "menu_recruitment_viewCandidates";
	final static String BUTTON_PIM_ID = "menu_pim_viewPimModule";
	final static String PAGE_PIM_ID = "menu_pim_Configuration";
	final static String BUTTON_ADMIN_ID = "menu_admin_viewAdminModule";
	final static String USERNAME_ID = "searchSystemUser_userName";
	final static String BUTTON_SEARCH_ID = "searchBtn";
	final static String MESSAGE_ID = "resultTable";

	/* @FindBy */
	@FindBy(how = How.ID, using = BUTTON_RECRUITMENT_ID)
	public static WebElement btnRecruitment;
	@FindBy(how = How.ID, using = PAGE_RECRUITMENT_ID)
	public static WebElement pageRecruitment;	
	@FindBy(how = How.ID, using = BUTTON_PIM_ID)
	public static WebElement btnPIM;	
	@FindBy(how = How.ID, using = PAGE_PIM_ID)
	public static WebElement pagePIM;
	@FindBy(how = How.ID, using = BUTTON_ADMIN_ID)
	public static WebElement btnAdmin;
	@FindBy(how = How.ID, using = USERNAME_ID)
	public static WebElement usname;
	@FindBy(how = How.ID, using = BUTTON_SEARCH_ID)
	public static WebElement btnSearch;
	@FindBy(how = How.ID, using = MESSAGE_ID)
	public static WebElement messageAdmin;
	
	/* Method */
	public void goToRecruitment() {
		btnRecruitment.click();
	}
	
	public void goToPIM() {
		btnPIM.click();
	}
	
	public void goToAdmin() {
		btnAdmin.click();
	}
	
	public void fillUsername(String username) {
		usname.sendKeys(username);
	}
	
	public void clickSearch() {
		btnSearch.click();
	}
	
}
