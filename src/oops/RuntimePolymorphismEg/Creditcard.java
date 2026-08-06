package oops.RuntimePolymorphismEg;

public class Creditcard extends Payment {
    public void pay(int amount) {
        System.out.println("Payment of " + amount + " made using Credit Card.");
    }
}
