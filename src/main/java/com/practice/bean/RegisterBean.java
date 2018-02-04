package com.practice.bean;

import java.util.List;
import java.util.Map;

public class RegisterBean {
	
	private String userId;
	private List phoneNumbers;
	private Map countries;
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setPhoneNumbers(List phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public void setCountries(Map countries) {
		this.countries = countries;
	}
	
	public void showData() {
		System.out.println("User Id is : "+userId);
		System.out.println("Phone Numbers : "+phoneNumbers);
		System.out.println("Countries List is : "+countries);

	}

}
