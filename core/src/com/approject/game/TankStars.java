package com.approject.game;

import com.approject.game.States.GameStateManager;
import com.approject.game.States.MenuState;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class TankStars extends ApplicationAdapter {
	public static final int WIDTH = 640;
	public static final int HEIGHT =500;

	public static final String TITLE = "Tank Stars";

	private GameStateManager gsm;
	private SpriteBatch batch;
	private BitmapFont font;

	@Override
	public void create () {
		batch = new SpriteBatch();
		gsm = new GameStateManager();
		ScreenUtils.clear(0 , 0, 0, 1);
		gsm.push(new MenuState(gsm));
		font = new BitmapFont();
		font.setColor(Color.RED);
	}

	@Override
	public void render () {
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(batch);

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		font.dispose();
	}
}
