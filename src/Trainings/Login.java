package Trainings;
import java.util.Scanner;
public class Login {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String ad,sifre;
		
		System.out.print("Lütfen kullanıcı adı giriniz: ");
		ad = input.nextLine();
		
		System.out.print("\nŞifrenizi giriniz: ");
		sifre = input.nextLine();
		
		if (ad.equals("java") && sifre.equals("1903")) {
			System.out.println("\nDoğru kullanıcı. Hoşgeldiniz.");
		}
		else {
			System.out.println("\nHatalı kullanıcı.");
		}
		input.close();
	}

}
