import java.util.Random;
import javax.swing.*;


/*
  Author: robinmck11
  date: 03/09/18

  Title: DanceThread
  Description: Animate a square

*/

public class DanceThread extends Thread
{
  private Square square;

  private boolean dead = false;

  private Random random = new Random();

  private int randStart = random.nextInt(100);

  private JPanel panel;


  public DanceThread(Square square, JPanel panel)
  {
    this.square = square;
    this.panel = panel;
  }

  public void run()
  {
    try{
      while(!dead){

        // Update Position

        if (randStart <= 50) {
          square.setposX(square.getposX() + 1);
          square.setposY(square.getposY() + 1);
        } else {
          square.setposX(square.getposX() - 1);
          square.setposY(square.getposY() - 1);
        }

        sleep(10);

        if (wallCollision()) {
          System.out.println("Collision Occured");
          dead = true;
        }


      }
    } catch(InterruptedException e){
      System.out.println("Interupted");
    }

  }

  public int getposX()
  {
    return square.getposX();
  }

  public int getposY()
  {
    return square.getposY();
  }

  public int getWidth(){
    return square.getWidth();
  }

  public int getHeight(){
    return square.getHeight();
  }


  // Detect wall collisions

  private boolean wallCollision(){
    // right
    if (square.getxRight() >= panel.getWidth()) {
      return true;
    }
    // left
    else if (square.getxLeft() <= 0) {
      return true;
    }
    // top
    else if (square.getyTop() <= 0){
      return true;
    }
    else if (square.getyBottom() >= panel.getHeight()){
      return true;
    }
    else{
      return false;
    }
  }

}
