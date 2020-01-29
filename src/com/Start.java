package com;

import java.util.Scanner;

public class Start extends UserData implements Weapons {

	Scanner sc = new Scanner(System.in);

	public Start(String userName, String dateOfBirth, String gender, int userAge) {

		super(userName, dateOfBirth, gender, userAge);
		Begin();

		// TODO Auto-generated constructor stub

	}

	public void Begin() {

		System.out.println("you have 3 regions you can move");

		System.out.println("1.North of Jombiland");

		System.out.println("2.South of Jombiland");

		System.out.println("3.West of Jombiland");

		System.out.println("please enter your choice");

		int i = sc.nextInt();

		if (i == 1) {

			System.out.println("You have entered into the North of Jombiland");

			System.out.println("you have three weapons to pick and proceed forward");

			System.out.println("1.Gun 2.Sword 3.Granite 4.Missile Launcher");

			int choice = sc.nextInt();

			if (choice == 1) {

				gun();

			}

			else if (choice == 2) {

				Missile();

			}

			else if (choice == 3) {

				Sword();

			}

		}

		else if (i == 2) {

			System.out.println("You have entered into the South of Jombiland");

		} else if (i == 3) {

			System.out.println("You have entered into the west of Jombiland");

		}

	}

	@Override

	public void gun() {

		System.out.println("...");

	}

	@Override

	public void Missile() {

		// TODO Auto-generated method stub

		System.out.println("booom..");

	}

	@Override

	public void Sword() {

		// TODO Auto-generated method stub

		System.out.println("cut into pieces");

	}

}

class Initial {

	String userName;

	String dateOfBirth;

	String gender;

	int userAge;

	Scanner sc = new Scanner(System.in);

	public void intialise() {

		System.out.println("Enter the your Name");

		userName = sc.next();

		System.out.println("Enter the Date of Birth");

		dateOfBirth = sc.next();

		System.out.println("Enter the Gender");

		gender = sc.next();

		System.out.println("Enter the Age");

		userAge = sc.nextInt();

		Start userdata = new Start(userName, dateOfBirth, gender, userAge);

	}

}
