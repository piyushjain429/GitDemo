package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	
	@Parameters({"URL"})
	@Test(groups={"Smoke"})
	public void ploan(String url) {
		System.out.println("Good");
		System.out.println(url);
	}
}