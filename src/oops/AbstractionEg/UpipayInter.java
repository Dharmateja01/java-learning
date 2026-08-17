package oops.AbstractionEg;

public class UpipayInter implements PolyInterface {
    @Override
    public void pay(int amount) {
        System.out.println("Payment of " + amount + " made using UPI.");
    }
}
