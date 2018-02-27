//CIT 111 Connor Cunic
//Program asks the user to answer given math problem

import java.util.Random; //Utilize both classes
import java.util.Scanner;
public class Quiz {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); //for user input
		Random r = new Random(); //for random numbers
		int num1 = 0; //represents the first number in calculation
		int num2 = 0; //represents the second number
		int symbol = 0; //the symbol uses a numeric system to represent[+,-,*,/]
		int userAnswer = 0; //answer given by user
		int realAnswer = 0; //correct answer
		int cummulativeAnswer = 0; //accounts for the previous answers
		int correctAnswers = 0; //number of times the user attempted
		System.out.println("Will you be able to Math today?");

		
		String question = "Answer the question: "; //holds the question and math problem
		
		//Add to the math problem when the user gets the right answer
		for (int i = 0; i <= correctAnswers; i++)
		{
			//Randomize the problem
			num1 = r.nextInt(10) + 0;
			num2 = r.nextInt(10) + 1;
			symbol = r.nextInt(3) + 0;
			//The true answer = the answer to the original question plus the new question
			realAnswer =  cummulativeAnswer + getAnswer(num1,num2,symbol);
			//Formulate the sentence/question
			switch (symbol) {
			case 0:
				question += num1 + " + " + num2;
				break;
			case 1:
				question += num1 + " - " + num2;
				break;
			case 2: 
				question += num1 + " * " + num2;
				break;
			case 3:
				question += num1 + "/" + num2;
				break;
			}
			System.out.println(question);
			
			//Get the user's answer
			userAnswer = sc.nextInt();
			//Check answer
			if (userAnswer==realAnswer) {
				//The user got the question right
				correctAnswers++;
				System.out.println("Correct Answer! " + realAnswer);
				question += " + ";
				cummulativeAnswer = realAnswer;
			} else  {
				//Allow the user 2 more chances making that 3 total
				int attempt = 1;
				//If the answer is wrong, try again
				while (userAnswer!=realAnswer) {
					if (userAnswer<realAnswer)
						System.out.println("Too low");
					if (userAnswer>realAnswer)
						System.out.println("Too high");
					System.out.println("Try Again: ");
					userAnswer = sc.nextInt();
					if (userAnswer==realAnswer) {
						//They got the answer right on the second or third attempt
						correctAnswers++;
						System.out.println("Correct Answer! " + realAnswer);
						question += " + ";
						cummulativeAnswer = realAnswer;
					}
					attempt++;
					if (attempt>=3) {
						//They failed to get the answer right after 3 tries
						System.out.println("The answer is found using the "
								+ "order of operations.\nThe correct answer"
								+ "is " + realAnswer);
						userAnswer = realAnswer;
					}

				}
					
			}
	
		}

	}
	//Calculates the answer of basic math
	public static int getAnswer(int firstNum, int secNum, int symbolNum)
	{
		int ans = 0;
		switch (symbolNum) {
			case 0: ans = (firstNum + secNum);
			break;
			case 1: ans = (firstNum - secNum);
			break;
			case 2: ans = (firstNum * secNum);
			break;
			case 3: ans = (firstNum / secNum);
			break;
		}
		return ans;
	}
}
