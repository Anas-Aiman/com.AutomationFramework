package main.java.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.java.BaseTest;

import java.util.List;

public class Elements {

    public WebElement getWebElement(String LocatorType, String LocatorValue){
        switch (LocatorType){
            case "ID":
                return BaseTest.driver.findElement(By.id(LocatorValue));
            case "CSS":
                return BaseTest.driver.findElement(By.cssSelector(LocatorValue));
            case "XPATH":
                return BaseTest.driver.findElement(By.xpath(LocatorValue));
            case "TAGNAME":
                return BaseTest.driver.findElement(By.tagName(LocatorValue));
            default:
                return null;
        }
    }
    public List<WebElement> getWebElements(String LocatorType, String LocatorValue){
        switch (LocatorType){
            case "ID":
                return BaseTest.driver.findElements(By.id(LocatorValue));
            case "CSS":
                return BaseTest.driver.findElements(By.cssSelector(LocatorValue));
            case "XPATH":
                return BaseTest.driver.findElements(By.xpath(LocatorValue));
            case "TAGNAME":
                return BaseTest.driver.findElements(By.tagName(LocatorValue));
            default:
                return null;
        }
    }
}
