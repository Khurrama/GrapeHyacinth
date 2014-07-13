package com.bluebelle.grapeHyacinth.Screens.SplashScreens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.bluebelle.grapeHyacinth.GrapeHyacinth;
import com.bluebelle.grapeHyacinth.Screens.GameScreen;
import com.bluebelle.grapeHyacinth.Screens.MainMenu;

/**
 * Created by Cullen on 13/07/2014.
 */
public class NewGameSplashScreen implements Screen {

    private SpriteBatch spriteBatch;
    private Texture newgamesplashscreen;
    private Game GrapeHyacinth;

    /**
     * Constructor for the splash screen
     * @param g Game which called this splash screen.
     */
    public NewGameSplashScreen() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
        spriteBatch.begin();
        spriteBatch.draw(newgamesplashscreen, 0, 0);
        spriteBatch.end();

        if(Gdx.input.justTouched())
            ((Game) Gdx.app.getApplicationListener()).setScreen(new GameScreen());

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {

        spriteBatch = new SpriteBatch();
        newgamesplashscreen = new Texture(Gdx.files.internal("ui/splash_screens/NewGame_SplashScreen.gif"));

    }

    @Override
    public void hide() {

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
