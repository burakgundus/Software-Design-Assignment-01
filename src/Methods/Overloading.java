package Methods;

public class Overloading {

	
		
		static int add(int a, int b) {
			System.out.println("1. metot");
			return a+b;
		}
		
		static int add(int a, int b, int c) {
			System.out.println("2. metot");
			return a+b+c;
		}

		static double add(int a, int b, double c) {
			System.out.println("3. metot");
			return a+b+c;
		}
		
		public static void main(String[] args) {
			
			System.out.println(add(1,2));
			System.out.println(add(1,2,3));
			System.out.println(add(1,2,9.2));
	}		


}
