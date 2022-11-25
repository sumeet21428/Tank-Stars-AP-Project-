package com.approject.game.States;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PlayState extends State{
    private Texture tank;
    private Texture tank2;


    public PlayState(GameStateManager gsm) {
        super(gsm);
        tank = new Texture("tank.png");
        tank2 = new Texture("tank2.png");
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(tank, 10, 85);
        sb.draw(tank2, 530, 85);
        sb.end();

    }

    @Override
    public void dispose() {

    }
}
