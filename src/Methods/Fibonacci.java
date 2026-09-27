package Methods;
public class Fibonacci {

public static int fibonacci(int n) {
    // 1. Kırılma Noktası: n değeri 0 veya 1'e düştüğünde direkt kendini döndür.
    if (n <= 1) {
        return n;
    } 
    
    // 2. Kendi Kendini Çağırma: Kendinden önceki iki sayının Fibonacci değerlerini topla.
    else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
	public static void main(String[] args) {
	
		System.out.println(fibonacci(6));
}

}
