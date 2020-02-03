package com;

import java.util.Scanner;

public class UserData {

	private String UserName, DateOfBirth, Gender;

	private int UserAge;

	public UserData(String userName, String dateOfBirth, String gender, int userAge) {

		// super();

		this.UserName = userName;

		this.DateOfBirth = dateOfBirth;

		this.Gender = gender;

		this.UserAge = userAge;

	}
	public UserData() {
		
	}

	public String getUserName() {

		return UserName;

	}

	public void setUserName(String userName) {

		UserName = userName;

	}

	public String getDateOfBirth() {

		return DateOfBirth;

	}

	public void setDateOfBirth(String dateOfBirth) {

		DateOfBirth = dateOfBirth;

	}

	public String getGender() {

		return Gender;

	}

	public void setGender(String gender) {

		Gender = gender;

	}

	public int getUserAge() {

		return UserAge;

	}

	public void setUserAge(int userAge) {

		UserAge = userAge;

	}
}
