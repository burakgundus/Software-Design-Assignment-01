import java.util.Scanner;
public class IfElseTraining {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a=50;
		int b=20;
		int c=60;
		
		if(c>a) {
			System.out.println("c sayısı, a sayısından büyüktür."); 
			}
		
		else if(c>b) {
			System.out.println("c sayısı, b sayısından büyüktür.");
		  }
		
		else {
			System.out.println("c en küçük sayıdır.");
		}
		input.close();
	}

}
