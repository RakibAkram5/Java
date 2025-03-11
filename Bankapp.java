class bankAccount{
    int accountNumber;
    String accountHolderName;
    double balance;
    void deposit(double amount){
        balance=balance+amount;
        System.out.println("Deposited: "+amount);
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Withdrawn: "+amount);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    void displayDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolderName);
        System.out.println("Balance: "+balance);
    }
}
public class Bankapp{
    public static void main(String[] args) {
        bankAccount account=new bankAccount();
        account.accountNumber=12345;
        account.accountHolderName="John Doe";
        account.balance=50000.32;
        account.deposit(2000);
        account.withdraw(1000);
        account.displayDetails();
    }
}