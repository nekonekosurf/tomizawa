import java.awt.*;


public interface MoveableShape {
    /**
        Draws the shape.0
        @param g2 the graphics context
    */
    void draw(Graphics2D g2);
     /**
        Moves the shape.
        It is up to the shape to move itself, for example by tracking the time
        its last movement, its position, and velocity.
    */
    void move();
}
