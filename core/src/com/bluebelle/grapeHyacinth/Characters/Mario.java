package com.bluebelle.grapeHyacinth.Characters;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.bluebelle.grapeHyacinth.Assets.Assets;

/**
 * Created by Mios on 2/07/2014.
 */
public class Mario {

    public enum State {
        IDLE, WALKING, JUMPING, DYING
    }

    public static final float SPEED = 4f;	// unit per second
    public static final float JUMP_VELOCITY = 4f;
    public static final float SIZE = 0.5f; // half a unit

    Vector2 	position = new Vector2();
    Vector2 	acceleration = new Vector2();
    Vector2 	velocity = new Vector2();
    Rectangle 	bounds = new Rectangle();
    State		state = State.IDLE;
    boolean		facingLeft = true;

    public Mario(Vector2 position) {
        this.position = position;
        this.bounds.height = SIZE;
        this.bounds.width = SIZE;
    }


    public boolean isFacingLeft() {
        return facingLeft;
    }

    public void setFacingLeft(boolean facingLeft) {
        this.facingLeft = facingLeft;
    }

    public Vector2 getPosition() {
        return position;
    }

    public Vector2 getAcceleration() {
        return acceleration;
    }

    public Vector2 getVelocity() {
        return velocity;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public State getState() {
        return state;
    }

    public void setState(State newState) {
        this.state = newState;
    }

    public void update(float delta) {
        position.add(velocity.cpy().scl(delta));
    }
}
