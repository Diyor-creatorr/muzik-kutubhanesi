import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DinlemeGecmisi {

    private List<MuzikSarki> dinlenenSarkilar;
    private List<LocalDateTime> dinlemeZamani;

    public DinlemeGecmisi() {
        this.dinlenenSarkilar = new ArrayList<>();
        this.dinlemeZamani = new ArrayList<>();
    }

    public List<MuzikSarki> getDinlenenSarkilar() {
        return dinlenenSarkilar;
    }

    public List<LocalDateTime> getDinlemeZamani() {
        return dinlemeZamani;
    }

    public void sarkiEkle(MuzikSarki sarki) {
        dinlenenSarkilar.add(sarki);
        dinlemeZamani.add(LocalDateTime.now());
    }

    public void dinlemeGecmisiGoster() {
        System.out.println("Dinleme Geçmişi:");
        for (int i = 0; i < dinlenenSarkilar.size(); i++) {
            MuzikSarki sarki = dinlenenSarkilar.get(i);
            LocalDateTime zaman = dinlemeZamani.get(i);
            System.out.println("- " + sarki.getSarkiAdi() + " - Dinlenme Zamanı: " + zaman);
        }
    }
}
