package com.bluebelle.grapeHyacinth.Objects;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Cullen on 7/07/2014.
 */
public class Floor {

    public static final float SIZE = 1f;

    Vector2 	position = new Vector2();
    Rectangle 	bounds = new Rectangle();

    public Floor(Vector2 position) {
        this.position = position;
        this.bounds.width = SIZE;
        this.bounds.height = SIZE;
    }

    public Vector2 getPosition() {
        return position;
    }

    public Rectangle getBounds() {
        return bounds;
    }
}
