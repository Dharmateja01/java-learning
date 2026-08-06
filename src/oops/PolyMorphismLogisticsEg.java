package oops;

public class PolyMorphismLogisticsEg {
    public void Delivery(String type,int items) {
        System.out.println("Delivery type: " + type +" transport"+ ", Items count: " + items);
    }
    public void Delivery(String type,double liters) {
        System.out.println("Delivery type: " + type +" transport" + ", Liters: " + liters);
    }

    public static void main(String[] args) {
        PolyMorphismLogisticsEg logistics = new PolyMorphismLogisticsEg();
        logistics.Delivery("Road", 5);
        logistics.Delivery("water", 10.5);
    }
}
