import java.awt.*;
import java.awt.geom.*;
import java.util.*;
/**
    A car that can be moved around.
*/

public class AirPlaneShape implements MoveableShape{
    /**
        Constructs a car item.
        @param x the left of the bounding rectangle
        @param y the top of the bounding rectangle
        @param width the width of the bounding rectangle
    */


    public AirPlaneShape(int x, int y, int width){
        this.x = x;
        this.y = y;
        this.width = width;
    }

    public void move(){
        x++;
    }

    public void draw(Graphics2D g2){
        Rectangle2D.Double body= new Rectangle2D.Double(x, y + width /6,width - 1, width / 6);
        
        Ellipse2D.Double frontTire= new Ellipse2D.Double(x + width / 6, y + width / 3,width / 6, width / 6);
        
        Ellipse2D.Double rearTire= new Ellipse2D.Double(x + width * 2 / 3, y + width / 3,width / 6, width / 6);

        // // The bottom of the front windshield
        // Point2D.Double r1= new Point2D.Double(x + width / 6, y + width / 6);
        // // The front of the roof
        // Point2D.Double r2= new Point2D.Double(x + width / 3, y);
        // // The rear of the roof
        // Point2D.Double r3= new Point2D.Double(x + width * 2 / 3, y);
        // // The bottom of the rear windshield
        // Point2D.Double r4= new Point2D.Double(x + width * 5 / 6, y + width / 6);
        // Line2D.Double frontWindshield= new Line2D.Double(r1, r2);
        // Line2D.Double roofTop= new Line2D.Double(r2, r3);
        // Line2D.Double rearWindshield= new Line2D.Double(r3, r4);
        // g2.draw(body);
        // g2.draw(frontTire);
        // g2.draw(rearTire);
        // g2.draw(frontWindshield);
        // g2.draw(roofTop);
        // g2.draw(rearWindshield);
        // g2.fill(roofTop);


            // Point2D.Double t1= new Point2D.Double(x + width / 5, y + width /10);
            Point2D.Double t1= new Point2D.Double(x, y +width/12 );
            Point2D.Double t2= new Point2D.Double(x + width /8, y +width / 6);
            Point2D.Double t3= new Point2D.Double(x + 2*width /8 , y + width / 6);
            Line2D.Double leftWing1= new Line2D.Double(t1, t2);
            Line2D.Double leftWing2= new Line2D.Double(t1, t3);

            g2.draw(leftWing1);
            g2.draw(leftWing2);


            Point2D.Double t4= new Point2D.Double(x+width / 3 , y);
            Point2D.Double t5= new Point2D.Double(x + width /3 +width/6, y + width / 6);
            Point2D.Double t6= new Point2D.Double(x +  width /3 +width/6 +width/3 , y + width / 6);
            Line2D.Double frontWing1= new Line2D.Double(t4, t5);
            Line2D.Double frontWing2= new Line2D.Double(t4, t6);
            g2.draw(frontWing1);
            g2.draw(frontWing2);



            Point2D.Double f1= new Point2D.Double(x + width , y + width / 6);
            Point2D.Double f2= new Point2D.Double(x +  width + width/6, y + width/6 + width /(6*2));
            Point2D.Double f3= new Point2D. Double(x + width , y +width / 6+width/6);

            Line2D.Double front1= new Line2D.Double(f2, f1);
            Line2D.Double front2= new Line2D.Double(f2, f3);
            g2.draw(front1);
            g2.draw(front2);


            
            Point2D.Double b1= new Point2D.Double(x, y +3*width/6-width/12 );
            Point2D.Double b2= new Point2D.Double(x + width /8, y +width / 6 +width/6);
            Point2D.Double b3= new Point2D.Double(x + 2*width /8 , y + width / 6 +width/6);
            Line2D.Double rightWing1= new Line2D.Double(b1, b2);
            Line2D.Double rightWing2= new Line2D.Double(b1, b3);

            g2.draw(rightWing1);
            g2.draw(rightWing2);


            

            Point2D.Double b4= new Point2D.Double(x+width / 3 , y + 3*width/6);
            Point2D.Double b5= new Point2D.Double(x + width /3 +width/6, y + width / 6 + +width/6);
            Point2D.Double b6= new Point2D.Double(x +  width /3 +width/6 +width/3 , y + width / 6 + +width/6);
            Line2D.Double frontWing1_= new Line2D.Double(b4, b5);
            Line2D.Double frontWing2_= new Line2D.Double(b4, b6);
            g2.draw(frontWing1_);
            g2.draw(frontWing2_);

        // Ellipse2D.Double rec1 = new Ellipse2D.Double(x, y+width/2, width, width/10);
        Rectangle2D.Double rec1= new Rectangle2D.Double(x, y + width /6 , width , width / 6);
        g2.draw(rec1);



    }
        private int x;
        private int y;
        private int width;
}