package com.bluebelle.grapeHyacinth.Screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

import java.awt.Label;

/**
 * Created by Cullen on 11/07/2014.
 */
public class MainMenu implements Screen {

    private Stage stage;
    private TextureAtlas atlas;
    private Skin skin;
    private Table table;
    private TextButton buttonStartNewGame;
    private TextButton buttonContinue;
    private TextButton buttonLoadGame;
    private TextButton buttonSettings;
    private TextButton buttonAbout;
    private TextButton buttonInfo;
    private TextButton buttonExit;
    // private BitmapFont white;
    private Label heading;

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {
        atlas = new TextureAtlas("ui/button.pack");
        skin = new Skin(atlas);

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
