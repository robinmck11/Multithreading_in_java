/*
  Author: robinmck11
  date: 02/09/18

  Title: BankAccountThread
  Description: Create a bankaccount and deposit £10 ten times.

*/

public class BankAccountThread extends Thread
{

  private BankAccount bankAccount;

  public BankAccountThread(BankAccount bankAccount)
  {
    this.bankAccount = bankAccount;
  }

  public void run()
  {

    // add £10 balance 10 times

    try {

      for (int i = 0; i < 10; i++)
      {
        bankAccount.setBalance(bankAccount.getBalance() + 10);
        sleep(1000);
        System.out.println(bankAccount.toString());
      }

      } catch (InterruptedException e) {
         System.out.println("Thread Interrupted");
      }


  }

}
