//CIT 111
//Connor Cunic
import java.util.Scanner; //Utilize java scanner
public class Gas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double mpg;
		double driverGas;
		double milesToStation;
		
		System.out.println("**********HURRY UP!************"
				+ "\nHow many gallons of gas remain in your tank?");
		driverGas = sc.nextDouble();
		System.out.println("How many miles to the next service station?");
		milesToStation = sc.nextDouble();
		System.out.println("Enter the car's mpg rating");
		mpg = sc.nextDouble();
		
		if (mpg>0 && driverGas>0 && milesToStation>0) {	//Checking for negative values
			if (driverGas*mpg>milesToStation) {	//Is there enough gas?
				System.out.println("You can make it to the next station. Don't miss it.");
			} else {
				double milesLeft = milesToStation - (driverGas*mpg); //Calculate miles left
				double optimalMpg = milesToStation/driverGas; //Calculate mpg required to reach the station
				System.out.println("You won't make it unless you can acheive " + optimalMpg + " mpg."
						+ "\nYou have " + milesLeft + " miles left once you run out of gas."
						+ "\nYou need " + (milesLeft/mpg) + " gallons of gas.");
			}
		} else {
			System.out.println("Restart plz"); //Tell user to restart the program.
		}
		
	}
}
