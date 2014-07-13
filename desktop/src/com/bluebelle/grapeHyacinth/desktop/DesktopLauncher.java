package com.bluebelle.grapeHyacinth.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.bluebelle.grapeHyacinth.GrapeHyacinth;

public class DesktopLauncher {

    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = GrapeHyacinth.TITLE + " v" + GrapeHyacinth.VERSION;
        cfg.vSyncEnabled = true;
        cfg.useGL30 = true;
        cfg.width = 1920;
        cfg.height = 1080;

        // fullscreen
        cfg.fullscreen = true;
        // vSync
        cfg.vSyncEnabled = true;

        cfg.addIcon("icons/desktop_launcher.png", Files.FileType.Internal);

        new LwjglApplication(new GrapeHyacinth(), cfg);

        // set resolution to HD ready (1360 x 768) and set full-screen to true
        Gdx.graphics.setDisplayMode(1360, 768, true);

        // set resolution to default and set full-screen to true
        Gdx.graphics.setDisplayMode(Gdx.graphics.getDesktopDisplayMode().width, Gdx.graphics.getDesktopDisplayMode().height, true);
    }

}