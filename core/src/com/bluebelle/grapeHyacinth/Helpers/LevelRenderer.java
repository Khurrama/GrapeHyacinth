package com.bluebelle.grapeHyacinth.Helpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.bluebelle.grapeHyacinth.Characters.Mario;
import com.bluebelle.grapeHyacinth.Objects.Floor;
import com.bluebelle.grapeHyacinth.Objects.Levels.Level;

/**
 * Created by Cullen on 12/07/2014.
 */
public class LevelRenderer {

    private static final float CAMERA_WIDTH = 10f;
    private static final float CAMERA_HEIGHT = 7f;

    private Level level;
    private OrthographicCamera cam;

    /** for debug rendering **/
    ShapeRenderer debugRenderer = new ShapeRenderer();

    /** Textures **/
    private Texture marioTexture;
    private Texture floorTexture;

    private SpriteBatch spriteBatch;
    private boolean debug = false;
    private int width;
    private int height;
    private float ppuX;	// pixels per unit on the X axis
    private float ppuY;	// pixels per unit on the Y axis
    public void setSize (int w, int h) {
        this.width = w;
        this.height = h;
        ppuX = (float)width / CAMERA_WIDTH;
        ppuY = (float)height / CAMERA_HEIGHT;
    }

    public LevelRenderer(Level level, boolean debug) {
        this.level = level;
        this.cam = new OrthographicCamera(CAMERA_WIDTH, CAMERA_HEIGHT);
        this.cam.position.set(CAMERA_WIDTH / 2f, CAMERA_HEIGHT / 2f, 0);
        this.cam.update();
        this.debug = debug;
        spriteBatch = new SpriteBatch();
        loadTextures();
    }

    private void loadTextures() {
        marioTexture = new  Texture(Gdx.files.internal("characters/Mario-RV.png"));
        floorTexture = new Texture(Gdx.files.internal("objects/Floor.png"));
    }


    public void render() {
        spriteBatch.begin();
        drawFloors();
        drawMario();
        spriteBatch.end();
        if (debug)
            drawDebug();
    }


    private void drawFloors() {
        for (Floor floor : level.getFloors()) {
            spriteBatch.draw(floorTexture, floor.getPosition().x * ppuX, floor.getPosition().y * ppuY, Floor.SIZE * ppuX, Floor.SIZE * ppuY);
        }
    }

    private void drawMario() {
        Mario mario = level.getMario();
        spriteBatch.draw(marioTexture, mario.getPosition().x * ppuX, mario.getPosition().y * ppuY, Mario.SIZE * ppuX, Mario.SIZE * ppuY);
    }

    private void drawDebug() {
        // render floors
        debugRenderer.setProjectionMatrix(cam.combined);
        debugRenderer.begin(ShapeRenderer.ShapeType.Line);
        for (Floor floor : level.getFloors()) {
            Rectangle rect = floor.getBounds();
            float x1 = floor.getPosition().x + rect.x;
            float y1 = floor.getPosition().y + rect.y;
            debugRenderer.setColor(new Color(1, 0, 0, 1));
            debugRenderer.rect(x1, y1, rect.width, rect.height);
        }
        // render Mario
        Mario mario = level.getMario();
        Rectangle rect = mario.getBounds();
        float x1 = mario.getPosition().x + rect.x;
        float y1 = mario.getPosition().y + rect.y;
        debugRenderer.setColor(new Color(0, 1, 0, 1));
        debugRenderer.rect(x1, y1, rect.width, rect.height);
        debugRenderer.end();
    }
}
