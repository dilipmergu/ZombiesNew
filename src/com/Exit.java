package com;

public class Exit {
	
	int total=0;
	UserData user = new UserData();
	public void exit(int count)
	{
		System.out.println("Name : "+ user.getUserName());
		System.out.println("Age :"+user.getUserAge());
		System.out.println("The total number instruction that the user has tried :"+count);
		
	}

}
