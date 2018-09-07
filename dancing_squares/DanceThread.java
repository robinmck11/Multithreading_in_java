/*
  Author: robinmck11
  date: 03/09/18

  Title: DanceThread
  Description: Animate a square

*/

public class DanceThread extends Thread
{
  private Square square;

  public DanceThread(Square square)
  {
    this.square = square;
  }

  public void run()
  {

    try {

      // Do something here

      System.out.println("Hello World");

      } catch (InterruptedException e) {
         System.out.println("Thread Interrupted");
      }


  }

}
