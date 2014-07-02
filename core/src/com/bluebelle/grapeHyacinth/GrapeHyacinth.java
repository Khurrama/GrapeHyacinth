package com.bluebelle.grapeHyacinth;

import com.badlogic.gdx.Game;
import com.bluebelle.grapeHyacinth.Assets.Assets;
import com.bluebelle.grapeHyacinth.GameScreen.GameScreen;


public class GrapeHyacinth extends Game {

    private GameScreen GameScreen;

    @Override
    public void create() {
        //Init Assets.Load Loading Background
        Assets.Load();

        GameScreen = new GameScreen(this);

        setScreen(GameScreen);
}


        }