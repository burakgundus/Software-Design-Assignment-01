package Trainings;
import java.util.Scanner;
public class UcakBileti {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int km, yas, tip;
		
		System.out.print("Yolculuğun mesafesini giriniz: ");
		km = input.nextInt();
		
		System.out.print("\nYolcunun yaşını giriniz: ");
		yas = input.nextInt();
		
		System.out.print("\nYolculuk tipini seçiniz: (1-Tek Yön, 2-Gidiş/Dönüş) ");
		tip = input.nextInt();
		
		double kmfiyat;
		
		
		if(km>0 && yas>0 && (tip==1 || tip==2)) {
			
			kmfiyat = km * 0.10;
			
				if(yas<12) {
					kmfiyat = kmfiyat / 2;	
				}
				else if(yas>=12 && yas<=24) {
					kmfiyat = kmfiyat * 0.9;
				}
				else if(yas>65) {
					kmfiyat = kmfiyat * 0.7;
				}
	
				if(tip==2) {
					kmfiyat = (kmfiyat * 0.8) * 2;
				}
				
				System.out.println("Girilen bilgilere göre son fiyatımız: " + kmfiyat + "$");
		}
		else {
			System.out.print("\nHatalı giriş.");
		}
		
		input.close();
		
	}

}
