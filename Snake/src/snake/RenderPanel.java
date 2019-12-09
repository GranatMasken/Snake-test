package snake;

import javax.swing.*;
import java.awt.*;
@SuppressWarnings("serial")
public class RenderPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        g.fillRect(0,0,800,700);
        super.paintComponent(g);
    }
}
