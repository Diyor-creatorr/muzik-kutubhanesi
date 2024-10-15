import java.util.ArrayList;
import java.util.Scanner;

public class SilmeIslemi extends AnaProgram {

    public static void silmeIslemi(ArrayList<String> secilenSarkicilar) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Silmek istediğiniz şarkıcının adını girin (Çıkmak için 'exit' yazabilirsiniz): ");
            String silinecekSarkici = scanner.next();

            if (silinecekSarkici.equalsIgnoreCase("exit")) {
                break;
            }

            if (secilenSarkicilar.contains(silinecekSarkici)) {
                secilenSarkicilar.remove(silinecekSarkici);
                System.out.println(silinecekSarkici + " şarkıcısı listeden silindi.");
            } else {
                System.out.println(silinecekSarkici + " şarkıcısı listede bulunamadı.");
            }
        }
    }
}
