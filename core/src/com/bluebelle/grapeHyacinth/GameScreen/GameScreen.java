package com.bluebelle.grapeHyacinth.GameScreen;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.bluebelle.grapeHyacinth.Assets.Assets;
import com.bluebelle.grapeHyacinth.GrapeHyacinth;


/**
 * Created by Mios on 2/07/2014.
 */
public class GameScreen implements Screen {

    private GrapeHyacinth game;
    private OrthographicCamera camera;
    SpriteBatch batch;


    public GameScreen(GrapeHyacinth game){
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(true, 1920, 1080);

        batch = new SpriteBatch();

//        spriteBack.flip(false, true);

    }
    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.95f,0.95f, 0.95f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();

        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(Assets.spriteBack, 0, 0);
        batch.end();

    }

    @Override
    public void dispose() {

    }
    @Override
    public void resume() { }
    @Override
    public void pause() { }
    @Override
    public void show() {}


    //Lesser used

    @Override
    public void resize(int width, int height) { }

    @Override
    public void hide() { }
}
