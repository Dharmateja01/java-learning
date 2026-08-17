package oops.AbstractionEg;

public class CreditInterFace implements PolyInterface{
    @Override
    public void pay(int amount) {
        System.out.println("Payment of " + amount + " made using Credit Card.");
    }
    public static void main(String[] args) {
        PolyInterface card= new CreditInterFace();
        card.pay(1000);
        PolyInterface upi= new UpipayInter();
        upi.pay(2000);
    }
}
