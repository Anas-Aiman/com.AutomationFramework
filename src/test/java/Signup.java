package test.java;

import main.java.pages.MiroLanding;
import main.java.pages.SignUpPage;
import org.testng.annotations.Test;

public class Signup extends BaseTest{
    MiroLanding MiroLandingPage = new MiroLanding();
    SignUpPage SignUpPage = new SignUpPage();
    @Test
    public void signupTest(){

        MiroLandingPage.clickOnSignupBtn();
        SignUpPage.verifySignupPage();
        SignUpPage.enterName();
        SignUpPage.enterEmail();
        SignUpPage.enterPassword();
        SignUpPage.checkTC();
        SignUpPage.clickOnSubmit();

    }
}
