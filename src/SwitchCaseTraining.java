import java.util.Scanner;
public class SwitchCaseTraining {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen bir değer giriniz: ");
		int a = input.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("Girilen sayı 1'e eşittir.");
			break;
			
		case 2:
			System.out.println("Girilen sayı 2'ye eşittir.");
			break;
			
		case 3:
			System.out.println("Girilen sayı 3'e eşittir.");
			break;
			
			default: 
				System.out.println("Geçersiz bir sayı girdiniz!");
				
	
		}
		
		input.close();

	}

}
