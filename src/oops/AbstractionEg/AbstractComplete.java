package oops.AbstractionEg;

public class AbstractComplete extends AbstractIncomplete{
    @Override
    public void deposit() {
        System.out.println("Deposited: ");
    }
    @Override
    public void withdraw( ) {
        System.out.println("Withdrew: " );
    }
    public static void main(String[] args) {
        AbstractComplete ac = new AbstractComplete();
        ac.deposit();
        ac.withdraw();
    }
}
