package lesson4.Task2;

public class Balance {
    private int balance = 20;

    private void showBalance(){
        System.out.println(this.balance);
    }

    private void increaseBalance(int incr){
        if(incr < 0){
            System.err.println("Error");
            return;
        }
        this.balance += incr;
        System.out.println("Balance " + this.balance);
    }

    private void reduceBalance(int decr){
        if(decr < 0 || decr > this.balance){
            System.err.println("Error");
            return;
        }
        this.balance -= decr;
        System.out.println("Balance " + this.balance);
    }

    public static void main(String[] args) {
        Balance balance = new Balance();
        balance.showBalance();
        balance.increaseBalance(4);
        balance.reduceBalance(30);
    }
}
