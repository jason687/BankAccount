public class Tester {
  public static void main (String[] args) {
    BankAccount a = new BankAccount(3, "abc");
    System.out.println(a.getBalance()); //should print 0.0
    System.out.println(a.getAccountID()); //should print 3
    System.out.println(a.toString()); //should print "3  0.0"
    System.out.println(a.getPassword()); //should print "abc"
    a.setPassword("xyz");
    System.out.println(a.getPassword()); //should print "xyz"
//  ---
    System.out.println(a.deposit(30)); //should print true
    System.out.println(a.getBalance()); //should print 30.0
    System.out.println(a.deposit(0)); //should print true
    System.out.println(a.getBalance()); //should print 30.0
    System.out.println(a.deposit(-9)); //should print false
    System.out.println(a.getBalance()); //should print 30.0
//  ---
    System.out.println(a.withdraw(10)); //should print true
    System.out.println(a.getBalance()); //should print 20.0
    System.out.println(a.withdraw(0)); //should print true
    System.out.println(a.getBalance()); //should print 20.0
    System.out.println(a.deposit(-9)); //should print false
    System.out.println(a.getBalance()); //should print 20.0
//  ---
    System.out.println(a.toString()); //should print "3 20.0"
  }
}
