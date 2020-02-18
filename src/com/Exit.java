package com;

import java.util.Scanner;

/*
 * This Exit class determines return the total score and details of the user
 *  exit method displays the count
 * 
*/
public class Exit {
	
	int flag;
	Scanner input = new Scanner(System.in);
	public void exit(int count)
	{
		
		System.out.println("The total number instruction that the user has tried :"+count);
		System.out.println("Interested in playing in different direction press 1 to proceed");
		flag = input.nextInt();
		if(flag == 1)
		{
			playagain();
		}
		else
		{
			System.out.println("Thanks for your time!!!!");
		}
		
	}
	public void playagain()
	{
		Start start = new Start();
		start.begin();
	}

}
