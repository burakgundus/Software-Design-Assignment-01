package Trainings;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int sayi1, sayi2, secim;
		System.out.print("İlk sayı giriniz: ");
		sayi1 = input.nextInt();
		System.out.print("\nİkinci sayıyı giriniz: ");
		sayi2 = input.nextInt();
		
		System.out.println("\nLütfen yapmak istediğiniz işlemi seçin. ");
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		secim = input.nextInt();
		
		if(secim==1) {
			int toplam;
			toplam=sayi1+sayi2;
			System.out.println("Girilen iki değerin toplamı: " + toplam);
		}
		
		else if(secim==2) {
			int fark;
			fark=(sayi1-sayi2);
			if(fark<0) {
				fark=fark * -1;
			}
			System.out.println("Girilen iki değerin farkı: " + fark);
		}
		
		else if(secim==3) {
			int carpim;
			carpim=sayi1*sayi2;
			System.out.println("Girilen iki değerin çarpımı: " + carpim);
		}
		
		else if(secim==4) {
			if(sayi2==0) {
				System.out.println("Hata! Bir sayı sıfıra bölünemez.");
			}
			else {
				double bolum = (double) sayi1/sayi2;
				System.out.println("Girilen iki değerin bölümü: " + bolum);
			}
			
			
			
		}
		
		input.close();
	}

}
