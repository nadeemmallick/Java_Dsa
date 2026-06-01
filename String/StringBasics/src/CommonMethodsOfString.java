public class CommonMethodsOfString {
    static void main(){
        String str = "Nadeem";
    System.out.println(str.length());
    System.out.println(str.charAt(1));
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());

    //empty -> length = 0
        // blank -> empty ho ya srif blank ho

        String name = " ";
        System.out.println(name.length());
        System.out.println(name.isEmpty());
        System.out.println(name.isBlank());

    }
}
