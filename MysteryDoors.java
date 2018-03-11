package week6;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * None of the art is mine... all from the internet
 * @author Connor
 * This program asks the user for an input of 1,2,or 3 and forms a sentence randomly from some hardcoded options
 */
public class MysteryDoors {
	public static void main(String[] args) {
		int headNum = 0;

		System.out.println("\n\n\t\tSEE WHO IS THE WINNER!  \n\tYou or SOMEONE you know may win something...\n\t\t    _____________\n\t\t   | PICK A HEAD |\n\n");
		System.out.println("    .-\"\"\"\"-.       .-\"\"\"\"-.       .-\"\"\"\"-.\r\n" + 
				"   /        \\     /        \\     /        \\\r\n" + 
				"  /_   1    _\\   /_   2    _\\   /_   3    _\\\r\n" + 
				" // \\      / \\\\ // \\      / \\\\ // \\      / \\\\\r\n" + 
				" |\\__\\    /__/| |\\__\\    /__/| |\\__\\    /__/|\r\n" + 
				"  \\    ||    /   \\    ||    /   \\    ||    /\r\n" + 
				"   \\        /     \\        /     \\        /\r\n" + 
				"    \\  __  /       \\  __  /       \\  __  /\r\n" + 
				"     '.__.'         '.__.'         '.__.'\r\n" + 
				"      |  |           |  |           |  |\r\n" + 
				"      |  |           |  |           |  |");
		programLoop(headNum);
		printAlien();
		System.out.println("Thanks for playing!!!");
	}
	/**
	 * This method forms the possible sentence options for #1
	 */
	public static void headOne() {
		Random r = new Random();
		int money = r.nextInt();
		boolean noMoney=false;
		String moneyVar="";
		//If the money won is negative, make it zero to avoid hurt feelings
		if (money<0) {
			money=0;
			noMoney=true;
		}
		
		if (noMoney)
			moneyVar=" won no money";
		else
			moneyVar=" won $" + money;
		
		System.out.println(whoIsTheWinner()
				+ moneyVar + " and a trip to "+ randomMethod("North Korea.", "Canada.", "the mothership."));
	}
	/**
	 * This method forms the possible sentence options for #2
	 */
	public static void headTwo() {
		System.out.println(whoIsTheWinner() +" won a new car! It is a " 
				+ randomMethod("Chevy ", "Lambo ", "Ford ")
				+ randomMethod("with NO TIRES!","with a turbo!","without an engine."));
	}
	/**
	 * This method forms the possible sentence options for #3
	 */
	public static void headThree() {
		System.out.println("You win this amazing " 
				+ randomMethod("toothbrush and " 
				+ randomMethod("toothpaste", "floss", "mouthwash")+".", "industrial popcorn machine.", randomMethod("high res","low res","sepia") + " television."));


	}
	/**
	 * This method chooses between multiple possible options the winner could be
	 */
	public static String whoIsTheWinner()
	{
		return (randomMethod("You"
				, "Your " + randomMethod("mom", "cousin", "grandpa")  
				, randomMethod("Bill Cosby", "Will Smith", "Michael Jackson")));
	}
	/**
	 * This method is responsible for keeping the program going
	 */
	public static void programLoop(int value) {
		do {
			try {
				//value is the variable that stores the number the user entered to determine which head they chose
				value = getEntry();
			} catch (InputMismatchException e) {
				value = 0;
			}
			//runs the method tied to choosing either of the heads
			switch (value) {
			case 1:
				headOne();
				break;
			case 2:
				headTwo();
				break;
			case 3:
				headThree();
				break;
			}
		} while (value>0 && value<4);
	}
	/**
	 * This method is used to randomly choose between 3 different strings
	 */
	public static String randomMethod(String varOne, String varTwo, String varThree)
	{
		//Create random and get the number to determine the output
		Random r = new Random();
		int randomNum = r.nextInt(3) + 1;
		String var = null;
		//If 1,2,3... the output becomes either varOne,varTwo, or varThree
		if (randomNum==1)
			var=varOne;
		else if(randomNum==2)
			var=varTwo;
		else if(randomNum==3)
			var=varThree;
		
		//When the method is called either of the three possible options will be used for output
		return var;
	}
	/**
	 * This method gets player input looking for an answer of either 1,2, or 3
	 */
	public static int getEntry()  {

		Scanner sc = new Scanner(System.in);
		boolean entry = false; //true if the input is 1,2,3
		int value = 0;
		
		System.out.print("Enter a number 1 to 3: ");
		
		do {
			
			value = sc.nextInt();
			
				printAlien();
			//validate user input
			if (value>0 && value<4)
				entry=true;
			else
				entry=false;
		//don't stop until you get the answer	
		} while(!entry);
		
		return value;
	}
	/**
	 * This method prints out the alien NOT MINE got it online.
	 */
 	public static void printAlien() {
		System.out.println("\r\n" + 
				".     .       .  .   . .   .   . .    +  .\r\n" + 
				"  .     .  :     .    .. :. .___---------___.\r\n" + 
				"       .  .   .    .  :.:. _\".^ .^ ^.  '.. :\"-_. .\r\n" + 
				"    .  :       .  .  .:../:            . .^  :.:\\.\r\n" + 
				"        .   . :: +. :.:/: .   .    .        . . .:\\\r\n" + 
				" .  :    .     . _ :::/:               .  ^ .  . .:\\\r\n" + 
				"  .. . .   . - : :.:./.                        .  .:\\\r\n" + 
				"  .      .     . :..|:                    .  .  ^. .:|\r\n" + 
				"    .       . : : ..||        .                . . !:|\r\n" + 
				"  .     . . . ::. ::\\(                           . :)/\r\n" + 
				" .   .     : . : .:.|. ######              .#######::|\r\n" + 
				"  :.. .  :-  : .:  ::|.#######           ..########:|\r\n" + 
				" .  .  .  ..  .  .. :\\ ########          :######## :/\r\n" + 
				"  .        .+ :: : -.:\\ ########       . ########.:/\r\n" + 
				"    .  .+   . . . . :.:\\. #######       #######..:/\r\n" + 
				"      :: . . . . ::.:..:.\\           .   .   ..:/\r\n" + 
				"   .   .   .  .. :  -::::.\\.       | |     . .:/\r\n" + 
				"      .  :  .  .  .-:.\":.::.\\             ..:/\r\n" + 
				" .      -.   . . . .: .:::.:.\\.           .:/\r\n" + 
				".   .   .  :      : ....::_:..:\\   ___.  :/\r\n" + 
				"   .   .  .   .:. .. .  .: :.:.:\\       :/\r\n" + 
				"     +   .   .   : . ::. :.:. .:.|\\  .:/|\r\n" + 
				"     .         +   .  .  ...:: ..|  --.:|\r\n" + 
				".      . . .   .  .  . ... :..:..\"(  ..)\"\r\n" + 
				" .   .       .      :  .   .: ::/  .  .::\\"
				+ "*  **");
	}
}
