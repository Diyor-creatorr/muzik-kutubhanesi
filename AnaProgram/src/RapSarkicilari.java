import java.util.ArrayList;
import java.util.Scanner;

public class RapSarkicilari extends AnaProgram {
    public void sarkiciEkle(ArrayList<String> sarkiciListesi) {
        System.out.println("RapSarkicilari sınıfındaki sarkiciEkle metodu çağrıldı.");
        super.sarkiciEkle(sarkiciListesi); // Üst sınıftaki metodu çağırma
    }

    private static ArrayList<String> rapSarkicilariListesi = new ArrayList<>();

    public static void rapSarkicilariGoster() {
        ArrayList<String> rapSarkicilari = MuzikKutuphanesi.getRapSarkicilari();

        System.out.println("Hangi rap şarkıcısını şarkı sözünü istersiniz? ( Snoop Dog, Drake, Xxxtentacion): ");

        Scanner scanner = new Scanner(System.in);
        String secim = scanner.nextLine();

        switch (secim.toLowerCase()) {
            case "snoopdog":
                rapSarkicilariListesi.add("Snoop Dog");
                RapSozler.showSnoopDogMusic();
                break;
            case "drake":
                rapSarkicilariListesi.add("Drake");
                RapSozler.showDrakeMusic();
                break;
            case "xxxtentacion":
                rapSarkicilariListesi.add("XxxTentacion");
                RapSozler.showXxxtentacionMusic();
                break;
            default:
                HataKontrol.sarkiciBulunamadiHatasi();
                break;
        }
    }

    public static ArrayList<String> getRapSarkicilariListesi() {
        return rapSarkicilariListesi;
    }
}
