package test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void webLoginCarLoan() {
		System.out.println("webLoginCar");
	}
	
	@Test(dataProvider="getData")
	public void webLogoutCarLoan(String username, String password) {
		System.out.println("webLogoutCar");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Parameters({"URL","APIKey/usrname"})
	@Test
	public void webForgotCarLoan(String url, String key) {
		System.out.println("webForgotCar");
		System.out.println(url);
		System.out.println(key);
	}
	
	@Test(dependsOnMethods = {"webLogoutCarLoan"})
	public void mobileLoginCarLoan() {
		System.out.println("mobileLoginCar");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I get executed first in Suite scope");
	}
	
	@Test
	public void mobileLogoutCarLoan() {
		System.out.println("mobileLogoutCar");
	}
	
	@Test(timeOut=4000)
	public void mobileForgotCarLoan() {
		System.out.println("mobileForgotCar");
	}
	
	@Test(groups={"Smoke"},enabled=false)
	public void apiLoginCarLoan() {
		System.out.println("apiLoginCar");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		//1st Set
		data[0][0] = "firstUsername";
		data[0][1] = "firstPassword";
		
		//2nd Set
		data[1][0] = "secondUsername";
		data[1][1] = "secondPassword";
		
		//3rd Set
		data[2][0] = "thirdUsername";
		data[2][1] = "thirdPassword";
		return data;
	}
}
