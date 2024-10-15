public class MuzikTur {

    private String turAdi;
    private String aciklama;

    public MuzikTur(String turAdi, String aciklama) {
        this.turAdi = turAdi;
        this.aciklama = aciklama;
    }

    public String getTurAdi() {
        return turAdi;
    }

    public void setTurAdi(String turAdi) {
        this.turAdi = turAdi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public void turBilgileriniGoster() {
        System.out.println("Müzik Türü Bilgileri:");
        System.out.println("Tür Adı: " + turAdi);
        System.out.println("Açıklama: " + aciklama);
    }
}
