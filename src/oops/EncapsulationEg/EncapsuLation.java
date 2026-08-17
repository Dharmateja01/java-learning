package oops.EncapsulationEg;

public class EncapsuLation {
    private int id;
    private String name;
    private String mail;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Mail: " + mail);
    }

    public static void main(String[] args) {
        EncapsuLation obj = new EncapsuLation();
        obj.setId(1);
        obj.setName("Teja");
        obj.setMail("teja@gmail.com");
        obj.display();

    }
}

