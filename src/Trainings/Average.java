package Trainings; // Package her zaman en üstte olmalıdır

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] notes = new int[7];
		
		System.out.println("Lütfen notlarınızı giriniz: ");
		
		double result = 0; // Toplamı tutacağımız değişkeni döngüden önce tanımlıyoruz
		
		// <= yerine < kullanıyoruz ve işlemleri süslü parantez içine alıyoruz
		for(int i = 0; i < notes.length; i++) {
			System.out.print((i + 1) + ". notu giriniz: "); 
			notes[i] = input.nextInt(); // Kullanıcıdan değeri al ve diziye ata
			result += notes[i];         // Girilen değeri toplama ekle
		}
		
		double average = result / notes.length;
		
		System.out.println("Ortalamanız: " + average);
		
		input.close(); // Scanner'ı kapatmak iyi bir pratiktir
	}

}