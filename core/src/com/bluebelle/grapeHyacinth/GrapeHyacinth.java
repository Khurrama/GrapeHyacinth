package com.bluebelle.grapeHyacinth;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;


public class GrapeHyacinth extends ApplicationAdapter {
	private SpriteBatch batch;
//	private BitmapFont font;
	private FreeTypeFontGenerator generator;
    private FreeTypeFontGenerator.FreeTypeFontParameter parameter;
    private BitmapFont font12;

	@Override
	public void create () {
		batch = new SpriteBatch();
	    //font = new BitmapFont();
        generator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/segoeui.ttf"));
        parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();

        parameter.size = 64;
        font12 = generator.generateFont(parameter); //font size 12 pixels
        font12.setColor(Color.BLACK);
        generator.dispose();
    }

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
        font12.draw(batch, "Hello world, again!", 200, 200);
		batch.end();
	}

    @Override
    public void resize(int width, int height) {
        // TODO AUTO-generated method stub
    }

    @Override
    public void pause() {
        // TODO AUTO-generated method stub
    }

    @Override
    public void resume() {
        // TODO AUTO-generated method stub
    }

    @Override
    public void dispose() {
        // TODO AUTO-generated method stub

    }

}
