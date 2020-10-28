public class Tester {
  public static void main (String[] args) {
    BankAccount a = new BankAccount(3, "abc");
    System.out.println(a.getBalance());
    System.out.println(a.getAccountID());
  }
}
