package patterns.structural.adapter.advancedmediaplayer.impl;

import patterns.structural.adapter.advancedmediaplayer.AdvancedMediaPlayer;

/**
 * Created on 19.08.16.
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
