/*
  Author: robinmck11
  date: 03/09/18

  Title: DanceThread
  Description: Animate a square

*/

public class DanceThread extends Thread
{
  private Square square;

  public BankAccountThread(Square square)
  {
    this.square = square;
  }

  public void run()
  {

    try {

      // Do something here

      } catch (InterruptedException e) {
         System.out.println("Thread Interrupted");
      }


  }

}
