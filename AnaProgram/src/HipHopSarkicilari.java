import java.util.ArrayList;
import java.util.Scanner;

public class HipHopSarkicilari extends AnaProgram {


    private static ArrayList<String> hiphopSarkicilariListesi = new ArrayList<>();

    public static void hiphopSarkicilariGoster() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir hip-hop şarkıcısının adını girin: ( Eminem, Jay - Z, Kendrick Lamar)");
        String sarkici = scanner.nextLine();

        switch (sarkici.toLowerCase()) {
            case "eminem":
                hiphopSarkicilariListesi.add("Eminem");
                HipHopSozler.showEminemMusic();
                break;
            case "jay-z":
                hiphopSarkicilariListesi.add("Jay-Z");
                HipHopSozler.showJayZMusic();
                break;
            case "kendrick lamar":
                hiphopSarkicilariListesi.add("Kendrick Lamar");
                HipHopSozler.showKendrickLamarMusic();
                break;
            default:
                HataKontrol.sarkiciBulunamadiHatasi();
                break;
        }
    }

    public static ArrayList<String> getHipHopSarkicilariListesi() {
        return hiphopSarkicilariListesi;
    }

}
