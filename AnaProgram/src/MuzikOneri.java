public class MuzikOneri {

    private String oneriAdi;
    private MuzikSarki onerilenSarki;

    public MuzikOneri(String oneriAdi, MuzikSarki onerilenSarki) {
        this.oneriAdi = oneriAdi;
        this.onerilenSarki = onerilenSarki;
    }

    public String getOneriAdi() {
        return oneriAdi;
    }

    public void setOneriAdi(String oneriAdi) {
        this.oneriAdi = oneriAdi;
    }

    public MuzikSarki getOnerilenSarki() {
        return onerilenSarki;
    }

    public void setOnerilenSarki(MuzikSarki onerilenSarki) {
        this.onerilenSarki = onerilenSarki;
    }

    public void oneriBilgileriniGoster() {
        System.out.println("Müzik Önerisi: " + oneriAdi);
        System.out.println("Önerilen Şarkı: " + onerilenSarki.getSarkiAdi());
    }
}
