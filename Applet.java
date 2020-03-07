import java.awt.*;
import java.applet.*;

public class Applet {

    public class HelloWorldApplet extends Applet {
        public void paint(Graphics g) {
            g.drawString("Hello World!", 20, 20);
        }
    }
}

