package com.bluebelle.grapeHyacinth;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL30;
import com.bluebelle.grapeHyacinth.Objects.Floor;
import com.bluebelle.grapeHyacinth.Screens.GameScreen;
import com.bluebelle.grapeHyacinth.Helpers.LevelRenderer;

public class GrapeHyacinth extends Game {

    @Override
    public void create() {
        setScreen(new GameScreen());
    }


    private Floor floor;
    private LevelRenderer renderer;

    public void render(float delta) {
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
        Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
        renderer.render();
}}

