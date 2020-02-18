package com;

/*
 * Initial class used to take the basic details of the user by command
 * method validatedob used to validate the date of birth
 * method validateage used to validate the age
 * method validategender to make sure the gender is either male or female
 * @param userName to store the user name
 * @param dateOfBirth to store the date of birth of user
 * @param gender to store gender of the user
 * @param userAge to age of the user
*/
import java.util.Scanner;

class Initial {

	String userName,dateOfBirth,gender;

	int userAge;

	Scanner sc = new Scanner(System.in);

	public void intialise() {

		System.out.println("Enter the your Name");

		userName = sc.next();

		System.out.println("Enter the Date of Birth with the folowing format ddmmyyyy");

		dateOfBirth = sc.next();
		
		validatedob(dateOfBirth);

		System.out.println("Enter the Gender");

		gender = sc.next();
		
		validategender(gender);

		System.out.println("Enter the Age");

		userAge = sc.nextInt();
		
		validateage(userAge);


	}
	public void validategender(String gender) {
		if(gender.equals("male")||gender.equals("female"))
		{
			
		}
		else
		{
			System.out.println("please enter proper gender either male or female");
			gender = sc.next();
			validategender(gender);			
		}
		
	}
	public void playagain()
	{
		intialise();
	}

	public void validatedob(String dob)
	{
		if(dob.length()==8)
		{
			String dates = dob.substring(0, 2);
			int date = Integer.parseInt(dates);
			String datem = dob.substring(2, 4);
			int month = Integer.parseInt(datem);
			String datey = dob.substring(4, 8);
			int year = Integer.parseInt(datey);
			if(date>=1&&date<=31)
			{
				
			}
			else
			{
				System.out.println("please enter proper date of birth");
				dateOfBirth = sc.next();
				validatedob(dateOfBirth);
			}
			if(month>=1&&month<=12)
			{
				
			}
			else
			{
				System.out.println("please enter proper date of birth");
				dateOfBirth = sc.next();
				validatedob(dateOfBirth);
			}
			if(year>=1900&&month<=2010)
			{
				
			}
			else
			{
				System.out.println("please enter proper date of birth");
				dateOfBirth = sc.next();
				validatedob(dateOfBirth);
			}
			
		}
		else
		{
			System.out.println("please enter proper date of birth");
			dateOfBirth = sc.next();
			validatedob(dateOfBirth);
		}
	}
	public void validateage(int age)
	{
		if(age>0&&age<100)
		{
			
		}
		else
		{
			System.out.println("please enter proper age");
			userAge = sc.nextInt();
			validateage(userAge);
		}
		
	}

}

