class insufficienntFundsException extends Exception{
    public insufficienntFundsException(String message){
        super(message);
    }
}
class BankAccount{
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    public void withdraw(double amount) throws insufficienntFundsException{
    if(amount > balance){
        throw new insufficienntFundsException("Insufficient fund in the Account");
        }
        balance -= amount;
        System.out.println("Successfuully withdraw: " + amount );
    }
}
public class Main{
  public static void main(String[] args){
    BankAccount ac = new BankAccount(1000);

    try{
        ac.withdraw(10030);
    }catch(insufficienntFundsException e){
        System.out.println("Transaction failed: " + e.getMessage());
    }
  }
}
