package com.medialets.test;

import com.medialets.controller.MedialetsSignUpController;
import com.medilets.base.MedialetsBase;
import org.junit.Test;

/**
 * User: reaz
 * 
 */
public class MedialetsSignUpTest extends MedialetsBase {

    MedialetsSignUpController adLeadSignupPage = new MedialetsSignUpController();

    @Test
    public void adLeadRegistration() {
        adLeadSignupPage.enterAllrequiredFields();
        adLeadSignupPage.clickSignUpNow();
        adLeadSignupPage.signUpComplete();
    }

    @Test
    public void allFieldsEmpty() {
        adLeadSignupPage.allEmptyFiled();
    }

    @Test
    public void PhoneNumberFormatCheck() {
        adLeadSignupPage.enterAllrequiredFields();
        adLeadSignupPage.clickSignUpNow();
    }

    @Test
    public void WebSiteURLCheck() {
        adLeadSignupPage.enterAllrequiredFields();
        adLeadSignupPage.clickSignUpNow();
    }
}
