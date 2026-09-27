package Methods;

public class RecursiveEx {
	
	public static int sayi (int a) {
		if (a == 1) {
			return 1;
		}
		
		else {
			return a + sayi(a-1);
		}
			
	}

	public static void main(String[] args) {
		
		System.out.println(sayi(11));
	}

}
