package sons;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import telas.TelaInicial;

public class Musicas {
    public static Clip clip;
   
    public static void Play(String filepath) {
        try{
            Stop();
            InputStream audioStream = Musicas.class.getClassLoader().getResourceAsStream("musicas/" + filepath);
            if (audioStream != null) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(audioStream);
                clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(bufferedInputStream));
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            } else {
                System.out.println("Arquivo de áudio não encontrado");
            }
        }
        catch(Exception e){
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public static void Stop(){
        if (clip != null){
            clip.stop();
        }
    }
}
    

