import java.util.Scanner;
public class KullaniciGirisi {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String username="diyor",pasword="diyor2003";


        String kullanici_adi, sifre;
        System.out.println("Kullanıcı adını giriniz:");
        kullanici_adi=input.next();
        System.out.println("Şifrenizi giriniz:");
        sifre=input.next();

        if (username.equals(kullanici_adi) && pasword.equals(sifre))
        {
            System.out.println ("Sisteme başarıyla girildi!");
            anaProgramaGecis();
        }
        else
        {
            HataKontrol.kullaniciGirisHatasi();

        }

    }

    private static void anaProgramaGecis() {

        AnaProgram.anaprogram();
    }

}