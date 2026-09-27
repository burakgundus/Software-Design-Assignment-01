import java.util.Scanner;
public class LoopTraining {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double average = 0;
		int toplam = 0;
		int[] sayilar = new int[5];
		System.out.println("Lütfen 5 adet sayı giriniz: ");
		
		for (int i=0; i<5; i++) {
			System.out.print("\n" + (i+1) + ". sayıyı giriniz: ");
			sayilar[i] = input.nextInt();
			toplam += sayilar[i];
			}
		
		
		System.out.println("\n" + toplam);
		
		average = (double) toplam / 5;
		
		System.out.println("\n" + average);
		
		input.close();
	}

}
 