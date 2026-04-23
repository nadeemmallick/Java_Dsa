public class NestedIf {
    public static void main(String[] args) {
        int age = 18;
        char gender = 'M';

        if (gender == 'm'){ // true hua to ye block execute ho ga
            System.out.println("You are a man");
            if(age > 18){
                System.out.println("You can vote");
            }else{
                System.out.println("You can't vote");
            }
        }else { //  false hua to ye block execute ho ga
            System.out.println("You are a woman");
            if (age > 18){
                System.out.println("You can vote");
            }else {
                System.out.println("You can't vote");
            }
        }
    }
}
