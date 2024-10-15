import javax.swing.JOptionPane;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class MuzikVideo {

    private MuzikSarki sarki;
    private String videoUrl;

    public MuzikVideo(MuzikSarki sarki, String videoUrl) {
        this.sarki = sarki;
        this.videoUrl = videoUrl;
    }

    public MuzikSarki getSarki() {
        return sarki;
    }

    public void setSarki(MuzikSarki sarki) {
        this.sarki = sarki;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }



    public void videoyuIzle() {
        System.out.println("Müzik Video: " + sarki.getSarkiAdi());
        System.out.println("Video URL: " + videoUrl);

        try {
            Desktop.getDesktop().browse(new URI(videoUrl));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();

            // Hata durumuyla başa çıkabilir veya kullanıcıya bilgi verebilir
            String hataMesaji = "Video izleme sirasinda bir hata oluştu.";
            System.err.println(hataMesaji);

            // Kullanıcıya bilgi penceresi gösterme
            JOptionPane.showMessageDialog(null, hataMesaji, "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }

}
