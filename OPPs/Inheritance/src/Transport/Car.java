package Transport;

public class Car extends Vehicle{

    public int noOfDoors;

    public String color;


    public Car(String name, String model, int noOfTyres, int noOfDoors, String color){
        super(name,model,noOfTyres);
        this.noOfDoors = noOfDoors;
        this.color = color;
    }

    public  void Ac(){
        System.out.println("Ac is started in "+name);

    }

}
