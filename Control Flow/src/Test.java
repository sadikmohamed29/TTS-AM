
import java.util.*;

public class Test {

	public static void main(String[] args) {

		//	System.out.println("Hello World!");
		AsciiChars.printNumbers();
		AsciiChars.printUpperCaseLetters();
		AsciiChars.printLowerCaseLetters();
		userInput();

	}

	private static void userInput() {

		ArrayList<Test> answerList = new ArrayList<>();

		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);

		System.out.println("Please enter your name: ");
		String firstName = input.nextLine();
		System.out.printf("Hello %s!\n", firstName);

		System.out.println("Would you wish to continue? Enter yes or no.");
		String interestedAnswer = input.nextLine(); 
		String repeat = "yes";  


		if(interestedAnswer.equals("yes")) {
			while(repeat.equals("yes")) {


				System.out.println("Do you have a red car? Yes or No");
				String redCar = input.nextLine();

				System.out.println("What is the name of your favorite pet?");
				String namePet = input.nextLine();

				System.out.println("What is the first name of the your favorite actor or actress?");
				String favAct = input.nextLine();


				System.out.println("What is the age of your favorite pet?");
				int agePet = input1.nextInt();

				System.out.println("What is your lucky number?");
				int luckyNum = input1.nextInt();

				System.out.println("Do you have a favorite quarterback and/or athelete? If so what is the jersey number");
				int favQuarterback = input1.nextInt();

				System.out.println("What is the two-digit model year of your car?");
				int carYear = input1.nextInt();

				System.out.println("Enter a random number between 1 and 50.");
				int ranNum = input1.nextInt();


				int num1_random = (int) (Math.random() * 65);
				int num2_random = (int) (Math.random() * 65);
				int num3_random = (int) (Math.random() * 2);


				int mBall = 0;
				if(num3_random == 1) {	
					mBall = luckyNum * num1_random;	
				} 
				else {
					mBall = favQuarterback * num1_random;		
				}
				if(mBall > 75) {
					mBall -= 75;		
				}

				// Generate Values: 5 non-magic numbers
				int lottoNum1 = carYear + luckyNum;					
				int lottoNum2 = favQuarterback + luckyNum;			
				int lottoNum3 = 42;										
				int lottoNum4 = agePet + carYear;						
				int lottoNum5 = favQuarterback + agePet + luckyNum;	




				System.out.println("Lottery Numbers: " + lottoNum1 + ", " + lottoNum2 + ", " + lottoNum3 + ", " + lottoNum4 + ", " + lottoNum5 + " " + " Magic Ball: " + mBall);



				repeat = input.nextLine();



			}

		}
		else {
			System.out.println("Thank you for your input. Please return later to complete the survey.");
			System.exit(0);
		};


		HashMap<String, String> continueAnswer = new HashMap();


		continueAnswer.put("Yes", firstName);
		continueAnswer.put("YES", firstName);
		continueAnswer.put("Y", firstName);
		continueAnswer.put("yes", firstName);
		continueAnswer.put("y", firstName);


		Scanner replayInput = new Scanner(System.in);
		System.out.println("Would you wish to continue?");
		String interestedAnswer1 = replayInput.nextLine();       

		// if/else statement
		if (continueAnswer.containsKey(interestedAnswer1)){			
			System.out.println("Great! Let's continue.");


		}

		else {
			System.out.println("Thank you for your input. Please return later to complete the survey.");
			System.exit(0);
		};


	}


}