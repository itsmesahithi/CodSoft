import java.util.Scanner;
class ATM {
  private double balance;
  public ATM(double balance) {
    this.balance=balance;
  }
  public void display() {
    System.out.println("ATM Menu:");
    System.out.println("1.Check Balance");
    System.out.println("2.Deposit");
    System.out.println("3.Withdraw");
    System.out.println("4.Exit");
  }
  public void processTransaction(int choice) {
    Scanner scanner=new Scanner(System.in);
    double amount;
    switch (choice) {
      case 1:
        System.out.println("Balance: "+balance);
        break;
      case 2:
        System.out.println("Enter amount to deposit:");
        amount=scanner.nextDouble();
        balance+=amount;
        System.out.println("Deposit successful");
        break;
      case 3:
        System.out.println("Enter amount to withdraw:");
        amount=scanner.nextDouble();
        if (balance>=amount) {
          balance-=amount;
          System.out.println("Withdrawal successful");
        } else {
          System.out.println("Insufficient funds");
        }
        break;
      case 4:
        System.out.println("Exited!");
        break;
      default:
        System.out.println("Invalid choice");
    }
  }
  public static void main(String[] args) {
    ATM atm=new ATM(6000.0);
    while(true) {
      atm.display();
      Scanner scanner=new Scanner(System.in);
      int choice=scanner.nextInt();
      atm.processTransaction(choice);
      if (choice==4) {
        break;
      }
    }
  }
}
