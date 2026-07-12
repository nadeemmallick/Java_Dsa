import javax.swing.plaf.PanelUI;

public class RemoveOccurance {
    public static void main(String[] args) {
        String str = "Hello World";
        String remove = "l";
        System.out.println(removeOccurance(str, remove));
    }
    public static String removeOccurance(String str, String remove) {

        while(str.contains(remove)) {
             int index = str.indexOf(remove);

             str = str.substring(0, index) + str.substring(index + remove.length());
        }
        return str;
    }
}
