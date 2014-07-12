package com.bluebelle.grapeHyacinth.Objects.Levels;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.bluebelle.grapeHyacinth.Characters.Mario;
import com.bluebelle.grapeHyacinth.Objects.Floor;

/**
 * Created by Cullen on 12/07/2014.
 */
public class Level {

    Floor floor;

    Mario mario;

    // Get some stuff (characters, floors, walls, etc...)
    public Floor getFloor() {
        return  floor;
    }
    public Mario getMario() {
        return mario;
    }
    // Object Placeholder

    public Level() {
        createLevel();
    }

    private void createLevel() {
        mario = new Mario(new Vector2(7, 2));

        for (int i = 0; i < 10; i++) {
            floor.add(new Floor(new Vector2(i, 0)));
        }
    }
}
