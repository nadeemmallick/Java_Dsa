package Transport;

public class Bike extends Vehicle{

    public String HandleBarSize;

    public String SuspensionType;

    public Bike(String name, String model, int noOfTyres, String handleBarSize, String suspensionType){
        super(name,model,noOfTyres);
        this.HandleBarSize = handleBarSize;
        this.SuspensionType = suspensionType;
    }

    public void Wheelie(){
        System.out.println("Wheelie is started in "+name);
    }


}
