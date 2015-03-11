package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.screens.GameScreen;
import com.mygdx.game.utils.AssetsLoader;

public class MyGdxGame extends Game {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
        AssetsLoader.load();
        setScreen(new GameScreen());
	}

	@Override
	public void render () {
	}
    @Override
    public void dispose() {
        super.dispose();
        AssetsLoader.dispose();
    }
}
