package patterns.structural.adapter.mediaplayer;

import patterns.structural.adapter.TypePlayback;

/**
 * Created on 19.08.16.
 */
public interface MediaPlayer {

    public void play(TypePlayback playbackType, String fileName);
}
