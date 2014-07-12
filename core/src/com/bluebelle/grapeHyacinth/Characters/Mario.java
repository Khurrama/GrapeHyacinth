package com.bluebelle.grapeHyacinth.Characters;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.bluebelle.grapeHyacinth.Assets.Assets;

/**
 * Created by Mios on 2/07/2014.
 */
public class Mario {

    public Rectangle getBounds() {
        return bounds;
    }

    public enum State {
        IDLE, WALKING, JUMPING, RUNNING, DYING
    }

    static final float SPEED = 2f; // unit per second
    static final float RUNNING_SPEED = 4f;
    static final float JUMP_VELOCITY = 1f;
    static final float SIZE = 0.5f; // half a unit

    Vector2     position = new Vector2();
    Vector3     acceleration = new Vector3();
    Vector3     velocity = new Vector3();
    Rectangle   bounds = new Rectangle();
    State       state = State.IDLE;
    boolean     facingLeft = true;

    public Mario(Vector2 mario_position){
        this.position = mario_position;
        this.bounds.height = SIZE;
        this.bounds.width = SIZE;
    }
    public Vector2 mario_position() {
        return mario_position();
    }
}
