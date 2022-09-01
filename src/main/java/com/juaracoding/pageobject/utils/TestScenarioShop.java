package com.juaracoding.pageobject.utils;

public enum TestScenarioShop {
	
	T1("User choose clothes"),
	T2("User choose clothes"),
	T3("User checkout");
	
	private String testShopName;
	
	private TestScenarioShop(String value) {
		testShopName = value;
	}
	
	public String getTestShopName() {
		return testShopName;
	}

}
