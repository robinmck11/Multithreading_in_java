import java.awt.*;
import javax.swing.*;
import java.util.*;


public class SquarePaint extends JPanel {

  ArrayList<DanceThread> danceThreads = new ArrayList<DanceThread>();

  public void paintComponent(Graphics g) {

    // paint all squares

    for (int i = 0; i < danceThreads.size(); i++ ) {

      g.setColor(Color.red);
      g.fillRect(danceThreads.get(i).getposX(), danceThreads.get(i).getposY(),
      danceThreads.get(i).getWidth(), danceThreads.get(i).getHeight());
      repaint();
    }
  }

  public void add(int x, int y, int width, int height){


    Square square = new Square();

    square.setWidth(width);
    square.setHeight(height);

    square.setposX(x);
    square.setposY(y);

    // Thread that will update the position
    DanceThread thread = new DanceThread(square, this);

    //Start and add thread to arraylist

    thread.start();

    danceThreads.add(thread);
  }




}
