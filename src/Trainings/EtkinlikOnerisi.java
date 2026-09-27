package Trainings;
import java.util.Scanner;
public class EtkinlikOnerisi {

	public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			
			double derece;
			
			System.out.print("Lütfen havanın sıcaklık derecesini giriniz: ");
			derece = input.nextDouble();
			
			if(derece>=30) {
				System.out.println("Bugün için size yüzme önerebilirim.");
				}
			
				else if(derece>=5 && derece<30) {
					System.out.println("Bugün için size sinema önerebilirim.");
				}
			
				else if(derece<5) {
					System.out.println("Bugün için size kayak önerebilirim.");
				}
			input.close();
	}

}
