package oops;
public class BankAccountCreate {
    int id;
    String name;
    String Address;
    String PanNumber;
    public BankAccountCreate(int id, String name, String Address, String PanNumber) {
        this.id = id;
        this.name = name;
        this.Address = Address;
        this.PanNumber = PanNumber;
    }
    public static void main(String[] args) {
        BankAccountCreate account1 = new BankAccountCreate(1, "Teja", "Hyderabad", "ABCDE1234F");
        BankAccountCreate account2 = new BankAccountCreate(2, "Ravi", "Bangalore", "DANB5678G");
        System.out.println(account1.id);
        System.out.println(account2.name);
    }
}
