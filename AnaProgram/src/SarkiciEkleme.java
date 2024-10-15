import java.util.ArrayList;
import java.util.Scanner;

public class SarkiciEkleme {

    public static void sarkiciEkle(ArrayList<String> sarkiciListesi) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Eklemek istediğiniz şarkıcının adını girin veya işlemi atlamak için 0'a basın:");
        String yeniSarkici = scanner.nextLine();

        if (!yeniSarkici.equals("0")) {
            // Listenin başına eklemek için add metodunu kullanarak 0. indekse ekleyebilirsiniz.
            sarkiciListesi.add(0, yeniSarkici);
            System.out.println(yeniSarkici + " şarkıcısı başarıyla listenin başına eklendi.");
        } else {
            System.out.println("İşlem atlandı.");
        }
    }
}
