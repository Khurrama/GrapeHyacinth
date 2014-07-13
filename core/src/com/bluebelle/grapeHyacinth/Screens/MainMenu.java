package com.bluebelle.grapeHyacinth.Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.bluebelle.grapeHyacinth.GrapeHyacinth;
import com.bluebelle.grapeHyacinth.Screens.SplashScreens.NewGameSplashScreen;

/**
 * Created by Cullen on 11/07/2014.
 */
public class MainMenu implements Screen {

    private Stage stage;
    private Stage stage2;
    private TextureAtlas atlas;
    private Skin skin;
    private Skin skin2;
    private TextureAtlas atlas2;
    private Table table;
    private Table table2;
    private Button buttonStartNewGame;
    private TextButton buttonContinue;
    private TextButton buttonLoadGame;
    private TextButton buttonSettings;
    private TextButton buttonAbout;
    private TextButton buttonInfo;
    private Button buttonExit;
    private BitmapFont white;
    private Label heading;

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);

        Table.drawDebug(stage); // TODO remove later

        stage.act(delta);

        stage.draw();

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {
        white = new BitmapFont(Gdx.files.internal("ui/fonts/white/white.fnt"));

        stage = new Stage();

        Gdx.input.setInputProcessor(stage);

    // Getting our button pack's
        atlas = new TextureAtlas("ui/buttons/New Game.pack");
        atlas2 = new TextureAtlas("ui/buttons/Exit Game.pack");

        skin = new Skin(atlas);
        skin2 = new Skin(atlas2);

        table = new Table(skin);
        table2 = new Table(skin2);

        table.setBounds(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        table2.setBounds(5, 5, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    // Creating our buttons

        Button.ButtonStyle ButtonStyle_buttonStartNewGame = new Button.ButtonStyle();
        Button.ButtonStyle ButtonStyle_buttonExit = new Button.ButtonStyle();

        buttonStartNewGame = new Button(ButtonStyle_buttonStartNewGame);

        ButtonStyle_buttonStartNewGame.up = skin.getDrawable("New Game_normal");
        ButtonStyle_buttonStartNewGame.down = skin.getDrawable("New Game_pressed");

        buttonStartNewGame.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                ((Game) Gdx.app.getApplicationListener()).setScreen(new NewGameSplashScreen());
            }
        });
        buttonStartNewGame.pad(20);

        buttonExit = new Button(ButtonStyle_buttonExit);
        ButtonStyle_buttonExit.up = skin2.getDrawable("ExitGame_normal");
        ButtonStyle_buttonExit.down = skin2.getDrawable("ExitGame_pressed");


        buttonExit.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Gdx.app.exit();
            }
        });

        buttonExit.pad(20);

    // Creating heading
        Label.LabelStyle headingStyle = new Label.LabelStyle(white, Color.WHITE);

        heading = new Label(GrapeHyacinth.TITLE, headingStyle);
        heading.setFontScale(2);

    // adding Stuff to draw later
        table.add(heading);
        table.getCell(heading).spaceBottom(100);
        table.row();
        table.add(buttonStartNewGame);
        table.row();
        table.add(buttonExit);
        table.debug(); // TODO remove later
        stage.addActor(table);
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
        stage.dispose();
        stage2.dispose();
        atlas.dispose();
        atlas2.dispose();
        skin.dispose();
        skin2.dispose();
        white.dispose();

    }
}
