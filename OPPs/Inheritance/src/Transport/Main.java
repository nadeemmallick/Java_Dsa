package Transport;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW","X5",4,4,"Red");
        car.StartEngine();
        car.Ac();
        car.StopEngine();

        Bike bike = new Bike("HondaShine","250cc",2,"Usizebar","modern");
        bike.StartEngine();
        bike.Wheelie();
        bike.StopEngine();
    }
}
