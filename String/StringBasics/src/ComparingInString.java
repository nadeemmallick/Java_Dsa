public class ComparingInString {
    static void main(){
        String name = "Nadeem";
        String name2 = "Nadeem";

        if(name == name2){ // == only compare the reference, not the value or content
            System.out.println("same");
        }else{
            System.out.println("not same");
        }

        String  name3 = "Mallick";
        String name4 = "Malick";

        if(name3.equals(name4)){ // .equal() equals compare the actual value or content and it is case sensitive
            System.out.println("same");
        }else{
            System.out.println("not same");
        }

        String name5 = "DON";
        String name6 ="don";

        if(name5.equalsIgnoreCase(name6)){ // .equalsIgnoreCase() is case insensitive and it compare the actual value without considering the case
            System.out.println("same");
        }else {
            System.out.println("not same");
        }


    }
}
