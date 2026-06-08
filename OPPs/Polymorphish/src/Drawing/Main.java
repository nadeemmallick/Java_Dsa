package Drawing;

import java.awt.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        circle c = new circle();
        c.draw();

        Sphear s = new Sphear();
        s.draw();

        Rectangle r = new Rectangle();
        r.draw();
    }
}
