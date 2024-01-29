package com.TrialMaven.Pack1;

import org.testng.annotations.Test;

public class Demo2test {

	@Test
	public void sampleTest()
	{
		System.out.println("Hello");
		String BROWSER = System.getProperty("browser");
		String ENV = System.getProperty("Env");
		System.out.println(BROWSER);
		System.out.println(ENV);
	}
	
	@Test
	public void simpleTest()
	{
		System.out.println("World");
		System.out.println("TYSS");
	}
}
