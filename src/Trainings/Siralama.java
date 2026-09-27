package Trainings;
import java.util.Scanner;
public class Siralama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Lütfen üç farklı sayı giriniz: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if ((a>b && a>c) && b>c) {
			System.out.println("Girilen sayıların sıralaması: a>b>c");
		}
		
		else if ((a>b && a>c) && c>b) {
			System.out.println("Girilen sayıların sıralaması: a>c>b");
		}
		
		else if ((b>a && b>c) && a>c) {
			System.out.println("Girilen sayıların sıralaması: b>a>c");
		}
		
		else if ((b>a && b>c) && c>a) {
			System.out.println("Girilen sayıların sıralaması: b>c>a");
		}
		
		else if ((c>a && c>b) && a>b) {
			System.out.println("Girilen sayıların sıralaması: c>a>b");
		}
		
		else if ((c>a && c>b) && b>a) {
			System.out.println("Girilen sayıların sıralaması: c>b>a");
		}
		
		
		
		input.close();
		
		
	}

}
