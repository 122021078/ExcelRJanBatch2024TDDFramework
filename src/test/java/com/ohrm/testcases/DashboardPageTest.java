package com.ohrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orhm.pages.DashboardPage;
import com.orhm.pages.LoginPage;

public class DashboardPageTest {
	
	DashboardPage dp;
	LoginPage lp;
	
	@BeforeMethod
	public void browserSetup() {
		lp = new LoginPage();
		lp.initialization();
	}
	
	@Test
	public void validateTimeWorkSectionTest() {
		dp = lp.login();
		Assert.assertTrue(dp.getTimeWorkSection());
	}
	
	@Test
	public void validateMyActionsTest() {
		dp = lp.login();
		Assert.assertTrue(dp.getMyActions());
	}
	
	@Test
	public void validateQuickLaunch() {
		dp = lp.login();
		Assert.assertTrue(dp.getQuickLaunch());
	}
	
	@Test
	public void validateBuzzLatestPost() {
		dp = lp.login();
		Assert.assertTrue(dp.getBuzzLatestPosts());
	}
	
	@Test
	public void validateEmployeesONLeaveToday() {
		dp = lp.login();
		Assert.assertTrue(dp.getEmployeesONLeaveToday());
	}
	
	@Test
	public void validateEmployeeDistributionBySubUnit() {
		dp = lp.login();
		Assert.assertTrue(dp.getEmployeeDistributionBySubUnit());
	}
	
	@Test
	public void validateEmployeeDistributionByLocation() {
		dp = lp.login();
		Assert.assertTrue(dp.getEmployeeDistributionByLocation());
	}
	
	// write TC for remaining 6 sections
	
	@AfterMethod
	public void closeBrowser() {
		dp.tearDown();
	}

}
