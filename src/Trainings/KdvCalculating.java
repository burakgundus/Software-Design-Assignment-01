package Trainings;
import java.util.Scanner;
public class KdvCalculating {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		double fiyat;
		double kdvfiyat;
		
		System.out.println("Lütfen ürün ücretini giriniz: ");
		fiyat = input.nextDouble();
		
		System.out.println("Ürünün ücreti: " + fiyat);
		
		kdvfiyat = (fiyat * 0.25) + (fiyat);
		System.out.println("Ürünün KDV dahil fiyatı: " + kdvfiyat);
		
		
		input.close();

	}

}
