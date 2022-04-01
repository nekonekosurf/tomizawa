import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
    This program implements an animation that moves
    a car shape.
*/


public class AnimationTester{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        // MoveableShape shape = new AirPlaneShape(0, 0, CAR_WIDTH);
        MoveableShape shape = new CarShape(0, 0, CAR_WIDTH,ICON_WIDTH);
        ShapeIcon icon = new ShapeIcon(shape,ICON_WIDTH, ICON_HEIGHT);
        JLabel label = new JLabel(icon);
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        final int DELAY = 2; //車の動きが早くなる
        // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, event ->
            {
                shape.move();
                label.repaint();
            });

        t.start();
    }
    private static final int ICON_WIDTH =400; //車が走る距離が短くなる
    private static final int ICON_HEIGHT = 100;
    private static final int CAR_WIDTH = 100; //車がでかくなる
}