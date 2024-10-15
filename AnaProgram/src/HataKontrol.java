public class HataKontrol  {

    public static void kullaniciGirisHatasi() {
        System.out.println("Hata: Geçersiz giriş. Lütfen geçerli bir seçenek girin.");
    }

    public static void dosyaOkumaHatasi() {
        String dosyaYolu = null;
        System.out.println("Hata: " + dosyaYolu + " dosyası okunamadı veya bulunamadı.");
    }

    public static void sarkiciBulunamadiHatasi() {
        System.out.println("Hata: şarkıcı bulunamadı veya hatalı giriş yapıldı.");
    }

    public static void secimHatasi() {
        System.out.println("Hata: Geçersiz seçim. Lütfen doğru bir seçenek girin.");
    }



}
