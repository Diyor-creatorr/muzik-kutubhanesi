import java.util.ArrayList;
import java.util.List;

    public class OynatmaListesi {

        private String oynatmaListesiAdi;
        private List<MuzikSarki> sarkilar;

        public OynatmaListesi(String varsayılanOynatmaListesi) {
            this.oynatmaListesiAdi = oynatmaListesiAdi;
            this.sarkilar = new ArrayList<>();
        }

        public String getOynatmaListesiAdi() {
            return oynatmaListesiAdi;
        }

        public void setOynatmaListesiAdi(String oynatmaListesiAdi) {
            this.oynatmaListesiAdi = oynatmaListesiAdi;
        }

        public List<MuzikSarki> getSarkilar() {
            return sarkilar;
        }

        public void sarkiEkle(MuzikSarki sarki) {
            sarkilar.add(sarki);
        }

        public void oynatmaListesiniOynat() {
            System.out.println("Oynatma Listesi: " + oynatmaListesiAdi);
            System.out.println("Oynatılıyor:");

            for (MuzikSarki sarki : sarkilar) {
                System.out.println("- " + sarki.getSarkiAdi());
            }
        }
    }



