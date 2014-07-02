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

    public static void Load() {

        textureBack = new Texture(Gdx.files.internal("data\\Castle.jpg"));
        textureBack.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        spriteBack = new Sprite(textureBack);
        spriteBack.flip(false, true);

    }
}
