package com;

/*
 * East class is used for two obstacles based on the choices that the user can check
 * method begin is used to start in east direction
 * @param break1 is used to user input
 * method gun1 is fire gun for one obstacle
*/
import java.util.Scanner;

public class East {
	Scanner sc = new Scanner(System.in);
	Exit exit = new Exit();
	int countet =0;
	public void begin(int count) {
		String break1;
		countet = countet=count;
		System.out.println("East of Zombieland");
		System.out.println("You are know infront of Bar...\n A person is stuck in the bar between two zombies 'break' the door");
		do {
			break1 = sc.nextLine();
			if (break1.equals("break")) {
				counter();
				System.out.println("you broke the door and entered the bar. The two zombies are there.");
				System.out.println("Pick Up the bottle and 'hit' with bottle");
				for (int i = 1; i <= 2; i++) {
					break1 = sc.nextLine();
					if (i == 1) {

						if (break1.equals("hit")) {
							counter();
							System.out.println("you hit hard one zombie its almost on its head, hit with another one");
						} else {
							System.out.println("give a try once again");
							i = i - 1;
							counter();
						}
					} else if (i == 2) {
						if (break1.equals("hit")) {
							counter();
							System.out.println("Yes thats it you have killed one the Next one is coming.");
							gun1();
						} else {
							System.out.println("give a try once again");
							i = i - 1;
							counter();
						}
					}

				}
				break;
			}
			if(break1.equals("exit"))
			{
				exit.exit(countet);
			}

			else {
				System.out.println("give a try once again");
			}
		} while (break1.equals("break") == true);

	}

	public void gun1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Now you spray the smoke with extinguisher into zombies eyes");
		System.out.println("'click' the button");
		String click;
		do {
			click = sc.nextLine();
			if (click.equals("click")) {
				counter();
				System.out.println("You sprayed well into the eyes now it cannot see you.Pick the gun on the table and shoot.");
				System.out.println("'pick'the gun");
				do {
					click = sc.nextLine();

					if (click.equals("pick")) {
						counter();
						System.out.println("you picked the gun");
						System.out.println("Now give two 'shot's with hand gun into its head");
						for (int i = 1; i <= 2; i++) {
							click = sc.nextLine();
							if (i == 1) {
								if (click.equals("shot")) {
									counter();
									System.out.println("yes you are close enough shoot another one");
								} else {
									System.out.println("give a try once again");
									i = i - 1;
									counter();
								}

							} else if (i == 2) {
								if (click.equals("shot")) {
									counter();
									System.out.println("Its dead now you saved the person.");
									exit.exit(countet);
								} else {
									System.out.println("give a try once again");
									i = i - 1;
									counter();
								}

							}

						}

					}
					if(click.equals("exit"))
					{
						exit.exit(countet);
					}

					else {
						System.out.println("give a try once again");
					}
					
				} while (click.equals("pick") == false);

			}

			else {
				System.out.println("give a try once again");
			}

		} while (click.equals("click") == false);

	}
	public void counter()
	{
		countet = countet+1;
	}

}
