import java.awt.*;
import java.awt.geom.*;
import java.text.NumberFormat.Style;
import java.util.*;
/**
    A car that can be moved around.
*/

public class CarShape implements MoveableShape{
    /**
        Constructs a car item.
        @param x the left of the bounding rectangle
        @param y the top of the bounding rectangle
        @param width the width of the bounding rectangle
    */


    public CarShape(int x, int y, int width,int size_width){
        this.x = x;
        this.y = y;
        this.width = width;
        this.size_width=size_width;

    }

    public void move(){
        x++;
    }

    public void draw(Graphics2D g2){

        Rectangle2D.Double body= new Rectangle2D.Double(x%size_width, y + width /6,width - 1, width / 6);
        Ellipse2D.Double frontTire= new Ellipse2D.Double((x + width / 6)%size_width, y + width / 3,width / 6, width / 6);
        
        Ellipse2D.Double rearTire= new Ellipse2D.Double((x + width * 2 / 3)%size_width, y + width / 3,width / 6, width / 6);

        // The bottom of the front windshield
        Point2D.Double r1= new Point2D.Double((x + width / 6)%size_width, y + width / 6);
        // The front of the roof
        Point2D.Double r2= new Point2D.Double((x + width / 3)%size_width, y);
        // The rear of the roof
        Point2D.Double r3= new Point2D.Double((x + width * 2 / 3)%size_width, y);
        // The bottom of the rear windshield
        Point2D.Double r4= new Point2D.Double((x + width * 5 / 6)%size_width, y + width / 6);
        Line2D.Double frontWindshield= new Line2D.Double(r1, r2);
        Line2D.Double roofTop= new Line2D.Double(r2, r3);
        Line2D.Double rearWindshield= new Line2D.Double(r3, r4);

        if (r1.x<r2.x){
            g2.draw(frontWindshield);
            // System.out.println(r1.x-r2.x);
        }   
       
        
        if (r2.x<r3.x){
            g2.draw(roofTop);
        }   
        if (r3.x<r4.x){
            g2.draw(rearWindshield);
        }   
       
        g2.draw(body);
        g2.draw(frontTire);
        g2.draw(rearTire);
        // // g2.draw(frontWindshield);
        // g2.draw(roofTop);
        // g2.draw(rearWindshield);

    }
        private int x;
        private int y;
        private int width;
        private int size_width;
}