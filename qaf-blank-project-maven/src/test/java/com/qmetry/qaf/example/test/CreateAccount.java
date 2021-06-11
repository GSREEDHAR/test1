package com.qmetry.qaf.example.test;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriverCommandAdapter;
import static com.qmetry.qaf.automation.step.CommonStep.click;

import static com.qmetry.qaf.automation.step.CommonStep.get;

import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import java.util.Map;

import com.qmetry.qaf.automation.util.Reporter;

public class CreateAccount extends QAFWebDriverCommandAdapter {

@QAFDataProvider(dataFile = "resources\\TestData.xls", sheetName = "login")

@Test(description = "Createaccount" )

public void Createaccount(Map<String, String> data) throws InterruptedException {

get("/");

click("click.sigin");

Thread.sleep(5000);

sendKeys(data.get("email1"), "input.Email");

click("click.create");

click("click.mrs");

sendKeys(data.get("Firstname"), "input.firstname");

sendKeys(data.get("Lastname"), "input.lastname");

sendKeys(data.get("pswd"), "input.password");

sendKeys(String.valueOf(data.get("days")), "input.days");

sendKeys(String.valueOf(data.get("month")), "input.months");

sendKeys(String.valueOf(data.get("year")), "input.years");

click("click.register");

Thread.sleep(6000);

Reporter.logWithScreenShot("pass");

}
}