package patterns.behavioral.templatemethod.ext;

import patterns.behavioral.templatemethod.Game;

/**
 * Created on 29.08.16.
 */
public class Football extends Game {

    @Override
    protected void initialize() {
        System.out.println("Football game initialized! Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Football game started. Enjoy the game!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football game finished.");
    }
}
