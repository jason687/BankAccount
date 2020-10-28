public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount (int id, String pass) {
    accountID = id;
    password = pass;
    balance = 0;
  }

  public double getBalance () {
    return balance;
  }

  public int getAccountID () {
    return accountID;
  }
}
