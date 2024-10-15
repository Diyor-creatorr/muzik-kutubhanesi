import java.util.ArrayList;

class SecilenSarkicilariYazdir extends AnaProgram {

    public static void secilenSarkicilariYazdir(ArrayList<String> secilenSarkicilar) {
        System.out.println("Seçilen şarkıcılar:");

        if (secilenSarkicilar == null || secilenSarkicilar.isEmpty()) {
            System.out.println("Hiç şarkıcı seçilmedi.");
        } else {
            for (String sarkici : secilenSarkicilar) {
                System.out.println("- " + sarkici);
            }
        }
    }

}
