public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int id, String pass) {
    accountID = id;
    password = pass;
    balance = 0;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public String getPassword() {
    return password;
  }

  public String toString() {
    return "#" + accountID + "\t$" + balance;
  }

  public void setPassword (String newPass) {
    password = newPass;
  }

  public boolean deposit (double amount) {
    if (amount >= 0) {
      balance = balance + amount;
      return true;
    } else {
      return false;
    }
  }

  public boolean withdraw (double amount) {
    if (amount >= 0 && amount <= balance) {
      balance = balance - amount;
      return true;
    } else {
      return false;
    }
  }

  private boolean authenticate (String password) {
    return password.equals(this.password);
  }

  public boolean transferTo(BankAccount other, double amount, String password) {
    if (authenticate(password)) {
      if (withdraw(amount)) {
        other.deposit(amount);
        return true;
      }
    }
    return false;
  }
}
