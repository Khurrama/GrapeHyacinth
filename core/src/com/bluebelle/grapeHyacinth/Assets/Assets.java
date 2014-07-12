package com.bluebelle.grapeHyacinth.Assets;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by Mios on 2/07/2014.
 */
public class Assets {
    public static Texture textureBack;
    public static Sprite spriteBack;

    public static Texture textureMario;
    public static Sprite spriteMario;

    public static  Texture textureFloor;
    public static Sprite spriteFloor;

    public static void Load() {

        textureMario = new Texture(Gdx.files.internal("characters\\Mario-RV.png"));
        textureMario.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        spriteMario = new Sprite(textureMario);
        spriteMario.flip(false, true);

        textureFloor = new Texture(Gdx.files.internal("objects\\Floor.png"));
        textureFloor.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        spriteFloor = new Sprite(textureFloor);
        spriteFloor.flip(false, true);

        textureBack = new Texture(Gdx.files.internal("data\\Castle.jpg"));
        textureBack.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        spriteBack = new Sprite(textureBack);
        spriteBack.flip(false, true);

    }
}
