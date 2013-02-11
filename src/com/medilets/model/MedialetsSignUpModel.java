package com.medilets.model;

/**
 * User: reaz
 */
public class MedialetsSignUpModel {

	private String firstNameTextbox = "user_first_name";
	private String lastNameTextbox = "user_last_name";
	private String companyTextbox = "user_desired_team_name";
	private String titleTextBox = "user_title";

	private String phoneTextbox = "user_phone_number";
	private String emailTextbox = "user_email";
	private String confirmEmailTextbox = "user_email_confirmation";
	private String passwordTextbox = "user_password";
	private String confirmPasswordTextbox = "user_password_confirmation";

	private String signUpNowButton = ".submit";
	private String cancelButton = ".cancel";

	// for appLead
	private String appNamesTextbox = "appNames";

	public String getFirstNameTextbox() {
		return firstNameTextbox;
	}

	public String getLastNameTextbox() {
		return lastNameTextbox;
	}

	public String getCompanyTextbox() {
		return companyTextbox;
	}

	public String getPhoneTextbox() {
		return phoneTextbox;
	}

	public String getEmailTextbox() {
		return emailTextbox;
	}

	public String getSignUpNowButton() {
		return signUpNowButton;
	}

	public String getAppNamesTextbox() {
		return appNamesTextbox;
	}

	public String getTitleTextBox() {
		return titleTextBox;
	}

	public String getConfirmEmailTextbox() {
		return confirmEmailTextbox;
	}

	public String getPasswordTextbox() {
		return passwordTextbox;
	}

	public String getConfirmPasswordTextbox() {
		return confirmPasswordTextbox;
	}

	public String getCancelButton() {
		return cancelButton;
	}

}
