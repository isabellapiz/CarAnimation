package P10_22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class CarFrame extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;

    private CarComponent scene;

    // listener for the car to move
    class TimerListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            scene.moveCarBy(1,1);
        }
    }

    // adds car component to the frame and moves it
    public CarFrame()
    {
        scene = new CarComponent();
        add(scene);

        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        ActionListener listener = new TimerListener();

        final int DELAY = 1000;
        Timer t = new Timer(DELAY, listener);
        t.start();
    }
}
