package Methods;
public class Recursive {

    public static int faktoriyel(int n) {
        // 1. KIRILMA NOKTASI (Base Case)
        // Eğer sayı 1'e ulaştıysa daha fazla küçülemez, 1 döndür ve dur.
        if (n == 1) {
            return 1;
        } 
        
        // 2. KENDİNİ ÇAĞIRMA (Recursive Call)
        // Sayı 1 değilse, sayıyı kendisinin bir eksiğinin faktöriyeli ile çarp.
        else {
            return n * faktoriyel(n - 1); 
        }
    }

    public static void main(String[] args) {
        System.out.println(faktoriyel(4)); // Çıktı: 6
    }
}