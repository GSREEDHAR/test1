package com.qmetry.qaf.example.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriverCommandAdapter;
import static com.qmetry.qaf.automation.step.CommonStep.click;

import static com.qmetry.qaf.automation.step.CommonStep.get;

import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;


import com.qmetry.qaf.automation.util.Reporter;

public class TC_002  extends QAFWebDriverCommandAdapter {  

    @QAFDataProvider(dataFile = "testdata\\Qlodata.xls", sheetName = "login") 

    @Test(description = "Login", groups = { "SMOKE" }) 

    public void Address(Map<String, String> data) throws InterruptedException { 

        // Logger log=Logger.getLogger(dataLoginExcel.class); 

            get("https://demo.qloapps.com/login?back=my-account"); 

            //getDriver().manage().window().maximize(); 

            clear("LEmail"); 

            sendKeys(data.get("email1"), "LEmail"); 

            clear("LPassword"); 

            sendKeys(data.get("pswd"), "LPassword"); 

            Thread.sleep(6000); 

            click("LButton"); 

            Thread.sleep(6000); 

            click("click.addmyaddress"); 

            //click("click.myaddress"); 

            Thread.sleep(6000); 

         //   click("click.addnewaddress"); 

            clear("input.firstname1"); 

            sendKeys(data.get("Firstname"), "input.firstname1"); 

            clear("input.lastname1"); 

            sendKeys(data.get("Lastname"), "input.lastname1"); 

            Thread.sleep(6000); 

            sendKeys(data.get("Company"), "input.company"); 

            Thread.sleep(6000); 

            sendKeys(data.get("Address"), "input.address"); 

            Thread.sleep(6000); 

            sendKeys(data.get("Address2"), "input.address2"); 

            Thread.sleep(6000); 

            sendKeys(data.get("City1"), "input.city"); 

            Thread.sleep(6000); 

            sendKeys(data.get("City2"), "input.state"); 

            Thread.sleep(6000); 

            sendKeys(String.valueOf(data.get("Zipcode")), "input.zipcode"); 

            

            Thread.sleep(6000); 

            sendKeys(String.valueOf(data.get("country")), "input.country"); 

            Thread.sleep(6000); 

            sendKeys(String.valueOf(data.get("Home")), "input.homenumber"); 

             

            Thread.sleep(6000); 

            sendKeys(String.valueOf(data.get("Mobile")), "input.mobile"); 

            

            Thread.sleep(6000); 

            sendKeys(data.get("Additional"), "input.additional"); 

            Thread.sleep(6000); 

            clear("input.myaddress1"); 

            sendKeys(data.get("Myaddress"), "input.myaddress1"); 

            Thread.sleep(6000); 

            Reporter.logWithScreenShot("pass"); 

            click("click.save"); 

            Reporter.logWithScreenShot("pass"); 

           // click("click.update"); 

             

           // click("click.logout"); 

          

} {

}
