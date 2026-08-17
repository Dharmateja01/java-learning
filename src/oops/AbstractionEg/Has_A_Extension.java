package oops.AbstractionEg;

public class Has_A_Extension {
    HAS_A_RelationShip obj = new HAS_A_RelationShip();
    public void BMV() {
        obj.start();
        System.out.println("BMW is Moving");
    }
    public static void main(String[] args) {
        Has_A_Extension obj1 = new Has_A_Extension();
        obj1.BMV();
    }
}

