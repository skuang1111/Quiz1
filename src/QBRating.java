import java.util.Scanner;

public class QBRating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to input for each of the five stats
		System.out.print("What's the player's touchdowns(TD)?: ");
		double touchdowns = input.nextDouble();
		
		System.out.print("What's the player's total yards(YDs)?: ");
		double totalYards = input.nextDouble();
		
		System.out.print("What's the player's interceptions(INT)?: ");
		double interceptions = input.nextDouble();
		
		System.out.print("What's the player's completions(comp)?: ");
		double completions = input.nextDouble();
		
		System.out.print("What's the player's number of passes attempted(ATT)?: ");
		double passesAttempted = input.nextDouble();
		
		//Computation
		double a = (completions / passesAttempted - 0.3) * 5.0;
		
		double b = (totalYards / passesAttempted - 3) * 0.25;
		
		double c = (touchdowns / passesAttempted) * 20.0;
		
		double d = 2.375 - (interceptions / passesAttempted * 25.0);
		
		double rating = (a + b + c + d) / 6.0 * 100;
		
		// Display result
		System.out.printf("The player's QB Rating is %.1f", rating);
	}

}
