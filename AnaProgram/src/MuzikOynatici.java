import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MuzikOynatici {

    private List<MuzikSarki> sarkilar;
    private OynatmaListesi varsayilanOynatmaListesi;
    private Kullanici aktifKullanici;

    public MuzikOynatici() {
        this.sarkilar = new ArrayList<>();
        this.varsayilanOynatmaListesi = new OynatmaListesi("Varsayılan Oynatma Listesi");
    }

    public void muzikEkle(MuzikSarki sarki) {
        sarkilar.add(sarki);
    }

    public void oynatmaListesineEkle(MuzikSarki sarki) {
        varsayilanOynatmaListesi.sarkiEkle(sarki);
    }

    public void kullaniciyiBelirle(Kullanici kullanici) {
        aktifKullanici = kullanici;
    }

    public void varsayilanOynatmaListesiniOynat() {
        varsayilanOynatmaListesi.oynatmaListesiniOynat();
    }

    public void kullaniciOynatmaListesiniOynat() {
        if (aktifKullanici != null) {
            aktifKullanici.getOynatmaListesi().oynatmaListesiniOynat();
        } else {
            System.out.println("Hata: Kullanıcı belirlenmemiş.");
        }
    }

    public void favoriSarkilariGoster() {
        if (aktifKullanici != null) {
            aktifKullanici.getFavoriSarkilar().favoriSarkilariGoster();
        } else {
            System.out.println("Hata: Kullanıcı belirlenmemiş.");
        }
    }

    public void dinlemeGecmisiniGoster() {
        if (aktifKullanici != null) {
            aktifKullanici.getDinlemeGecmisi().dinlemeGecmisiGoster();
        } else {
            System.out.println("Hata: Kullanıcı belirlenmemiş.");
        }
    }

    public void oneriYap(MuzikSarki onerilenSarki, String oneriAdi) {
        if (aktifKullanici != null) {
            MuzikOneri muzikOneri = new MuzikOneri(oneriAdi, onerilenSarki);
            Objects.equals(aktifKullanici.getOneriListesi(), muzikOneri);
            System.out.println("Öneri yapıldı: " + oneriAdi);
        } else {
            System.out.println("Hata: Kullanıcı belirlenmemiş.");
        }
    }

    // Diğer müzik oynatıcı özelliklerini ekleyebilirsiniz.
}
