package com.approject.game.States;

import com.approject.game.TankStars;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.graphics.OrthographicCamera;



import org.w3c.dom.Text;

import javax.swing.text.View;


public class MenuState extends State {
    BitmapFont font = new BitmapFont();


    private Texture background;
    private Texture playBtn;
    private Texture resBtn;
    private Texture exitBtn;

    private SpriteBatch batch;
    private Rectangle playButtonRectangle;
    private Vector2 touchPos;
    private OrthographicCamera camera;


    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playBtn = new Texture("NewGame.png");
        resBtn = new Texture("ResumeGame.png");
        exitBtn = new Texture("EXIT.png");

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
        batch = new SpriteBatch();

        playButtonRectangle = new Rectangle();
        playButtonRectangle.x = (TankStars.WIDTH / 2) - (playBtn.getWidth() / 2);
        playButtonRectangle.y = 0;
        playButtonRectangle.width = 112;
        playButtonRectangle.height = 66;
    }

    @Override
    public void handleInput() {
//        if (Gdx.input.justTouched()) {
//            Vector3 touchPos = new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0);
//            camera.unproject(touchPos);
//
//            gsm.set(new PlayState(gsm));
//            dispose();
//        }

//        camera.update();
//        batch.setProjectionMatrix(camera.combined);

//        if (Gdx.input.justTouched()) {
//            Vector3 touchPos = new Vector3();
//            touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
//            camera.unproject(touchPos);
//
//            if (playButtonRectangle.contains(touchPos.x, touchPos.y)) {
//                batch.begin();
//                batch.draw(playBtn, 1, 1);
//                batch.end();
//
//            }
//            gsm.set(new PlayState(gsm));
//            dispose();
//
//
//        }

    }

    @Override
    public void update(float dt) {
        handleInput();

    }

    @Override
    public void render(SpriteBatch sb) {
//        sb.begin();
//        sb.draw(background, 0, 0, TankStars.WIDTH, TankStars.HEIGHT);
//        sb.draw(playBtn, (TankStars.WIDTH / 2) - (playBtn.getWidth() / 2), (0));
//        sb.draw(resBtn, 0, 0);
//        sb.draw(exitBtn, (TankStars.WIDTH) - playBtn.getWidth(), (0));
//        sb.end();

        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        batch.setProjectionMatrix(camera.combined);

        sb.begin();
        sb.draw(background, 0, 0, TankStars.WIDTH, TankStars.HEIGHT);
        sb.draw(playBtn, (TankStars.WIDTH / 2) - (playBtn.getWidth() / 2), (0));
        sb.draw(resBtn, 0, 0);
        sb.draw(exitBtn, (TankStars.WIDTH) - playBtn.getWidth(), (0));

        if (Gdx.input.isTouched()) {
            Vector3 touchPos = new Vector3();
            touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
            camera.unproject(touchPos);

            if (playButtonRectangle.contains(touchPos.x, touchPos.y)) {
                batch.begin();
                batch.draw(playBtn, playButtonRectangle.x, playButtonRectangle.y);
                batch.end();

            }
            gsm.set(new PlayState(gsm));
            dispose();


        }
        sb.end();













    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();

    }
}