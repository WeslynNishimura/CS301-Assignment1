package edu.up.cs301.campusmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;

/**
 * <!-- class SimpleMapToken -->
 *
 * This class represents a single map token that can be drawn on a canvas
 *
 * @author Andrew M. Nuxoll
 * @author Steven R. Vegdahl
 * @author Weslyn W. Nishimura
 * @version August 2017
 */
public class SimpleMapToken {

    // instance variables
    protected float x; // my x coordinate
    protected float y; // my y coordinate
    protected float radius; //my radius
    protected Paint paint;  //my color

    /**
     * Constructor
     * @param xCoord the x-coordinate
     * @param yCoord the y-coordinate
     */
    public SimpleMapToken(float xCoord, float yCoord) {
        // initialize the instance variables
        x = xCoord; // x-coordinate
        y = yCoord; // y-coordinate
        radius = 15; // radius of the circle
        paint = new Paint(); // paint object, which paints ...

        // Select a different (random) color each time a token is created
        Random rand = new Random(); // See log

        // Create a random value for rgb
        int redVal = rand.nextInt(255) + 1;
        int greenVal = rand.nextInt(255) + 1;
        int blueVal = rand.nextInt(255) + 1;

        // Create the random color
        int tokenColor = Color.rgb(redVal, greenVal, blueVal);

        // Set the token color
        paint.setColor(tokenColor);
    }//ctor

    /**
     * this token can paint itself on a given canvas
     * @param canvas the canvas on which to draw
     */
    public void drawOn(Canvas canvas) {
        // paint the dot on the canvas
        canvas.drawCircle(x, y, radius, paint);
    }//drawOn

}//class SimpleMapToken
