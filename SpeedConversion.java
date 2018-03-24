package week7;

import java.util.Scanner;

/**
 * To-Do:
 * -program can transform unit quantities entered by user into  a chosen unit type
 * -using time, distance, speed "3 Measurements"
 * -convert using formulas
 * -create a separate method for each 3 conversions
 * -each method requires 1 or 2 input parameters and return correct values
 * -user interface
 * 
 * @author Connor Cunic
 *
 */

public class SpeedConversion {

	public static void main(String[] args) {
		//User Interface
		System.out.println("Unit Conversion Program\n"
				+ "Convert units of time, speed, and distance\n");
		
		programLoop();
		//The Program Ends
		System.out.println("Goodbye!");
	}
	/**
	 * This method is the loop that keeps the program running
	 */
	public static void programLoop() {
		String userEntry; //This variable takes the input from the scanner as a string
		Scanner sc = new Scanner(System.in);
		char c; //This variable holds the character of what the user enters at position 0
		boolean validEntry=true; //This variable is true when the user's input is valid
		
		//Loop for input
		while (validEntry) {
			//Print this every time
			System.out.println("\n----------------------------------------------------------\n"
					+"Type to make a selection of which conversion you need to make\n"
					+ "Type [x] to Exit\n\t"
					+ "Enter [s] speed, [t] time, [d] distance:   ");
			userEntry = sc.next();
	
			//Format the string just in-case
			userEntry = userEntry.toLowerCase();
			userEntry = userEntry.trim();
			//Get a value for the c variable
			c = userEntry.charAt(0);
			//Continue until the user decides to exit
			if (c=='s')
				validEntry = true;
			else if (c=='t')
				validEntry = true;
			else if (c=='d')
				validEntry = true;
			else if (c=='x')
				validEntry = false;
			else
				validEntry = true;
				//Call the method according to the character in the string
				switch (c) {
				case 's':
					speed(sc);
					break;
				case 't':
					time(sc);
					break;
				case 'd':
					distance(sc);
					break;
					
			}
		}
	}
	/**
	 * This method gets called when the user enters the letter 's'
	 * This method also asks for a number to convert and calls another method to convert it
	 * @param tempSc The Scanner
	 */
	public static void speed(Scanner tempSc) {
		double speedNum, newSpeed;
		System.out.println("Enter the number of mp/h you would like to convert into km/h:   ");
		speedNum = tempSc.nextDouble();
		
		//Perform Conversion
		newSpeed = convertMphToKph(speedNum); //Gets the new speed
		System.out.println(speedNum + " converted to km/h = " + newSpeed + "km/h");
	}
	/**
	 * This method gets called when the user enters the letter 'd'
	 * This method also asks for a number to convert and calls another method to convert it
	 * @param tempSc The Scanner
	 */
	public static void distance(Scanner tempSc) {
		double distanceNum, newDistance;
		System.out.println("Enter the number of miles you would like to convert into kilometers:   ");
		distanceNum = tempSc.nextDouble();
		
		//Perform Conversion
		newDistance = convertMiToKm(distanceNum); //Gets the new distance
		System.out.println(distanceNum + " converted to kilometers = " + newDistance + "km");
	}
	/**
	 * This method gets called when the user enters the letter 't'
	 * This method also asks for a number to convert and calls another method to convert it
	 * @param tempSc The Scanner
	 */
	public static void time(Scanner tempSc) {
		double timeNum, newTime;
		System.out.println("Enter the number of minutes you would like to convert into days:   ");
		timeNum = tempSc.nextDouble();
		
		//Perform Conversion
		newTime = convertMinToDays(timeNum);
		System.out.println(timeNum + " converted to days = " + newTime + " days");
	}
	/**
	 * This method takes a number in miles per hour and converts it into kilometers per hour
	 * @param mph The number entered by the user
	 * @return returns kilometers per hour
	 */
	public static double convertMphToKph(double mph) {
		//Formula
		double kph = (mph*1.60934);
		return kph;
	}
	/**
	 * This method is called strictly for converting miles to kilometers
	 * @param mi represents miles
	 * @return kilometers
	 */
	public static double convertMiToKm(double mi) {
		double km = (mi*1.6);
		return km;
	}
	/**
	 * This method converts minutes into days
	 * @param min represents minutes
	 * @return the percentage of a day in minutes basically
	 */
	public static double convertMinToDays(double min) {
		double days = (min*1440);
		return days;
	}
}
