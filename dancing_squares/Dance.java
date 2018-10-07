import javax.swing.*;
import java.awt.Dimension;
import java.util.Random;

public class Dance
{
    public static void main(String args[])
    {
      JFrame frame = new DanceFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      SquarePaint panel = new SquarePaint();

      panel.setPreferredSize(new Dimension(frame.getWidth(),frame.getHeight()));

      frame.add(panel);

      frame.pack();

      addAnObject(frame, panel);
      addAnObject(frame, panel);
      addAnObject(frame, panel);

      frame.setVisible(true);

    }

    public static void addAnObject(JFrame f, SquarePaint p){

      // Add an object to the frame

      Random random = new Random();

      int width = 100;
      int height = 100;

      int x = random.nextInt(f.getWidth() - width) + 1;
      int y = random.nextInt(f.getHeight() - height) + 1;

      p.add(x, y,width, height);
    }
}
