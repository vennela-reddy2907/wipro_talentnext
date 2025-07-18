
interface Vehicle1 {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

class Car implements Vehicle1, FourWheeler {
    @Override
    public void message() {
        // Resolving ambiguity using interfaceName.super.method()
        Vehicle1.super.message();
        FourWheeler.super.message();
        System.out.println("Inside Car");
    }}
class Vehicle{
    public static void main(String[] args) {
        Car car = new Car();
        car.message();
    }
}
