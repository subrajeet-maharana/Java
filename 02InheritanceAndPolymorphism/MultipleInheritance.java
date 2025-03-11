interface PaymentGateway {
  void processPayment(double amount);
}

class PayPal {
  double balance;

  PayPal(double balance) {
    this.balance = balance;
  }

  void processPayment(double amount) {
    balance -= amount;
    System.out.println("Paypal transcation completed with rem amount: " + balance);
  }
}

class CreditCard {
  double credits;

  CreditCard(double credits) {
    this.credits = credits;
  }

  void processPayment(double amount) {
    credits += amount;
    System.out.println("Credit Card transcation completed with current credits: " + credits);
  }
}


public class MultipleInheritance {
  public static void main(String[] args) {
    PayPal p1 = new PayPal(5000);
    p1.processPayment(500);
    CreditCard c1 = new CreditCard(2000);
    c1.processPayment(500);
  }
}
