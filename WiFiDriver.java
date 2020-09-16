/** This program will try to solve an individual’s computer issue with their Wi-Fi connection by going through as many steps it
takes to fix their problem (maximum of 5), and the fifth and final step will suggest the user to contact their ISP. Author: Andrew Quintana */
import java.util.Scanner;

public class WiFiDriver 
{
	public static void main(String[] args) 
	{
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
		Scanner userInput = new Scanner(System.in);
		System.out.println("First step: reboot your computer\nAre you able to connect with the internet? (yes or no)");
		String answer = userInput.nextLine();
		if(answer.equals("yes"))
		{
			System.out.println("Rebooting your computer seemed to work.\nProgrammer: Andrew Quintana");
			System.exit(0);
		}
		else
		{
			System.out.println("Second step: reboot your router");
		}
		System.out.println("Now are you able to connect with the internet? (yes or no)");
		answer = userInput.nextLine();
		if(answer.equals("yes"))
		{
			System.out.println("Rebooting your router seemed to work.\nProgrammer: Andrew Quintana");
			System.exit(0);
		}
		else
		{
			System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
		}
		System.out.println("Now are you able to connect with the internet? (yes or no)");
		answer = userInput.nextLine();
		if(answer.equals("yes"))
		{
			System.out.println("Checking the router's cables seemed to work.\nProgrammer: Andrew Quintana");
			System.exit(0);
		}
		else
		{
			System.out.println("Fourth step: move your computer closer to your router");
		}
		System.out.println("Now are you able to connect with the internet? (yes or no)");
		answer = userInput.nextLine();
		if(answer.equals("yes"))
		{
			System.out.println("Moving your computer close to your router seemed to work.\nProgrammer: Andrew Quintana");
			System.exit(0);
		}
		else
		{
			System.out.println("Fifth step: contact your ISP\nMake sure your ISP is hooked up to your router.\nProgrammer: Andrew Quintana");
			System.exit(0);
		}
	}
}