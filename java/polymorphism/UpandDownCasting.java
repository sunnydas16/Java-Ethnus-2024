class Vehicle{
    void start(){
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car is Starting");
    }
    void drive(){
        System.out.println("Cra is driven");
    }
}
public class UpandDownCasting {
    public static void main(String[] args){
        Vehicle ve = new Car(); //upcasting -> parent object creation
        ve.start();
        Car cr = (Car) ve;     //typecast 
        cr.start();
        cr.drive();
    }
}