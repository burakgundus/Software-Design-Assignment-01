package Trainings;
import java.util.Scanner;
public class SwitchCase_Weeks {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.print("Lütfen 1 ile 7 arasında sayı giriniz: ");
		number = input.nextInt();
		
		switch (number) {
		
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salı");
			break;
		case 3:
			System.out.println("Çarşamba");
			break;
		case 4:
			System.out.println("Perşembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
			
			default:  //edge case
				System.out.println("Geçersiz bir sayı girdiniz.");
	
			
		}
		
		input.close();
		
 }
	
}