package com.trial2mvn.Pack2;

import org.testng.annotations.Test;

import com.GenericUtils.BaseClass_Trial;

public class Gitpracttest extends BaseClass_Trial
{
	@Test (groups="smoke")
	public void mvnTest1()
	{
		System.out.println("Trial 1 is running fine");
	}

}
