package oops.AbstractionEg;

public class InheritanceEg implements InterFace1camera,InterFace2Speaker{
    @Override
    public void Photo() {
        System.out.println("Camera is working");
    }
    @Override
    public void speaker() {
        System.out.println("Speaker is working");
    }
    public static void main(String[] args) {
        InheritanceEg obj = new InheritanceEg();
        obj.Photo();
        obj.speaker();
        System.out.println(price);
    }
}
