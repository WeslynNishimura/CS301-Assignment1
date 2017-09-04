package edu.up.cs301.campusmap;

import android.graphics.Canvas;

/**
 * <!-- class SquareToken -->
 *
 * This class inherits from SimpleMapToken and draws tokens in the shape of a square
 *
 * (See log for inheritance help on this project)
 *
 * Created by Weslyn Nishimura on 9/3/2017.
 */
public class SquareToken extends SimpleMapToken {

    /**
     * Constructor
     * @param xCoord the x-coordinate
     * @param yCoord the y-coordinate
     */
    public SquareToken(float xCoord, float yCoord) {
        super(xCoord, yCoord);
    } // SquareToken

    /**
     * Paint the token onto a given canvas
     * @param canvas the canvas on which to draw
     */
    public void drawOn(Canvas canvas) {
        // paint the square on the canvas
        canvas.drawRect(x, y, x+20, y+20, paint);
    } // drawOn

} // SquareToken
