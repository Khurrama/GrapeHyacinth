package com.bluebelle.grapeHyacinth.Helpers;

import com.bluebelle.grapeHyacinth.Characters.Mario;
import com.bluebelle.grapeHyacinth.Objects.Levels.Level;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cullen on 12/07/2014.
 */
public class LevelController {

    enum Keys {
        LEFT, RIGHT, JUMP, FIRE
    }

    private Level level;
    private Mario mario;

    static Map<Keys, Boolean> keys = new HashMap<Keys, Boolean>();
    static {
        keys.put(Keys.LEFT, false);
        keys.put(Keys.RIGHT, false);
        keys.put(Keys.JUMP, false);
        keys.put(Keys.FIRE, false);
    };

    public LevelController(Level level) {
        this.level = level;
        this.mario = level.getMario();
    }

    // ** Key presses and touches **************** //

    public void leftPressed() {
        keys.get(keys.put(Keys.LEFT, true));
    }

    public void rightPressed() {
        keys.get(keys.put(Keys.RIGHT, true));
    }

    public void jumpPressed() {
        keys.get(keys.put(Keys.JUMP, true));
    }

    public void firePressed() {
        keys.get(keys.put(Keys.FIRE, false));
    }

    public void leftReleased() {
        keys.get(keys.put(Keys.LEFT, false));
    }

    public void rightReleased() {
        keys.get(keys.put(Keys.RIGHT, false));
    }

    public void jumpReleased() {
        keys.get(keys.put(Keys.JUMP, false));
    }

    public void fireReleased() {
        keys.get(keys.put(Keys.FIRE, false));
    }

    /** The main update method **/
    public void update(float delta) {
        processInput();
        mario.update(delta);
    }

    /** Change Mario's state and parameters based on input controls **/
    private void processInput() {
        if (keys.get(Keys.LEFT)) {
            // left is pressed
            mario.setFacingLeft(true);
            mario.setState(Mario.State.WALKING);
            mario.getVelocity().x = -Mario.SPEED;
        }
        if (keys.get(Keys.RIGHT)) {
            // left is pressed
            mario.setFacingLeft(false);
            mario.setState(Mario.State.WALKING);
            mario.getVelocity().x = Mario.SPEED;
        }
        // need to check if both or none direction are pressed, then Mario is idle
        if ((keys.get(Keys.LEFT) && keys.get(Keys.RIGHT)) ||
                (!keys.get(Keys.LEFT) && !(keys.get(Keys.RIGHT)))) {
            mario.setState(Mario.State.IDLE);
            // acceleration is 0 on the x
            mario.getAcceleration().x = 0;
            // horizontal speed is 0
            mario.getVelocity().x = 0;
        }
    }
}
