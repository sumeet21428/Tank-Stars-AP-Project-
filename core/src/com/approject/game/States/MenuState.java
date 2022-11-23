package com.approject.game.States;

import com.approject.game.TankStars;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import org.w3c.dom.Text;

public class MenuState extends State{
    private Texture background;
    private Texture playBtn;
    private Texture resBtn;
    private Texture exitBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playBtn = new Texture("playbtn.png");
        resBtn = new Texture("resbtn.png");
        exitBtn = new Texture("exitbtn.png");
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0,0, TankStars.WIDTH, TankStars.HEIGHT);
        sb.draw(playBtn, (TankStars.WIDTH / 2) - (playBtn.getWidth() / 2) , (0));
        sb.draw(resBtn, 0, 0);
        sb.draw(exitBtn, (TankStars.WIDTH) - playBtn.getWidth() , (0));
        sb.end();

    }
}
