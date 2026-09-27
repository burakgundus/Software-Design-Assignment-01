
public class Break {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
		    if (i == 5) {
		        break; // i 5 olduğu an döngü tamamen iptal olur.
		    }
		    System.out.print(i + " "); // Çıktı: 1 2 3 4
		}

	}

}
