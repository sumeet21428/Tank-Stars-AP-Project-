package com.approject.game.States;

import com.approject.game.TankStars;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.GLTexture;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PlayState extends State{

    private Texture tank;
    private Texture background;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        tank = new Texture("tank.png");
        background  = new Texture("bg.png");

    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }
    float tankSpeed = 10.0f; // 10 pixels per second.
    float tankX;
    float tankY;

    @Override
    public void render(SpriteBatch sb) {



        if(Gdx.input.isKeyPressed(Input.Keys.DPAD_LEFT))
            tankX -= Gdx.graphics.getDeltaTime() * tankSpeed;
        if(Gdx.input.isKeyPressed(Input.Keys.DPAD_RIGHT))
            tankX += Gdx.graphics.getDeltaTime() * tankSpeed;
        if(Gdx.input.isKeyPressed(Input.Keys.DPAD_UP))
            tankY += Gdx.graphics.getDeltaTime() * tankSpeed;
        if(Gdx.input.isKeyPressed(Input.Keys.DPAD_DOWN))
            tankY -= Gdx.graphics.getDeltaTime() * tankSpeed;

        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        sb.begin();
        sb.draw(background, 0, 0, TankStars.WIDTH, TankStars.HEIGHT);
        sb.draw(tank, (int)tankX, (int)tankY);

        sb.end();

    }

    @Override
    public void dispose() {
        background.dispose();
        tank.dispose();


    }
}
