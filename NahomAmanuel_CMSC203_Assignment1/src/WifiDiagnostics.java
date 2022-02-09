import java.util.Scanner;

public class WifiDiagnostics {

	public static void main(String[] args) {
		System.out.println("If you have a problem with internet connectivity, this wifi diagnosis might work.");
		System.out.println("");
		System.out.println("First step: reboot your computer");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		Scanner keyboard = new Scanner(System.in);
		String rebootCPrmt = keyboard.next();
		if (rebootCPrmt.equals("yes"))
				{
			System.out.println("Rebooting your computer seemed to work");
			System.exit(0);
				}
		else if (rebootCPrmt.equals("no"))
				{
			;
				}
		System.out.println("Second step: reboot your router");
		System.out.println("Now are you able to connect with the internet? (yes or no)");
		String rebootRPrmt = keyboard.next();
		if (rebootRPrmt.equals("yes"))
		{
			System.out.println("Rebooting your router seemed to work");
			System.exit(0);
		}	
		else if (rebootRPrmt.equals("no"))
		{
			;
		}
System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
System.out.println("Now are you able yo connect with the internet? (yes or no)");
String cableCheck = keyboard.next();
if (cableCheck.equals("yes"))
		{
	System.out.println("Making sure your cables are plugged firmly seemed to work");
	System.exit(0);
		}
else if (cableCheck.equals("no"))
{
;
}
System.out.println("Fourth step: move your computer close to the router");
System.out.println("Now are you able to connect with the internet? (yes or no) ");
String computerPos = keyboard.next();
if (computerPos.equals("yes"))
		{
	System.out.println("Moving your computer seemed to work");
	System.exit(0);
		}
else if (computerPos.equals("no"))
{
	System.out.println("Fifth step: contact your ISP");
	System.out.println("Make sure your ISP is hooked up to your router.");
}

	
	}

}
