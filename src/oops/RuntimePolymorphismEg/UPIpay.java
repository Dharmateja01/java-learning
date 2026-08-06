package oops.RuntimePolymorphismEg;

public class UPIpay extends Payment {
    public void pay(int amount) {
        System.out.println("Payment of " + amount + " made using UPI.");
    }
}
