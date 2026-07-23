package oops;

public class ConstructorOverloading {
    int id;
    String name;
    int age;

    public ConstructorOverloading() {
        System.out.println("Default constructor");
    }
    public ConstructorOverloading(int id) {
        this.id = id;
        System.out.println("Constructor with id: " + id);
    }
    public ConstructorOverloading(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Constructor with id: " + id + " and name: " + name);
    }
    public ConstructorOverloading(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("Constructor with id: " + id + ", name: " + name + " and age: " + age);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(1);
        ConstructorOverloading obj3 = new ConstructorOverloading(2, "teja");
        ConstructorOverloading obj4 = new ConstructorOverloading(3, "Jane", 21);

    }
}
