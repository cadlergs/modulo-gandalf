package gandalf.models;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

import gandalf.controllers.*;

public class Sound implements Runnable {

    private Controller gandalfController;
    private URL backgroundSoundURL;
    private URL saveSoundURL;

    public Sound(Controller gandalfController) {
        this.gandalfController = gandalfController;
    }

    @Override
    public void run() {
        backgroundSoundURL = getClass().getResource("/gandalf/sounds/soundtrack.wav");
        AudioClip playBackgroundSound = Applet.newAudioClip(backgroundSoundURL);
        playBackgroundSound.loop();
    }

    public void playSaveSound() {
        saveSoundURL = getClass().getResource("/gandalf/sounds/save.wav");
        AudioClip playSaveSound = Applet.newAudioClip(saveSoundURL);
        playSaveSound.play();
    }

}
