import java.util.ArrayList;
import java.util.Scanner;

public class PopSarkicilariSinifi extends AnaProgram {

    private static ArrayList<String> popSarkicilariListesi = new ArrayList<>();


    public void sarkiciEkle(ArrayList<String> sarkiciListesi) {
        System.out.println("PopSarkicilariSinifi sınıfındaki sarkiciEkle metodu çağrıldı.");
        super.sarkiciEkle(sarkiciListesi);
    }


    public static void popSarkicilariGoster() {

        System.out.println("Bir pop şarkıcısının adını girin: (Shakira, Justin Bieber, Adele)");

        Scanner scanner = new Scanner(System.in);
        String secim = scanner.nextLine();


        switch (secim.toLowerCase()) {
            case "shakira":
                popSarkicilariListesi.add("Shakira");
                Sozler.showShakiraInfo();
                break;
            case "justinbieber":
                popSarkicilariListesi.add("Justin Bieber");
                Sozler.showJustinBieberInfo();
                break;
            case "adele":
                popSarkicilariListesi.add("Adele");
                Sozler.showAdeleInfo();
                break;
            default:
                HataKontrol.sarkiciBulunamadiHatasi();
                break;
        }
    }

    public static ArrayList<String> getPopSarkicilariListesi() {
        return popSarkicilariListesi;
    }
}
