package test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void afTest() {
		System.out.println("I get executed last in Test scope");
	}
	
	@AfterSuite
	public void afSuite() {
		System.out.println("I get executed last in Suite scope");
	}
	
	@Test(groups={"Smoke"})
	public void demo() {
		System.out.println("Hello");
	}
	
	@Test
	public void secondTest() {
		System.out.println("Bye");
	}
}