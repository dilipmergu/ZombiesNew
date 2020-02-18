package com;


/*
 * Start class for begining of the game
 * @param counts to store the number instructions that the user has tried
 * @param choice for the user input
 * method north calls the North class
 * method south calls the south class
 * method west calls the west class
 * method counter for incrementing the number of instructions that the user has tried
*/
import java.util.Scanner;

public class Start implements Directions {

	Scanner sc = new Scanner(System.in);
	int counts = 0;
	
	public void begin() {

		
		System.out.println("Welcome to Zombieland.. \n where do you want move by choosing the number");
		System.out.println("            ************           ");
		System.out.println("1.North of Zombieland"+"\n"+"2.South of Zombieland"+"\n"+"3.East of zombieland");
		int choice = sc.nextInt();
		if(choice==1)
		{
			counter();
			north();
		}
		else if(choice == 2){
			counter();
			south();
		}
		else if(choice == 3)
		{
			counter();
			east();
		}
		else
		{
			System.out.println("please choose the proper option to proceed further");
			counter();
			begin();
		}
		

	}
	
	@Override
	public void north() {
		// TODO Auto-generated method stub
		North north = new North();
		System.out.println("         *********         ");
		System.out.println(" Use the keywords break, knife and gun to pass thorugh the first instructions");
		System.out.println("         *********        \n ");
		north.begin(counts);
		counter();
		
	}

	@Override
	public void south() {
		// TODO Auto-generated method stub
		South south = new South();
		System.out.println("         *********         ");
		System.out.println(" Use the keywords enter, begin and block to pass thorugh the first instructions");
		System.out.println("         *********         \n");
		south.begin(counts);
		counter();
		
	}

	@Override
	public void east() {
		// TODO Auto-generated method stub
		East east = new East();
		System.out.println("\nsmall hint\nUse the keyword 'exit' for ending the game\n\n");
		east.begin(counts);
		counter();
	}
	public void counter()
	{
		counts=counts+1;
	}

}