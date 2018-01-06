import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {
    String msg;

    public void init() {
        msg = "Hello World, I'm alive!";
        repaint();
    }

    public void start() {
        msg = "Now I'm starting up...";
        repaint();
    }

    public void stop() {
        msg = "Oh, now I'm being stopped...";
        repaint();
    }

    public void destroy() {
        msg = "Goodbye, cruel world";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 5, 15);
    }
}
