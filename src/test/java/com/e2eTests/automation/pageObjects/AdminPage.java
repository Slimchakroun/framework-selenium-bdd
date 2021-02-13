package com.e2eTests.automation.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminPage {

	/* Locators */
	final static String BUTTON_ADMIN_ID = "menu_admin_viewAdminModule";
	final static String USERNAME_ID = "searchSystemUser_userName";
	final static String BUTTON_SEARCH_ID = "searchBtn";
	final static String MESSAGE_ID = "resultTable";
	final static String PAGE_ADMIN_ID = "menu_admin_UserManagement";
	final static String BUTTON_ADD_ID = "btnAdd";
	final static String USER_ROLE_XPATH = "//option[contains(text(),'Admin')]";
	final static String EMPLOYEE_NAME_ID = "systemUser_employeeName_empName";
	final static String USER_NAME_ID = "systemUser_userName";
	final static String STATUS_XPATH = "//option[contains(text(),'Disabled')]";
	final static String PSWD_ID = "systemUser_password";
	final static String CONF_PSWD_ID = "systemUser_confirmPassword";
	final static String BUTTON_SAVE_ID = "btnSave";
	final static String MESSAGE_SAVE_XPATH = "//div[@class='message success fadable']";

	/* FindBy */
	@FindBy(how = How.ID, using = BUTTON_ADMIN_ID)
	public static WebElement btnAdmin;
	@FindBy(how = How.ID, using = USERNAME_ID)
	public static WebElement usname;
	@FindBy(how = How.ID, using = BUTTON_SEARCH_ID)
	public static WebElement btnSearch;
	@FindBy(how = How.ID, using = MESSAGE_ID)
	public static WebElement messageSearch;
	@FindBy(how = How.ID, using = PAGE_ADMIN_ID)
	public static WebElement pageAdmin;
	@FindBy(how = How.ID, using = BUTTON_ADD_ID)
	public static WebElement btnAdd;
	@FindBy(how = How.XPATH, using = USER_ROLE_XPATH)
	public static WebElement userRole;
	@FindBy(how = How.ID, using = EMPLOYEE_NAME_ID)
	public static WebElement employeeName;
	@FindBy(how = How.ID, using = USER_NAME_ID)
	public static WebElement username;
	@FindBy(how = How.XPATH, using = STATUS_XPATH)
	public static WebElement status;
	@FindBy(how = How.ID, using = PSWD_ID)
	public static WebElement pswd;
	@FindBy(how = How.ID, using = CONF_PSWD_ID)
	public static WebElement ConfPswd;
	@FindBy(how = How.ID, using = BUTTON_SAVE_ID)
	public static WebElement btnSave;
	@FindBy(how = How.XPATH, using = MESSAGE_SAVE_XPATH)
	public static WebElement messageSave;



	/* Methods */
	public void goToAdmin() {
		btnAdmin.click();
	}

	public void fillUsername(String username) {
		usname.sendKeys(username);
	}

	public void clickSearch() {
		btnSearch.click();
	}

	public void clickAdd() {
		btnAdd.click();
	}

	public void clickUserRole() {
		userRole.click();
	}

	public void fillEmployeeName(String name) {		    
		employeeName.sendKeys(name);
		employeeName.sendKeys(Keys.ENTER);
	}
	
	public void fillName(String username1) {		    
		username.sendKeys(username1);
	}
	
	public void clickStatus() {
		status.click();
	}
	
	public void fillPswd(String pswd1) {
		pswd.sendKeys(pswd1);
	}
	
	public void fillConfPswd(String pswd2) {
		ConfPswd.sendKeys(pswd2);
	}
	
	public void clickSave() {
		btnSave.click();
	}
}
