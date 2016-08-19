package patterns.structural.adapter.mediaplayer.impl;

import patterns.structural.adapter.TypePlayback;
import patterns.structural.adapter.advancedmediaplayer.AdvancedMediaPlayer;
import patterns.structural.adapter.advancedmediaplayer.impl.Mp4Player;
import patterns.structural.adapter.advancedmediaplayer.impl.VlcPlayer;
import patterns.structural.adapter.mediaplayer.MediaPlayer;

/**
 * Created on 19.08.16.
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(TypePlayback typePlayback) {
        if (typePlayback.equals(TypePlayback.VLC)) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (typePlayback.equals(TypePlayback.MP4)) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(TypePlayback playbackType, String fileName) {
        if (playbackType.equals(TypePlayback.VLC)) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (playbackType.equals(TypePlayback.MP4)) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
