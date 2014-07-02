package com.bluebelle.grapeHyacinth.Main;

import com.badlogic.gdx.Screen;

/**
 * Created by Cullen on 2/07/2014.
 */
public class GameScreen implements Screen {


    // dimensions
    public static final int WIDTH = 320;
    public static final int HEIGHT = 240;
    public static final int SCALE = 2;

    // game thread
    private Thread thread;
    private boolean running;
    private int FPS = 60;
    private long targetTime = 1000 / FPS;


    @Override
    public void resize(int width, int height) {
        // TODO AUTO-generated method stub

    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {


    }

    @Override
    public void dispose() {

    }
}
