package main.java.pages;

import main.java.utils.Elements;
import org.testng.Assert;
import test.java.BaseTest;

public class EmailConfirmPage extends BaseTest {

    private static final String signupPageTextTN = "h1";
    Elements elements = new Elements();

    public void confEmailPage(){
        BaseTest.logger.info("Verifying Email conf Page");
        String title = BaseTest.driver.getTitle();
        String titleExpected = "Please check your email, Online Whiteboard | Miro";
        Assert.assertEquals(title, titleExpected);
        String headerText = elements.getWebElement("TAGNAME",signupPageTextTN ).getText();
        String expectedHeader = "Check your email";
        Assert.assertEquals(headerText,expectedHeader);
    }
}
