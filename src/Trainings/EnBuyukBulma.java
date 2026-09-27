package Trainings;
public class EnBuyukBulma {

	public static void main(String[] args) {
		
		// İçinde rastgele sayılar olan bir dizi tanımladık (Scanner ile de alınabilirdi)
		int[] sayilar = {45, 12, 89, 34, 67, -5, 102, 8};
		
		// 1. ADIM: Dizinin 0. indeksindeki elemanı (45) şimdilik en büyük kabul ediyoruz.
		int enBuyuk = sayilar[0]; 
		
		// 2. ADIM: Diziyi gezmek için döngü kuruyoruz.
		// 0. indeksi zaten kral yaptığımız için döngüye 1. indeksten (i = 1) başlıyoruz.
		for (int i = 1; i < sayilar.length; i++) {
			
			// 3. ADIM: Sıradaki vagon, elimizdeki en büyük sayıdan daha mı büyük?
			if (sayilar[i] > enBuyuk) {
				enBuyuk = sayilar[i]; // Öyleyse yeni kral o olur!
			}
		}
		
		System.out.println("Dizideki en büyük sayı: " + enBuyuk);
	}
}