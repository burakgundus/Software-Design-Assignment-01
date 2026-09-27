package Trainings;
import java.util.Scanner;
public class AreaCalculating {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double radius, area, volume;
		
		System.out.println("Dairenin yarıçapını giriniz: ");
		radius = input.nextDouble();
		System.out.println("Dairenin yarıçap değeri: "+ radius);
		
		area = (radius * radius * 3.14);
		volume = (3.14 * radius * radius * radius * 4.0 / 3.0);
		
		System.out.println("Seçilen yarıçap değerindeki dairenin alanı: " + area);
		System.out.println("Seçilen yarıçap değerindeki kürenin hacmi: " + volume);
	
		input.close();
		
	}

}
