package sons;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class EfeitosSonoros {
    
    private static boolean ligado = true;
    private static Clip clip;

    public static void Play(String filepath) {
        if (ligado) {
            try {
                InputStream soundStream = EfeitosSonoros.class.getClassLoader().getResourceAsStream("efeitos sonoros/" + filepath);
                if (soundStream != null) {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(soundStream);
                    clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(bufferedInputStream));
                    clip.start();
                } else {
                    System.err.println("Arquivo de áudio não encontrado!");
                }
            } catch (Exception e) {
                Logger.getLogger("EfeitoSonoro").log(Level.SEVERE, null, e);
            }
        }
    }

    public static void setLigado(boolean b) {
        ligado = b;
    }
}

