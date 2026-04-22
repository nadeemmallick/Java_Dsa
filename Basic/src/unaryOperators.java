public class unaryOperators {
    public static void main(String[] args) {

        int activeUsers = 100;

        int prefix = ++activeUsers;
        //phele increment kre gai
        //frr use  krte hai
        int postfix = activeUsers++;
        //phele

        System.out.println(prefix);
        System.out.println(postfix);
        System.out.println(activeUsers);
    }
}
