import java.util.ArrayList;
import java.util.List;

public class Kullanici {

    private String kullaniciAdi;
    private List<MuzikListesi> muzikListeleri;
    private OynatmaListesi oynatmaListesi;

    public Kullanici(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
        this.muzikListeleri = new ArrayList<>();
        this.oynatmaListesi = new OynatmaListesi("Varsayılan Oynatma Listesi");
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public List<MuzikListesi> getMuzikListeleri() {
        return muzikListeleri;
    }

    public void muzikListesineEkle(MuzikListesi muzikListesi) {
        muzikListeleri.add(muzikListesi);
    }

    public OynatmaListesi getOynatmaListesi() {
        return oynatmaListesi;
    }

    public void oynatmaListesiniOynat(OynatmaListesi oynatmaListesi) {
        this.oynatmaListesi.oynatmaListesiniOynat();
    }

      public Object getOneriListesi() {

        return null;
      }

    public MuzikOynatici getFavoriSarkilar() {
        return null;
    }

    public DinlemeGecmisi getDinlemeGecmisi() {
        return null;
    }
}
