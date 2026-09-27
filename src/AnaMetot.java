import java.util.Scanner;
public class AnaMetot {
 
	public static void main(String[] args) { //main metot. program ilk önce bunu okur.
	
		Scanner input = new Scanner(System.in);
		double quiz1, final1, homework1;
		
		System.out.println("Please enter your quiz grade: ");
		quiz1 = input.nextInt();
		
		double quiz2=quiz1 * 3 / 10;
	
		System.out.println("\nPlease enter your final grade: ");
		final1 = input.nextInt();
		
		double final2=final1 * 5 / 10;
		
		System.out.println("\nPlease enter your homework grade: ");
		homework1 = input.nextInt();
		
		double homework2=homework1 * 2 / 10;
		
		double average = quiz2 + final2 + homework2;
		System.out.println("\nYour average of your grades is: " + average);
		
		input.close();
		
		
		
	
	
	
	
}
}
