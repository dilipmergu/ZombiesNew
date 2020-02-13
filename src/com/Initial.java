package com;

import java.util.Scanner;

class Initial {

	String userName;

	String dateOfBirth;

	String gender;

	int userAge;

	Scanner sc = new Scanner(System.in);

	public void intialise() {

		System.out.println("Enter the your Name");

		userName = sc.next();

		System.out.println("Enter the Date of Birth with the folowing format dd-mm-yyyy");

		dateOfBirth = sc.next();

		System.out.println("Enter the Gender");

		gender = sc.next();

		System.out.println("Enter the Age");

		userAge = sc.nextInt();

		Start userdata = new Start(userName, dateOfBirth, gender, userAge);

	}
	public void playagain()
	{
		intialise();
	}

}

