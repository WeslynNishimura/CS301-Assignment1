package edu.up.cs301.campusmap;

/**
 * <!-- class TokenFactory -->
 *
 * This class is used to create map tokens.
 *
 * @author Andrew M. Nuxoll
 * @author Steven R. Vegdahl
 * @author Weslyn W. Nishimura
 * @version August 2017
 */

public class TokenFactory {
    /**
     * createMapToken
     *
     * creates a new object whose type is SimpleMapToken or some subclass
     * thereof and returns it to the caller
     *
     * @param x x-coordinate of the token
     * @param y y-coordinate of the token
     * @param type which type of token to draw (0, 1 or 2)
     */
    public static SimpleMapToken createMapToken(float x, float y, int type)
    {

        switch(type)
        {
            case 0: // Circle Token
                return new SimpleMapToken(x,y);
            case 1: // Square Token
                return new SquareToken(x,y);
            case 2: // Complex Token (star shape)
                return new ComplexToken(x,y);
            default: // Circle Token
                return new SimpleMapToken(x,y);
        }
    }//createMapToken

}//class TokenFactory
