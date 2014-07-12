package com.bluebelle.grapeHyacinth.Screens;


import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.bluebelle.grapeHyacinth.GrapeHyacinth;
import com.bluebelle.grapeHyacinth.Helpers.LevelController;
import com.bluebelle.grapeHyacinth.Helpers.LevelRenderer;
import com.bluebelle.grapeHyacinth.Objects.Levels.Level;


/**
 * Created by Mios on 2/07/2014.
 */
public class GameScreen implements Screen, InputProcessor {

    private Level 			level;
    private LevelRenderer 	renderer;
    private LevelController controller;

    private int width, height;

    @Override
    public void show() {
        level = new Level();
        renderer = new LevelRenderer(level, true);
        controller = new LevelController(level);
        Gdx.input.setInputProcessor(this);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
        Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);

        controller.update(delta);
        renderer.render();
    }

    @Override
    public void resize(int width, int height) {
        renderer.setSize(width, height);
        this.width = width;
        this.height = height;
    }

    @Override
    public void hide() {
        Gdx.input.setInputProcessor(null);
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
    }

    @Override
    public void resume() {
        // TODO Auto-generated method stub
    }

    @Override
    public void dispose() {
        Gdx.input.setInputProcessor(null);
    }

    // * InputProcessor methods ***************************//

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Input.Keys.LEFT)
            controller.leftPressed();
        if (keycode == Input.Keys.RIGHT)
            controller.rightPressed();
        if (keycode == Input.Keys.Z)
            controller.jumpPressed();
        if (keycode == Input.Keys.X)
            controller.firePressed();
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        if (keycode == Input.Keys.LEFT)
            controller.leftReleased();
        if (keycode == Input.Keys.RIGHT)
            controller.rightReleased();
        if (keycode == Input.Keys.Z)
            controller.jumpReleased();
        if (keycode == Input.Keys.X)
            controller.fireReleased();
        return true;
    }

    @Override
    public boolean keyTyped(char character) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean touchDown(int x, int y, int pointer, int button) {
        if (!Gdx.app.getType().equals(Application.ApplicationType.Android))
            return false;
        if (x < width / 2 && y > height / 2) {
            controller.leftPressed();
        }
        if (x > width / 2 && y > height / 2) {
            controller.rightPressed();
        }
        return true;
    }

    @Override
    public boolean touchUp(int x, int y, int pointer, int button) {
        if (!Gdx.app.getType().equals(Application.ApplicationType.Android))
            return false;
        if (x < width / 2 && y > height / 2) {
            controller.leftReleased();
        }
        if (x > width / 2 && y > height / 2) {
            controller.rightReleased();
        }
        return true;
    }

    @Override
    public boolean touchDragged(int x, int y, int pointer) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        // TODO Auto-generated method stub
        return false;
    }


}
