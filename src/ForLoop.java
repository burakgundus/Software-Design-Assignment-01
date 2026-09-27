import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 5 eleman kapasiteli, içi şimdilik boş bir int dizisi oluşturduk.
		int[] sayilar = new int[5]; 
		
		System.out.println("Lütfen 5 tane sayı giriniz:\n");
		
		// 1. DÖNGÜ: Kullanıcıdan verileri alıp dizinin vagonlarına yerleştiriyoruz.
		// i = 0'dan başlar çünkü Java'da dizilerin ilk elemanı 0. indekstedir.
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + ". sayıyı girin: ");
			sayilar[i] = input.nextInt(); // sayilar[0], sayilar[1]... diye sırayla dolar.
		}
		
		System.out.println("\nHarika! Trenin vagonlarına yüklediğin sayılar şunlar:");
		
		// 2. DÖNGÜ: Dizinin içindeki verilerde gezinip ekrana basıyoruz.
		for (int i = 0; i < sayilar.length; i++) {
			System.out.print(sayilar[i] + "  ");
		}
		
		input.close();
	}
}