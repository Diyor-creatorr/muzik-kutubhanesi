import java.util.ArrayList;
import java.util.List;

public class MuzikListesi {

    private String listeAdi;
    private List<MuzikSarki> sarkilar;

    public MuzikListesi() {
        this.listeAdi = listeAdi;
        this.sarkilar = new ArrayList<>();
    }

    public String getListeAdi() {
        return listeAdi;
    }

    public void setListeAdi(String listeAdi) {
        this.listeAdi = listeAdi;
    }

    public List<MuzikSarki> getSarkilar() {
        return sarkilar;
    }

    public void sarkiEkle(MuzikSarki sarki) {
        sarkilar.add(sarki);
    }

    public void sarkilariGoster() {
        System.out.println("Müzik Listesi: " + listeAdi);
        System.out.println("Şarkılar:");

        for (MuzikSarki sarki : sarkilar) {
            System.out.println(" - " + sarki.getSarkiAdi());
        }
    }
}
