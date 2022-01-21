package main.java.pages;

import main.java.utils.Elements;
import test.java.BaseTest;

public class MiroLanding {
    private static final String signupBtn = "//header//li[contains(.,'Sign up')]";
    Elements elements = new Elements();
    public void clickOnSignupBtn(){
        BaseTest.logger.info("Clicking on sign up button");
        elements.getWebElement("XPATH", signupBtn).click();
    }



}
