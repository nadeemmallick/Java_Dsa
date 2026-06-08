package Transport;

public class Vehicle {

    public String name;

    public String model;

    public int noOfTyres;


    public Vehicle(){
        System.out.println("Vehicle constructor");
        this.name = "";
        this.model ="";
        this.noOfTyres = -1;
    }

    public Vehicle(String name, String model, int noOfTyres){
//        System.out.println("Vehicle parameterized constructor");
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }


    void StartEngine(){
        System.out.printf("Engine started od %s : %s\n",name,model);
    }

    void StopEngine(){
        System.out.printf("Engine stop od %s : %s\n",name,model);
    }


}
