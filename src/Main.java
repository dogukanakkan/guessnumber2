import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Rastgele bir sayı seçmek için Random sınıfını kullanalım
        Random random = new Random();
        int rastgeleSayi = random.nextInt(101); // 0 ile 100 arasında (100 dahil değil) bir rastgele sayı seçer

        // Kullanıcıdan girdi almak için Scanner sınıfını kullanalım
        Scanner scanner = new Scanner(System.in);

        System.out.println("0 ile 100 arasında bir sayı tahmin edin.");

        int tahmin;
        int tahminSayisi = 0;
        boolean dogruTahmin = false;

        while (!dogruTahmin) {
            System.out.print("Tahmininiz: ");
            tahmin = scanner.nextInt();
            tahminSayisi++;

            if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı tahmin edin.");
            } else if (tahmin > rastgeleSayi) {
                System.out.println("Daha küçük bir sayı tahmin edin.");
            } else {
                dogruTahmin = true;
            }
        }

        System.out.println("Tebrikler! " + tahminSayisi + " adımda doğru tahmin ettiniz. Seçilen sayı: " + rastgeleSayi);

        // Kullanılan kaynakları serbest bırakalım
        scanner.close();
    }
}
