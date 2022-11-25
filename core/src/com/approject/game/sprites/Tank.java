package com.approject.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public class Tank {
    //private static final int GRAVITY = -15;
    private Vector3 position;
    private Vector3 velocity;
    private Texture tank;

    public Tank(int x, int y)
    {
        position = new Vector3(x, y,0);
        velocity = new Vector3(0,0,0);
        tank = new Texture("tank.png");
    }

    public void update(float dt)
    {
        //velocity.add(0, GRAVITY, 0);
        velocity.scl(dt);
        position.add(velocity.x, 0, 0);
        velocity.scl(1/dt);

    }

    public Vector3 getPosition() {
        return position;
    }

    public Texture getTank() {
        return tank;
    }
}
