package com.ohrm.testcases;             //26-02-2024

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ohrm.utility.ExcelReaderUtility;
import com.orhm.pages.DashboardPage;
import com.orhm.pages.LoginPage;

public class LoginPageTest {
	
	//write 2 TC
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	
	//TC 1 validate title
	
	LoginPage lp;
	DashboardPage dp;
		
	@BeforeMethod
	public void browsersetup() {
	    lp = new LoginPage();
	    lp.initialization();
    }
	
	@Test
	public void validateTitleTest() {
		String exptitle = "OrangeHRM";
		String acttitle = lp.getTitle();
	    Assert.assertEquals(acttitle, exptitle);
	}
	
    //TC2 : validate login
	
	@Test
	public void validateLoginTest() {
		dp = lp.login();
        Assert.assertTrue(dp.getDashboardLabel());
        lp.captureScreenshot("Login TC");
	}
	
	// write one tc for data provider    //29-02-2024
	@Test(dataProvider = "getLoginData")
    public void validateLoginMultipleData(String username, String password) {
		dp = lp.login(username, password);
	    Assert.assertTrue(dp.getDashboardLabel());
	}
	
	@DataProvider                      //29-02-2024
	public Object[][] getLoginData() {
		String path = "./src/test/resources/TestData/Book1.xlsx" ;
		String SheetName = "Sheet1";
		 return ExcelReaderUtility.getData(path, SheetName);
	}
	
	// write a TC to validate that
	// when clicked on forgotpassword link
	// Reset password page is open
	
	
	@AfterMethod
	public void closeBrowser() {
		lp.tearDown();
	}
	
}










