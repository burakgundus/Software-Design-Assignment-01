
public class Continue {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
		    if (i == 3) {
		        continue; // 3'e gelince bu turu es geç, hemen 4'ten devam et.
		    }
		    System.out.print(i + " "); // Çıktı: 1 2 4 5 (3 yok)
		}

	}

}
