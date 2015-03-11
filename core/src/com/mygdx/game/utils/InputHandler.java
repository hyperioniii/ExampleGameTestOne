package com.mygdx.game.utils;

import com.badlogic.gdx.InputProcessor;
import com.mygdx.game.gamemodels.ZombieBird;

/**
 * Created by patyRock on 3/11/2015.
 */
public class InputHandler implements InputProcessor {


    private ZombieBird myBird;

    // Ask for a reference to the Bird when InputHandler is created.
    public InputHandler(ZombieBird bird) {
        // myBird now represents the gameWorld's bird.
        myBird = bird;
    }


    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        myBird.onClick();
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
