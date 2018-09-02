/*
  Author: robinmck11
  date: 02/09/18

  Title: Multithreading1
  Description: A multithreading example

*/

public class Multithreading1
{
    public static void main(String args[])
    {
        // Create ten bankaccount threads and start

        for (int i = 0; i < 10; i++)
        {
          new BankAccountThread(new BankAccount("Bank Account " + i)).start();
        }

    }

}
