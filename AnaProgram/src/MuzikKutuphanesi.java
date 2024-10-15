import java.util.ArrayList;

public class MuzikKutuphanesi {

    private static ArrayList<String> popSarkicilari = new ArrayList<>();
    private static ArrayList<String> rockSarkicilari = new ArrayList<>();
    private static ArrayList<String> hiphopSarkicilari = new ArrayList<>();
    private static ArrayList<String> rapSarkicilari = new ArrayList<>();

    static {
        popSarkicilari.add("Shakira");
        popSarkicilari.add("Justin Bieber");
        popSarkicilari.add("Adele");

        rockSarkicilari.add("Freddie Mercury");
        rockSarkicilari.add("Mick Jagger");
        rockSarkicilari.add("Kurt Cobain");

        hiphopSarkicilari.add("Eminem");
        hiphopSarkicilari.add("Jay - Z");
        hiphopSarkicilari.add("Kendrick Lamar");

        rapSarkicilari.add("SnoopDog");
        rapSarkicilari.add("Drake");
        rapSarkicilari.add("XxxTentacion");
    }

    public static ArrayList<String> getPopSarkicilari() {
        return popSarkicilari;
    }

    public static ArrayList<String> getRockSarkicilari() {
        return rockSarkicilari;
    }

    public static ArrayList<String> getHiphopSarkicilari() {
        return hiphopSarkicilari;
    }

    public static ArrayList<String> getRapSarkicilari() {
        return rapSarkicilari;
    }
}
