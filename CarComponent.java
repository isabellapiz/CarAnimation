package P10_22;

import javax.swing.JComponent;
import java.awt.Graphics2D;
import java.awt.Graphics;

public class CarComponent extends JComponent
{
    private Car car;

    // Constructor creating a car object
    public CarComponent()
    {
        car = new Car(0, 0);
    }
    // Paint component method drawing the car object
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        car.draw(g2);
    }

    // This method moves the car's location on the screen
    public void moveCarBy(int x, int y)
    {
        car.translate(x,y);
        repaint();
    }
}
