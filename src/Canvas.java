import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        Color R = new Color(214, 216, 16);
        g.setColor(R);
        g.fillPolygon(new int [] {100, 250, 400}, new int [] {300, 20, 300}, 3);

        Color S = new Color(172, 35, 216);
        g.setColor(S);
        g.fillRect(500, 40,250, 250);


    }
}
