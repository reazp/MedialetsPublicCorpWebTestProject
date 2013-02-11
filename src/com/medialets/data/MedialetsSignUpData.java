package com.medialets.data;

/**
 * User: reaz 
 */
public class MedialetsSignUpData {

	private String firstName;
	private String lastName;
	private String company;
	private String title;
	private String phoneNumber;
	private String email;
	private String confirmEmail;
	private String password;
	private String confirmPassword;

	public MedialetsSignUpData() {
		setFirstName("Test User First Name").setLastName("Test User Last name")
				.setCompany("Test Company").setPhoneNumber("212-212-2121")
				.setEmail("testemail@test.com")
				.setConfirmEmail("testemail@test.com");
		setPassword("testPass");
		setConfirmPassword("testPass");
		setTitle("Test Architect");

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getConfirmEmail() {
		return confirmEmail;
	}

	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public MedialetsSignUpData setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public MedialetsSignUpData setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getCompany() {
		return company;
	}

	public MedialetsSignUpData setCompany(String company) {
		this.company = company;
		return this;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public MedialetsSignUpData setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public MedialetsSignUpData setEmail(String email) {
		this.email = email;
		return this;
	}

}
