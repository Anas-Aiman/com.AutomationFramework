package main.java.pages;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import main.java.utils.Elements;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import test.java.BaseTest;

public class SignUpPage {


    private static final String nameBoxP = "//input[@id='name']";
    private static final String emailBoxP = "//input[@id='email']";
    private static final String pwdBoxP = "//input[@id='password']";
    private static final String tcCheckboxCss = "label[class='mr-checkbox-1__check ']";
    private static final String submitBtnCss = "button[type='submit']";
    private static final String emailError = "//label[@id='emailError']";
    Elements elements = new Elements();

    public void verifySignupPage(){
        BaseTest.logger.info("Verifying SignupPage");
        String title = BaseTest.driver.getTitle();
        String titleExpected = "Sign up | Miro | Online Whiteboard for Visual Collaboration";
        Assert.assertEquals(title, titleExpected);
    }

    public void enterName(){
        BaseTest.logger.info("Entering Name");
        WebElement NameBox = elements.getWebElement("XPATH", nameBoxP);
        NameBox.clear();
        NameBox.sendKeys("Anas");
    }
    public void enterEmail(){
        BaseTest.logger.info("Entering Email");
        WebElement EmailBox = elements.getWebElement("XPATH", emailBoxP);
        EmailBox.clear();
        EmailBox.sendKeys("anasaiman93+2331@gmail.com");
    }
    public void enterPassword(){
        BaseTest.logger.info("Entering Pwd");
        WebElement pwdBox = elements.getWebElement("XPATH", pwdBoxP);
        pwdBox.clear();
        pwdBox.sendKeys("Password");
    }
    public void checkTC(){
        BaseTest.logger.info("Clicking Checkbox");
        WebElement checkBox = elements.getWebElement("CSS", tcCheckboxCss);
        checkBox.click();
    }
    public void clickOnSubmit(){
        BaseTest.logger.info("Submit");
        WebElement submitBtn = elements.getWebElement("CSS", submitBtnCss);
        submitBtn.click();
    }
//    public String emailErrText(){
//        WebElement emailErrorElement = elements.getWebElement("XPATH", emailError);
//        String emailErrorText = emailErrorElement.getText();
//        return emailErrorText;
//    }

}
