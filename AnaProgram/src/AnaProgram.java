import java.util.ArrayList;
import java.util.Scanner;

public class AnaProgram extends KullaniciGirisi {
    public void sarkiciEkle(ArrayList<String> sarkiciListesi) {
        System.out.println("AnaProgram sınıfındaki sarkiciEkle metodu çağrıldı.");
    }

    public static boolean anaprogram() {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> secilenSarkicilar;
        do {
            System.out.println("Hangi müzik türünü dinliyorsunuz? (1: Pop, 2: Rock, 3: Hip-Hop, 4: Rap)");
            int muzikTuru = scanner.nextInt();

            secilenSarkicilar = new ArrayList<>();

            switch (muzikTuru) {
                case 1:
                    System.out.println("Pop müzik seçtiniz.");
                    PopSarkicilariSinifi.popSarkicilariGoster();
                    secilenSarkicilar.addAll(PopSarkicilariSinifi.getPopSarkicilariListesi());
                    break;
                case 2:
                    System.out.println("Rock müzik seçtiniz.");
                    RockSarkicilari.rockSarkicilariGoster();
                    secilenSarkicilar.addAll(RockSarkicilari.getRockSarkicilariListesi());

                    break;
                case 3:
                    System.out.println("Hip-Hop müzik seçtiniz.");
                    HipHopSarkicilari.hiphopSarkicilariGoster();
                    secilenSarkicilar.addAll(HipHopSarkicilari.getHipHopSarkicilariListesi());
                    break;
                case 4:
                    System.out.println("Rap müzik seçtiniz.");
                    RapSarkicilari.rapSarkicilariGoster();
                    secilenSarkicilar.addAll(RapSarkicilari.getRapSarkicilariListesi());
                    break;
                default:
                    HataKontrol.secimHatasi();
                    return false;
            }

            SecilenSarkicilariYazdir.secilenSarkicilariYazdir(secilenSarkicilar);
            SilmeIslemi.silmeIslemi(secilenSarkicilar);
            SarkiciEkleme.sarkiciEkle(secilenSarkicilar);



            System.out.print("Başka bir şarkıcı seçmek istiyor musunuz? (Evet için 1, Hayır için 0): ");
            int devamEt = scanner.nextInt();
            if (devamEt == 0) {
                break;
            }

        } while (true);

        System.out.println("Seçilen şarkıcılar: " + secilenSarkicilar);

        return false;
    }
}
