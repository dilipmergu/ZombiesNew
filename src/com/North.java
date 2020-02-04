package com;

import java.util.Scanner;

public class North implements Weapons{
	
	String userinput;
	Scanner input = new Scanner(System.in);
	GameInstructions instr = new GameInstructions();
	public void begin()
	{
		
		System.out.println(instr.inStruction1);
		next();
		command();
		
		/*
		 * if(userinput==instr.inStruction4) { System.out.println(instr.inStruction5);
		 * userinput = input.next(); }
		 * 
		 * if(userinput==instr.inStruction6) { System.out.println(instr.inStruction7);
		 * userinput = input.next(); }
		 * 
		 * if(userinput==instr.inStruction8) { System.out.println(instr.inStruction9);
		 * userinput = input.next(); }
		 * 
		 * if(userinput==instr.inStruction10) { System.out.println(instr.inStruction11);
		 * userinput = input.next(); }
		 * 
		 * if(userinput==instr.inStruction12) { System.out.println(instr.inStruction13);
		 * userinput = input.next(); }
		 * 
		 * if(userinput==instr.inStruction14) { System.out.println(instr.inStruction15);
		 * userinput = input.next(); }
		 * 
		 * if(userinput==instr.inStruction16) { System.out.println(instr.inStruction17);
		 * userinput = input.next(); }
		 * 
		 * if(userinput==instr.inStruction18) { System.out.println(instr.inStruction19);
		 * 
		 * }
		 * 
		 * if(userinput==instr.inStruction20) { System.out.println(instr.inStruction21);
		 * userinput = input.next(); }
		 * 
		 * if(userinput==instr.inStruction22) { System.out.println(instr.inStruction23);
		 * userinput = input.next(); }
		 * 
		 * if(userinput==instr.inStruction24) { System.out.println(instr.inStruction25);
		 * userinput = input.next(); }
		 * 
		 * if(userinput==instr.inStruction26) { System.out.println(instr.inStruction27);
		 * userinput = input.next(); }
		 * 
		 * if(userinput==instr.inStruction28) { System.out.println(instr.inStruction29);
		 * userinput = input.next(); }
		 * 
		 * if(userinput==instr.inStruction30) { System.out.println(instr.inStruction31);
		 * }
		 */
		
		
	}
	public void next()
	{

		userinput = input.nextLine();
		//System.out.println("next loop start");
		if(userinput.equals(instr.inStruction2))
		{
			System.out.println(instr.inStruction3);
			System.out.print("Type your command :::");
			//userinput = input.next();
			next1();
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
			System.out.print("Type your command :::");
			//userinput = input.next();
			next2();
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
			System.out.println(instr.inStruction7);
			System.out.print("Type your command :::");
			//userinput = input.next();
			next3();
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
			System.out.print("Type your command :::");
			//userinput = input.next();
			next4();
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
			System.out.println(instr.inStruction11);
			System.out.print("Type your command :::");
			//userinput = input.next();
			next5();
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
			System.out.print("Type your command :::");
			//userinput = input.next();
			next6();
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
			System.out.print("Type your command :::");
			//userinput = input.next();
			next7();
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
			System.out.print("Type your command :::");
			//userinput = input.next();
			next8();
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
			System.out.print("Type your command :::");
			//userinput = input.next();
			next9();
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
			System.out.print("Type your command :::");
			//userinput = input.next();
			next10();
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
			System.out.print("Type your command :::");
			//userinput = input.next();
			next11();
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
			System.out.print("Type your command :::");
			//userinput = input.next();
			next12();
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
			System.out.print("Type your command :::");
			//userinput = input.next();
			next13();
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
			System.out.print("Type your command :::");
			//userinput = input.next();
			next14();
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
	public void shoot() {
		
		
	}
	public void command() {
		System.out.print("Type your command ::");
	}
}
