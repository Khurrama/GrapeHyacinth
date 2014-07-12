package com.bluebelle.grapeHyacinth.Screens;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.bluebelle.grapeHyacinth.GrapeHyacinth;
import com.bluebelle.grapeHyacinth.Helpers.LevelRenderer;
import com.bluebelle.grapeHyacinth.Objects.Levels.Level;


/**
 * Created by Mios on 2/07/2014.
 */
public class GameScreen implements Screen {

 /*  private GrapeHyacinth game; */
    private OrthographicCamera camera;
 /*   SpriteBatch batch;
    Vector3 touch; */

    private Level level;
    private LevelRenderer renderer;

    @Override
    public void show() {
        level = new Level();
        renderer = new LevelRenderer(level);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
        Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
        renderer.render();
    }

 /*   public GameScreen(GrapeHyacinth game){
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(true, 1920, 1080);

        batch = new SpriteBatch();

        touch = new Vector3();

        mario = new Mario();

        floor = new Floor();

        spriteBack.flip(false, true);

    }
    @Override
      public void render(float delta) {
        Gdx.gl.glClearColor(0.95f,0.95f, 0.95f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        generalUpdate();
        generalUpdate(touch, camera);

        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(Assets.spriteBack, 0, 0);
        batch.draw(mario.image, mario.bounds.x, mario.bounds.y);
        batch.draw(floor.image, floor.bounds.x, floor.bounds.y);
        batch.end();

    }
    public void generalUpdate(Vector3 touch, OrthographicCamera camera) {
        if (Gdx.input.isTouched()) {
            touch.set(Gdx.input.getX(), (Gdx.input.getY()), 0);
            camera.unproject(touch);
        }

    }
*/
    public void generalUpdate() {
        if (Gdx.input.isKeyPressed(Input.Keys.Q) || Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
       //     mario.bounds.x -= 5;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D) || Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
        //    mario.bounds.x += 5;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.Z) || Gdx.input.isKeyPressed(Input.Keys.UP)) {
       //     mario.bounds.y -= 5;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S) || Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
       //     mario.bounds.y += 5;
        }
      //  if(mario.bounds.overlaps(floor.bounds)) {
       //     mario.
      //  }
    }

    @Override
    public void dispose() {

    }
    @Override
    public void resume() { }
    @Override
    public void pause() { }
    /*@Override
    public void show() {}*/


    //Lesser used

    @Override
    public void resize(int width, int height) { }

    @Override
    public void hide() { }
}
