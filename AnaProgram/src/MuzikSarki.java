


public class MuzikSarki {

    private String sarkiAdi;
    private String sanatci;
    private int sure; // saniye cinsinden süre

    public MuzikSarki(String sarkiAdi, String sanatci, int sure) {
        this.sarkiAdi = sarkiAdi;
        this.sanatci = sanatci;
        this.sure = sure;
    }

    public String getSarkiAdi() {
        return sarkiAdi;
    }

    public void setSarkiAdi(String sarkiAdi) {
        this.sarkiAdi = sarkiAdi;
    }

    public String getSanatci() {
        return sanatci;
    }

    public void setSanatci(String sanatci) {
        this.sanatci = sanatci;
    }

    public int getSure() {
        return sure;
    }

    public void setSure(int sure) {
        this.sure = sure;
    }

    public void sarkiBilgileriniGoster() {
        System.out.println("Şarkı Bilgileri:");
        System.out.println("Şarkı Adı: " + sarkiAdi);
        System.out.println("Sanatçı: " + sanatci);
        System.out.println("Süre: " + sure + " saniye");
    }
}
