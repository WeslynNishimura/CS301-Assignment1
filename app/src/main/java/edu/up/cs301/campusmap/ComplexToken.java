package edu.up.cs301.campusmap;

import android.graphics.Canvas;
import android.graphics.Path;

/**
 *  * <!-- class ComplexToken -->
 *
 * This class inherits from SimpleMapToken and draws tokens in a more complex shape
 * Created by Weslyn Nishimura on 9/3/2017.
 */
public class ComplexToken extends SimpleMapToken {

    /**
     * Constructor
     * @param xCoord the x-coordinate
     * @param yCoord the y-coordinate
     */
    public ComplexToken(float xCoord, float yCoord) {
        super(xCoord, yCoord);
    } // ComplexToken

    /**
     * Paint the token onto a given canvas
     * @param canvas the canvas on which to draw
     */
    public void drawOn(Canvas canvas) {
        // paint the complex token on the canvas
        // (see log for Path help on this project)
        Path star = new Path();
        star.moveTo(x+15, y);
        star.lineTo(x+25, y+30);
        star.lineTo(x, y+12);
        star.lineTo(x+30, y+12);
        star.lineTo(x+5, y+30);
        star.close();

        canvas.drawPath(star, paint);
    } // drawOn

} // ComplexToken
