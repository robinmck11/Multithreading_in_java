/**
  author: robinmck11
  date: 02/09/18

  Title: BankAccount
  Description: A bank account with an account name and balance with
  functionality to set and return the account's balance.


*/

import java.util.Random;

public class BankAccount
{
  private int balance;
  private String name;

  /**
    Create a bank account with a random bank balance
  */

  public BankAccount(String name)
  {
    Random rand = new Random();
    balance = rand.nextInt(100) + 1;

    this.name = name;
  }

  /**
    Create a bank account with a given balance and back account name
  */

  public BankAccount(int balance, String name)
  {
    this.balance = balance;
    this.name = name;
  }

  /**
    Set the account balance
    @param balance the account balance
  */

  public void setBalance(int balance)
  {
    this.balance = balance;
  }

  /**
    Get the account balance
    @return balance The account balance;
  */

  public int getBalance()
  {
    return balance;
  }

  /**
    Get the bank account name
    @return name the bank account name
  */

  public String getName()
  {
    return name;
  }

  /**
    Print the name and bank balance
  */

  public String toString()
  {
    return "Hello from " + getName() + ". My balance is £" + getBalance();
  }
}
