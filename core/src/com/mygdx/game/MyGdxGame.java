package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.screens.GameScreen;
import com.mygdx.game.utils.AssetsLoader;

public class MyGdxGame extends Game {

	@Override
	public void create () {
        AssetsLoader.load();
        setScreen(new GameScreen());
	}


    @Override
    public void dispose() {
        super.dispose();
        AssetsLoader.dispose();
    }
}
