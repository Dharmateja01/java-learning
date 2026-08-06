package oops.RuntimePolymorphismEg;

public class Cashpay extends Payment {
    public void pay(int amount) {
        System.out.println("Cash payment of amount: " + amount);
    }
}
