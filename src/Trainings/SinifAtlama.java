package Trainings;
import java.util.Scanner;
public class SinifAtlama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double turkce, matematik, fen, sosyal, beden, ortalama;
		
		System.out.print("Türkçe notunuzu giriniz: ");
		turkce = input.nextDouble();
		
		System.out.print("\nMatematik notunuzu giriniz: ");
		matematik = input.nextDouble();
		
		System.out.print("\nFen notunuzu giriniz: ");
		fen = input.nextDouble();
		
		System.out.print("\nSosyal notunuzu giriniz: ");
		sosyal = input.nextDouble();
		
		System.out.print("\nBeden notunuzu giriniz: ");
		beden = input.nextDouble();
		
		ortalama = (turkce+matematik+fen+sosyal+beden) / 5;
		System.out.print("\nOrtalamanız: " + ortalama);
		
		if(ortalama>=50) {
			System.out.print("\nTebrikler! Sınıfı geçtiniz.");
		}
		else {
			System.out.print("\nSınıfı geçemediniz.");
		}
		input.close();
	}

}
