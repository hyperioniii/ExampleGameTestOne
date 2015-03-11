package com.mygdx.game.gameworld;

import com.badlogic.gdx.Gdx;
import com.mygdx.game.gamemodels.ZombieBird;

/**
 * Created by patyRock on 3/10/2015.
 */
public class GameWorld {

    private ZombieBird zBird;

    public GameWorld(int midPointY) {
        zBird = new ZombieBird(33, midPointY -5  ,17,12);
    }

    public void update(float delta) {
        Gdx.app.log("GameWorld", "update");

        zBird.update(delta);
    }

    public ZombieBird getzBird() {
        return zBird;
    }
}
