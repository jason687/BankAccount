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

    BankAccount b1 = new BankAccount(1000001, "abc123");
    BankAccount b2 = new BankAccount(1000231, "abcasdg23");

    // System.out.println("Account b1:");
    b1.deposit(3000.0);
    b2.deposit(1234.0);
    // System.out.println(b1);
    // System.out.println("Account b2:");
    // System.out.println(b2);
    // System.out.println();
    System.out.println();
    System.out.println(b1.getBalance());
    System.out.println(b2.getBalance());
    System.out.println(b1.transferTo(b2, 10000, "abc123"));
    System.out.println(b1.getBalance());
    System.out.println(b2.getBalance());
    System.out.println();
//  ---
    System.out.println(b1.getBalance());
    System.out.println(b2.getBalance());
    System.out.println(b1.transferTo(b2, 100, "abc1238"));
    System.out.println(b1.getBalance());
    System.out.println(b2.getBalance());
    System.out.println();
//  ---
    System.out.println(b1.getBalance());
    System.out.println(b2.getBalance());
    System.out.println(b1.transferTo(b2, 100, "abc123"));
    System.out.println(b1.getBalance());
    System.out.println(b2.getBalance());


      // double cashAmount = 300.0;
      // while(cashAmount < 3000){
      //   System.out.println("Attempt to move $"+cashAmount+" from the b1 to b2 account:");
      //   if(b1.withdraw(cashAmount) ){
      //     if(b2.deposit(cashAmount)){
      //       System.out.println(b1);
      //       System.out.println(b2);
      //       System.out.println();
      //
      //     } else {
      //       //This should never happen.
      //       //Error message provided to make sure that is the case
      //       System.out.println("CRITICAL ERROR! $"+cashAmount +
      //                          " withdrawn from Account #" +  b1.getAccountID() +
      //                          "Failed to add to Account #"+b2.getAccountID());
      //     }
      //   } else {
      //     System.out.println("Transfer Failed");
      //   }
      //
      //   cashAmount *= 2;
      // }

  }
}
