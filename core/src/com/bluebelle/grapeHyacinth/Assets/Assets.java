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

    public static void Load() {

        textureMario = new Texture(Gdx.files.internal("characters\\Mario-RV.png"));
        textureMario.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        spriteMario = new Sprite(textureMario);
        spriteMario.flip(false, true);

        textureBack = new Texture(Gdx.files.internal("data\\Castle.jpg"));
        textureBack.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        spriteBack = new Sprite(textureBack);
        spriteBack.flip(false, true);

    }
}
