public class BasicString {
    static void main(){
        //There ar two methods to create string first one using constructor and second using string literal

        String firstName = "Nadeem"; //string literal

        String lastName = new String("Mallick");//constructor

        System.out.println(firstName + " " + lastName);

        System.out.println(firstName.length());// its gives the length of the string
        System.out.println(firstName.charAt(0));// its gives the index value of the string
    }
}
