package com.orhm.pages;                    //26-02-2024

import org.openqa.selenium.By;

import com.ohrm.base.OrangeHRMBase;

public class DashboardPage extends OrangeHRMBase {
	
	public boolean getDashboardLabel() {
		return driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
	}
	
	public boolean getTimeWorkSection() {
		return driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
	}
	
	public boolean getMyActions() {
		return driver.findElement(By.xpath("//p[text()='My Actions']")).isDisplayed();
		
	}
	
	public boolean getQuickLaunch() {
		return driver.findElement(By.xpath("//p[text()='Quick Launch']")).isDisplayed();
		
	}
	
	public boolean getBuzzLatestPosts() {
		return driver.findElement(By.xpath("//p[text()='Buzz Latest Posts']")).isDisplayed();
		
	}
	
	public boolean getEmployeesONLeaveToday() {
		return driver.findElement(By.xpath("//p[text()='Employees on Leave Today']")).isDisplayed();
		
	}
	
	public boolean getEmployeeDistributionBySubUnit() {
		return driver.findElement(By.xpath("//p[text()='Employee Distribution by Sub Unit']")).isDisplayed();
		
	}
	
	public boolean getEmployeeDistributionByLocation() {
		return driver.findElement(By.xpath("//p[text()='Employee Distribution by Location']")).isDisplayed();
		
	}
	
}



