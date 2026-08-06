package oops.RuntimePolymorphismEg;

public class Payment {
    public void pay(int amount) {
        System.out.println("payment has completed for amount: " + amount);
    }
    public static void main(String[] args) {
        Payment card= new Creditcard();
        card.pay(1000);
        Payment upi= new UPIpay();
        upi.pay(2000);
        Payment cash= new Cashpay();
        cash.pay(3000);
    }
}
