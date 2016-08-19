package patterns.structural.adapter.advancedmediaplayer.impl;

import patterns.structural.adapter.advancedmediaplayer.AdvancedMediaPlayer;

/**
 * Created on 19.08.16.
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }
}
