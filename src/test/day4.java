package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day4 {
	
	@Test
	public void webLoginHomeLoan() {
		System.out.println("webLoginHome");
	}
	
	@Test
	public void mobileLoginHomeLoan() {
		System.out.println("mobileLoginHome");
	}
	
	@AfterClass
	public void afClass() {
		System.out.println("I get executed Last in a Class scope");
	}
	
	@BeforeMethod
	public void bfMethod() {
		System.out.println("I get executed before every test in a class");
	}
	
	@AfterMethod
	public void afMethod() {
		System.out.println("I get executed after every test in a class");
	}
	
	@Test
	public void apiLoginHomeLoan() {
		System.out.println("apiLoginHome");
	}
	
	@BeforeTest
	public void first() {
		System.out.println("I get executed First in Test scope");
	}
	
	@BeforeClass
	public void bfClass() {
		System.out.println("I get executed First in a Class scope");
	}
}
