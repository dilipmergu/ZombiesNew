package com;

/*
 * The Directions interface is used to declare the methods of the different directons that the user can travel
 * method north in north direction
 * method south in south direction
 * method west in east direction
 * method counter to count the instructions
*/
public interface Directions {

	public void north();
	public void south();
	public void east();
	public void counter();
}
