package com.approject.game.States;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public abstract class State {
    public OrthographicCamera cam;
    protected Vector3 mouse;
    protected GameStateManager gsm;

    protected State(GameStateManager gsm) //constructor
    {
        this.gsm = gsm;
        cam = new OrthographicCamera();
        mouse = new Vector3();




    }

    protected abstract void handleInput();
    public abstract void update(float dt); //dt is distance between 2 frames rendered
    public abstract void render(SpriteBatch sb); //container for everything we want to render int he screen
    public abstract void dispose();
}
