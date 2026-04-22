public class dataType {
    static void main() {
        //numeric data type
        byte b = 127;
        long d = b; // implicit conversion
        System.out.println(d);
        System.out.println(b);

        long w = 987765333;
        int x = (int) w;
        System.out.println(x);

        short s = 32767;
        System.out.println(s);

        int i = 2147483647;
        System.out.println(i);

        long l = 9223372036854775807L;
        System.out.println(l);

        //Floating point data type
        float f = 3.14f;
        System.out.println(f);

        double r = 3.14666666;
        System.out.println(d);

        //boolean data type
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);

        char c = 'A';
        System.out.println(c);



    }
}
