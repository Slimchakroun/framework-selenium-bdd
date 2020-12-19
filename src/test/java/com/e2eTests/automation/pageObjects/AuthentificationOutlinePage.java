package com.e2eTests.automation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthentificationOutlinePage {

	
	final static String USER_NAME_ID = "txtUsername";
	final static String PASSWORD_ID = "txtPassword";
	final static String LOGIN_ID = "btnLogin";
	final static String MESSAGE_ID = "welcome";
	final static String MESSAGE_ERREUR_ID = "spanMessage";
	final static String FORGOT_PASSWORD_LINK_TEXT = "Forgot your password?";
	final static String MESSAGE_VERIFICATION_PASSWORD_XPATH = "//div[@class='head']";
	final static String USERNAME_ID = "securityAuthentication_userName";
	final static String RESET_PASSWORD_ID = "btnSearchValues";
	final static String MESSAGE_VERIFICATION_RESET_XPATH = "//div[@class='message warning fadable']";
	final static String WIDGET_LINKEDIN_XPATH = "//img[@alt='LinkedIn OrangeHRM group']";
	final static String PAGE_LINKEDIN_ID = "linkedin-logo";
	final static String WIDGET_FACEBOOK_XPATH = "//img[@alt='OrangeHRM on Facebook']";
	final static String PAGE_FACEBOOK_XPATH = "//h2[@dir='auto']";
	final static String WIDGET_TWITTER_XPATH = "//img[@alt='OrangeHRM on twitter']";
	final static String PAGE_TWITTER_XPATH = "//div[@dir='auto']";
	final static String WIDGET_YOUTUBE_XPATH = "//img[@alt='OrangeHRM on youtube']";
	final static String PAGE_YOUTUBE_ID = "text";

	/* @FindBy */
	@FindBy(how = How.ID, using = USER_NAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = PASSWORD_ID)
	public static WebElement password;
	@FindBy(how = How.ID, using = LOGIN_ID)
	public static WebElement btnlogin;
	@FindBy(how = How.ID, using = MESSAGE_ID)
	public static WebElement welcome;
	@FindBy(how = How.ID, using = MESSAGE_ERREUR_ID)
	public static WebElement errorMessages;
	@FindBy(how = How.LINK_TEXT, using = FORGOT_PASSWORD_LINK_TEXT)
	public static WebElement forgotPassword;
	@FindBy(how = How.XPATH, using = MESSAGE_VERIFICATION_PASSWORD_XPATH)
	public static WebElement messageVerificationPassword;
	@FindBy(how = How.ID, using = USERNAME_ID)
	public static WebElement fypUsername;
	@FindBy(how = How.ID, using = RESET_PASSWORD_ID)
	public static WebElement btnReset;
	@FindBy(how = How.XPATH, using = MESSAGE_VERIFICATION_RESET_XPATH)
	public static WebElement messageVerificationReset;
	@FindBy(how = How.XPATH, using = WIDGET_LINKEDIN_XPATH)
	public static WebElement btnLinkedIn;
	@FindBy(how = How.ID, using = PAGE_LINKEDIN_ID)
	public static WebElement pageLinkedIn;
	@FindBy(how = How.XPATH, using = WIDGET_FACEBOOK_XPATH)
	public static WebElement btnFacebook;
	@FindBy(how = How.ID, using = PAGE_FACEBOOK_XPATH)
	public static WebElement pageFacebook;
	@FindBy(how = How.XPATH, using = WIDGET_TWITTER_XPATH)
	public static WebElement btnTwitter;
	@FindBy(how = How.ID, using = PAGE_TWITTER_XPATH)
	public static WebElement pageTwitter;
	@FindBy(how = How.XPATH, using = WIDGET_YOUTUBE_XPATH)
	public static WebElement btnYoutube;
	@FindBy(how = How.ID, using = PAGE_YOUTUBE_ID)
	public static WebElement pageYoutube;

	/* Method */
	public void fillUserName(String name) {
		userName.sendKeys(name);
	}
	
	public void fillPassword(String pswd) {
		password.sendKeys(pswd);
	}
	
	public void clickLogin() {
		btnlogin.click();
	}
	
	public void clickForgotPassword(String link) {
		forgotPassword.click();
	}
	
	public void fillUsernameForgot(String username) {
		fypUsername.sendKeys(username);
	}
	
	public void clickResetPassword() {
		btnReset.click();
	}
	
	public void clickWidgetLinkedIn() {
		btnLinkedIn.click();
	}
	
	public Boolean isPageLinkedinDisplayed(WebElement element) {
		Boolean isPageLinkedinDisplayed = element.isDisplayed();
		return isPageLinkedinDisplayed;
		}
	
	public void clickWidgetFacebook() {
		btnFacebook.click();
	}
	
	public void clickWidgetTwitter() {
		btnTwitter.click();
	}
	
	public void clickWidgetYoutube() {
		btnYoutube.click();
	}
}
