package com;

import java.util.Scanner;

public class South implements Weapons{
	
	String userinput;
	int countst = 0;
	InstructionsSouth instr = new InstructionsSouth();
	Scanner input = new Scanner(System.in);
	Exit exit = new Exit();
	public void begin(int countn)
	{
		System.out.println(instr.inStruction1);
		countst = countst+countn;
		next();	
	}
	public void next()
	{
		
		System.out.println(instr.inStruction2 +" "+instr.inStruction4);
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
			exit.exit(countst);
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

		System.out.println(instr.inStruction4 +" "+instr.inStruction6);
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
			exit.exit(countst);
		}
		else
		{
			//System.out.println("else loop");
			command();
			next();			
		}
	}
	public void next2()
	{

		System.out.println(instr.inStruction8 +" "+instr.inStruction6);
		userinput = input.nextLine();
		//System.out.println("next loop start");
		if(userinput.equals(instr.inStruction6))
		{
			System.out.println(instr.inStruction7);
			command();
			//userinput = input.next();
			next3();
		}
		else if(userinput.equals("exit"))
		{
			exit.exit(countst);
		}
		else
		{
			//System.out.println("else loop");
			command();
			next2();			
		}
	}
	public void next3()
	{

		System.out.println(instr.inStruction8 +" "+instr.inStruction10);
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
			exit.exit(countst);
		}
		else
		{
			//System.out.println("else loop");
			command();
			next3();			
		}
	}
	public void next4()
	{

		System.out.println(instr.inStruction12 +" "+instr.inStruction10);
		userinput = input.nextLine();
		//System.out.println("next loop start");
		if(userinput.equals(instr.inStruction10))
		{
			System.out.println(instr.inStruction11);
			command();
			//userinput = input.next();
			next5();
		}
		else if(userinput.equals("exit"))
		{
			exit.exit(countst);
		}
		else
		{
			//System.out.println("else loop");
			command();
			next4();			
		}
	}
	public void next5()
	{

		System.out.println(instr.inStruction8 +" "+instr.inStruction12);
		userinput = input.nextLine();
		//System.out.println("next loop start");
		if(userinput.equals(instr.inStruction12))
		{
			gun();
			command();
			//userinput = input.next();
			next6();
		}
		else if(userinput.equals("exit"))
		{
			exit.exit(countst);
		}
		else
		{
			//System.out.println("else loop");
			command();
			next5();			
		}
	}
	public void next6()
	{

		System.out.println(instr.inStruction14 +" "+instr.inStruction10);
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
			exit.exit(countst);
		}
		else
		{
			//System.out.println("else loop");
			command();
			next6();			
		}
	}
	public void next7()
	{

		System.out.println(instr.inStruction12 +" "+instr.inStruction16);
		userinput = input.nextLine();
		//System.out.println("next loop start");
		if(userinput.equals(instr.inStruction16))
		{
			knife();
			command();
			exit.exit(countst);
		}
		else
		{
			//System.out.println("else loop");
			command();
			next();			
		}
	}
	@Override
	public void gun()
	{
		System.out.println(instr.inStruction13);
	}
	public void counter() 
	{	
		countst = countst+1;
		//System.out.println(count);
		//return count;
		
	}
	public void command() {
		System.out.print("Type your command ::");
		counter();
	}
	@Override
	public void Granade() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void knife() {
		// TODO Auto-generated method stub
		System.out.println(instr.inStruction17);
	}

}
