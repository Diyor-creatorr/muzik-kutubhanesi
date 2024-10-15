import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RockSarkicilari extends AnaProgram {

    private static ArrayList<String> rockSarkicilariListesi = new ArrayList<>();

    static {
        rockSarkicilariListesi.add("Freddie Mercury");
        rockSarkicilariListesi.add("Mick Jagger");
        rockSarkicilariListesi.add("Kurt Cobain");
    }

    public static void rockSarkicilariGoster() {
        ArrayList<String> rockSarkicilari = MuzikKutuphanesi.getRockSarkicilari();

        System.out.println("Müzisyenleri Seçin:");
        System.out.println("1: Freddie Mercury");
        System.out.println("2: Mick Jagger");
        System.out.println("3: Kurt Cobain");

        // Kullanıcının seçimini al
        Scanner scanner = new Scanner(System.in);
        int secim = scanner.nextInt();

        // Switch-case kullanarak işlem yap
        String muzisyenAdi;
        switch (secim) {
            case 1:
                muzisyenAdi = "Freddie Mercury";
                break;
            case 2:
                muzisyenAdi = "Mick Jagger";
                break;
            case 3:
                muzisyenAdi = "Kurt Cobain";
                break;
            default:
                HataKontrol.dosyaOkumaHatasi();
                return;
        }

        String bilgi = getMuzisyenBilgisi(muzisyenAdi);
        System.out.println(bilgi);
    }

    private static String getMuzisyenBilgisi(String muzisyenAdi) {
        // Muzisyen bilgilerini oku
        String dosyaYolu = "C:\\Users\\diyor\\OneDrive\\Рабочий стол\\muzisyenler.txt.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(dosyaYolu))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                String ad = parts[0].trim();
                String bilgi = parts[1].trim();

                if (ad.equals(muzisyenAdi)) {
                    return bilgi;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Bilgi bulunamadı";
    }

    public static ArrayList<String> getRockSarkicilariListesi() {
        return rockSarkicilariListesi;
    }
}
