package com.bluebelle.grapeHyacinth.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.bluebelle.grapeHyacinth.GrapeHyacinth;

public class DesktopLauncher {

    public static void main(String[] args) {
       LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        config.useGL30 = true;
        config.title = "GrapeHyacinth";

      new LwjglApplication(new GrapeHyacinth(), config);

    }
}