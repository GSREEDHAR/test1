package com.qmetry.qaf.example.test;
import static com.qmetry.qaf.automation.step.CommonStep.click;

import static com.qmetry.qaf.automation.step.CommonStep.get;

import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;



import com.qmetry.qaf.automation.util.Reporter;

import java.util.Map;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class TC_007 extends WebDriverTestCase { 

 

    @QAFDataProvider(dataFile = "testdata\\Qlodata.xls", sheetName = "login") 

    @Test(description = "Login", groups = { "SMOKE" }) 

 

    public void Remove(Map<String, String> data) throws InterruptedException { 

            

    	 get("/"); 

            getDriver().manage().window().maximize(); 

           sendKeys("United States", "hotel_loc"); 

        

        	click("hotel_in"); 

        	Thread.sleep(3000); 

        	click("hotel_inD"); 

        	Thread.sleep(3000); 

        	click("hotel_out"); 

        	Thread.sleep(3000); 

        	click("hotel_ouD"); 

        	Thread.sleep(3000); 

        	 click("hotel_sel"); 

             Thread.sleep(3000); 

             	click("hotel_nam"); 

             	Thread.sleep(3000); 

        	click("search_hotel"); 

        	Thread.sleep(3000); 

        	click("book_lux"); 

        	Thread.sleep(3000); 

        	click("proceed"); 

        	//Thread.sleep(6000); 

        //	mouseOver("cart"); 

        	Thread.sleep(3000); 

        //	mouseOver("x"); 

        //	click("x"); 

        	click("Remove"); 

        	Thread.sleep(3000); 

        	Reporter.logWithScreenShot("pass"); 

                 

}  {

}
