package com;

import java.util.Scanner;

public class North implements Weapons{
	
	String userinput;
	int count = 0;
	Scanner input = new Scanner(System.in);
	GameInstructions instr = new GameInstructions();
	Exit exit = new Exit();
	public void begin(int countn)
	{
		System.out.println(instr.inStruction1);
		count = count+countn;
		next();	
	}
	public void next()
	{

		userinput = input.nextLine();
		//System.out.println("next loop start");
		if(userinput.equals(instr.inStruction2))
		{
			System.out.println(instr.inStruction3);
			command();
			//userinput = input.next();
			next1();
		}
		else if(userinput.equals("exit"))
		{
			exit.exit(count);
		}
		else
		{
			//System.out.println("else loop");
			command();
			next();			
		}
	}
	public void next1()
	{

		userinput = input.nextLine();
		//System.out.println("next loop start");
		if(userinput.equals(instr.inStruction4))
		{
			System.out.println(instr.inStruction5);
			command();
			//userinput = input.next();
			next2();
		}
		else if(userinput.equals("exit"))
		{
			exit.exit(count);
		}
		else
		{
			//System.out.println("else loop");
			command();
			next1();			
		}
	}
	public void next2()
	{

		userinput = input.nextLine();
		//System.out.println("next loop start");
		if(userinput.equals(instr.inStruction6))
		{
			gun();
			command();
			//userinput = input.next();
			next3();
		}
		else if(userinput.equals("exit"))
		{
			exit.exit(count);
		}
		else
		{
			command();
			//System.out.println("else loop");
			next2();			
		}
	}
	public void next3()
	{

		userinput = input.nextLine();
		//System.out.println("next loop start");
		if(userinput.equals(instr.inStruction8))
		{
			System.out.println(instr.inStruction9);
			command();
			//userinput = input.next();
			next4();
		}
		else if(userinput.equals("exit"))
		{
			exit.exit(count);
		}
		else
		{
			command();
			//System.out.println("else loop");
			next3();			
		}
	}
	public void next4()
	{

		userinput = input.nextLine();
		//System.out.println("next loop start");
		if(userinput.equals(instr.inStruction10))
		{
			Granade();
			command();
			//userinput = input.next();
			next5();
		}
		else if(userinput.equals("exit"))
		{
			exit.exit(count);
		}
		else
		{
			command();
			//System.out.println("else loop");
			next4();			
		}
	}
	public void next5()
	{

		userinput = input.nextLine();
		//System.out.println("next loop start");
		if(userinput.equals(instr.inStruction12))
		{
			System.out.println(instr.inStruction13);
			command();
			//userinput = input.next();
			next6();
		}
		else if(userinput.equals("exit"))
		{
			exit.exit(count);
		}
		else
		{
			command();
			//System.out.println("else loop");
			next5();			
		}
	}
	public void next6()
	{

		userinput = input.nextLine();
		//System.out.println("next loop start");
		if(userinput.equals(instr.inStruction14))
		{
			System.out.println(instr.inStruction15);
			command();
			//userinput = input.next();
			next7();
		}
		else if(userinput.equals("exit"))
		{
			exit.exit(count);
		}
		else
		{
			command();
			//System.out.println("else loop");
			next6();			
		}
	}
	public void next7()
	{

		userinput = input.nextLine();
		//System.out.println("next loop start");
		if(userinput.equals(instr.inStruction16))
		{
			System.out.println(instr.inStruction17);
			command();
			//userinput = input.next();
			next8();
		}
		else if(userinput.equals("exit"))
		{
			exit.exit(count);
		}
		else
		{
			command();
			//System.out.println("else loop");
			next7();			
		}
	}
	public void next8()
	{

		userinput = input.nextLine();
		//System.out.println("next loop start");
		if(userinput.equals(instr.inStruction18))
		{
			System.out.println(instr.inStruction19);
			command();
			//userinput = input.next();
			next9();
		}
		else if(userinput.equals("exit"))
		{
			exit.exit(count);
		}
		else
		{
			command();
			//System.out.println("else loop");
			next8();			
		}
	}
	public void next9()
	{

		userinput = input.nextLine();
		//System.out.println("next loop start");
		if(userinput.equals(instr.inStruction20))
		{
			System.out.println(instr.inStruction21);
			command();
			//userinput = input.next();
			next10();
		}
		else if(userinput.equals("exit"))
		{
			exit.exit(count);
		}
		else
		{
			command();
			//System.out.println("else loop");
			next9();			
		}
	}
	public void next10()
	{

		userinput = input.nextLine();
		//System.out.println("next loop start");
		if(userinput.equals(instr.inStruction22))
		{
			System.out.println(instr.inStruction23);
			command();
			//userinput = input.next();
			next11();
		}
		else if(userinput.equals("exit"))
		{
			exit.exit(count);
		}
		else
		{
			command();
			//System.out.println("else loop");
			next10();			
		}
	}
	public void next11()
	{

		userinput = input.nextLine();
		//System.out.println("next loop start");
		if(userinput.equals(instr.inStruction24))
		{
			System.out.println(instr.inStruction25);
			command();
			//userinput = input.next();
			next12();
		}
		else if(userinput.equals("exit"))
		{
			exit.exit(count);
		}
		else
		{
			command();
			//System.out.println("else loop");
			next11();			
		}
	}
	public void next12()
	{
		userinput = input.nextLine();
		//System.out.println("next loop start");
		if(userinput.equals(instr.inStruction26))
		{
			System.out.println(instr.inStruction27);
			command();
			//userinput = input.next();
			next13();
		}
		else if(userinput.equals("exit"))
		{
			exit.exit(count);
		}
		else
		{
			command();
			//System.out.println("else loop");
			next12();			
		}
		
		
	}
	public void next13()
	{
		userinput = input.nextLine();
		//System.out.println("next loop start");
		if(userinput.equals(instr.inStruction28))
		{
			System.out.println(instr.inStruction29);
			command();
			//userinput = input.next();
			next14();
		}
		else if(userinput.equals("exit"))
		{
			exit.exit(count);
		}
		else
		{
			command();
			//System.out.println("else loop");
			next13();			
		}
		
		
	}
	public void next14()
	{
		userinput = input.nextLine();
		//System.out.println("next loop start");
		if(userinput.equals(instr.inStruction30))
		{
			System.out.println(instr.inStruction31);
			
			exit.exit(count);
		}
		else
		{
			command();
			//System.out.println("else loop");
			next12();			
		}
		
		
	}
	

	@Override
	public void gun() {
		// TODO Auto-generated method stub
		System.out.println(instr.inStruction7);
	}

	@Override
	public void Granade() {
		// TODO Auto-generated method stub
		System.out.println(instr.inStruction11);
		
	}

	@Override
	public void knife() {
		// TODO Auto-generated method stub
		System.out.println(instr.inStruction32);
		
	}
	@Override
	public void counter() 
	{	
		count = count+1;
		//System.out.println(count);
		//return count;
		
	}
	public void command() {
		System.out.print("Type your command ::");
		counter();
	}
}
