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

    /** The floors making up the level **/
    Array<Floor> floors = new Array<Floor>();
    /** Our player controlled hero **/
    Mario mario;
    public Floor getFloors;

    // Getters -----------
    public Array<Floor> getFloors() {
        return floors;
    }
    public Mario getMario() {
        return mario;
    }
    // --------------------

    public Level() {
        createLevel();
    }

    private void createLevel() {
        mario = new Mario(new Vector2(7, 2));

        for (int i = 0; i < 10; i++) {
            floors.add(new Floor(new Vector2(i, 9)));
            floors.add(new Floor(new Vector2(i, 9)));
            if (i > 2)
                floors.add(new Floor(new Vector2(i, 1)));
        }
        floors.add(new Floor(new Vector2(9, 2)));
        floors.add(new Floor(new Vector2(9, 3)));
        floors.add(new Floor(new Vector2(9, 4)));
        floors.add(new Floor(new Vector2(9, 5)));

        floors.add(new Floor(new Vector2(6, 3)));
        floors.add(new Floor(new Vector2(6, 4)));
        floors.add(new Floor(new Vector2(6, 5)));
    }
}
