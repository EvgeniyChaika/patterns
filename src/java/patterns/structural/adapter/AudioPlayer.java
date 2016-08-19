package patterns.structural.adapter;

import patterns.structural.adapter.mediaplayer.MediaPlayer;
import patterns.structural.adapter.mediaplayer.impl.MediaAdapter;

/**
 * Created on 19.08.16.
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(TypePlayback playbackType, String fileName) {
        if (playbackType.equals(TypePlayback.MP3)) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (playbackType.equals(TypePlayback.VLC) || playbackType.equals(TypePlayback.MP4)) {
            mediaAdapter = new MediaAdapter(playbackType);
            mediaAdapter.play(playbackType, fileName);
        } else {
            System.out.println("Invalid media. " + playbackType + " format not supported");
        }
    }
}
