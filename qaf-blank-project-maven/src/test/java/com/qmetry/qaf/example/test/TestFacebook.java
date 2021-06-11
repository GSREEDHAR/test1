package com.qmetry.qaf.example.test;

import static com.qmetry.qaf.automation.step.CommonStep.get;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class TestFacebook extends WebDriverTestCase {
	
	@Test
	public void testGoogleSearch() {
		get("http://www.facebook.com");
	}
	

}
