package main.java.utils;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import test.java.BaseTest;

import java.io.File;
import java.io.IOException;

public class SuiteListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        String fileName = System.getProperty("user.dir") + File.separator + "screenshots" + File.separator + result.getMethod().getMethodName();
        File f = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(f, new File(fileName + ".png"));
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
