package com.medialets.controller;

import com.medialets.data.MedialetsSignUpData;
import com.medilets.base.WebDriverWrapper;
import com.medilets.model.MedialetsSignUpModel;

import static org.junit.Assert.assertTrue;

/**
 * User: reaz
 * 
 */
public class MedialetsSignUpController extends WebDriverWrapper {
    private MedialetsSignUpModel model = new MedialetsSignUpModel();
    private MedialetsSignUpData data = new MedialetsSignUpData();
    
    public MedialetsSignUpController() {
        super();
        model = new MedialetsSignUpModel();
    }
    
    public void enterFirstName() {
        type(model.getFirstNameTextbox(), data.getFirstName());
    }

    public void enterLastname() {
        type(model.getLastNameTextbox(), data.getLastName());
    }

    public void enterCompany() {
        type(model.getCompanyTextbox(), data.getCompany());
    }
    
    public void enterTitle(){
    	type(model.getTitleTextBox(),data.getTitle());
    }

    public void enterPhone() {
        type(model.getPhoneTextbox(), data.getPhoneNumber());
    }

    public void enterEmail() {
        type(model.getEmailTextbox(), data.getEmail());
    }
    
    public void enterConfirmEmail(){
    	type(model.getConfirmEmailTextbox(),data.getConfirmEmail());
    }
    
    public void enterPassword(){
    	type(model.getPasswordTextbox(),data.getPassword());
    }
    
    public void confirmPassword(){
    	type(model.getConfirmPasswordTextbox(),data.getConfirmPassword());
    }

    public void clickSignUpNow() {
        click(model.getSignUpNowButton());
    }

    public void signUpComplete() {
        waitForTextPresent("Thanks for signing up!");
        assertTrue("Unable to complete sign up", isTextPresent("Thanks for signing up!"));
        assertTrue("Unable to complete sign up", isTextPresent("Check your inbox for an email with instructions on completing your account creation process."));
    }

    public void verifyFnameEmpty() {
        assertTrue("First Name Field empty messege  verification", isTextPresent("First name can't be blank"));
    }

    public void verifyLnameEmpty() {
        assertTrue("Last Name Field empty messege  verification", isTextPresent("Last name can't be blank"));
    }

    public void verifyCompanyNameEmpty() {
        assertTrue("Company Name Field empty messege  verification", isTextPresent("desired_team_name can't be blank"));
    }

    public void verifyEmailEmpty() {
        assertTrue("Email Field empty messege  verification", isTextPresent("Email can't be blank"));
    }


    public void verifyPassword() {
        assertTrue("Website URL format verification", isTextPresent("Password is too short (minimum is 6 characters)"));
    }

    public void enterAllrequiredFields() {
        enterFirstName();
        enterLastname();
        enterCompany();
        enterTitle();
        enterPhone();
        enterEmail();
        enterConfirmEmail();
        enterPassword();
        confirmPassword();
    }

    public void allEmptyFiled() {
        clickSignUpNow();
        verifyFnameEmpty();
        verifyLnameEmpty();
        verifyCompanyNameEmpty();
        verifyEmailEmpty();
        verifyPassword();
    }
}
