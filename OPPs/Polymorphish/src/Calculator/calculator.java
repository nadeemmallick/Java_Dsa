package Calculator;

public class calculator {
    int add(int a ,int b){
        return a +b;
    }

    //Method Overloading/static polymorphism
    int add (int a,int b,int c){
        return a +b+c;
    }
    int add (int a,int b,int c,int d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        calculator obj = new calculator();
        System.out.println(obj.add(2,90));
        System.out.println(obj.add(50,20,30));
        System.out.println(obj.add(870,20,30,40));
    }
}
