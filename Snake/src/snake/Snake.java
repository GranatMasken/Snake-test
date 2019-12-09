package snake;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Snake {

    public JFrame jframe;

    public static Snake snake;

    public Toolkit toolkit;

    public RenderPanel panel;

    public Snake(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jframe = new JFrame("Snake");
        jframe.setVisible(true);
        jframe.setSize(800,700);
        jframe.setLocation(960,540);
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        panel = new RenderPanel();
        jframe.add(panel);
        jframe.pack();
    }

    public static void main(String[] args){
        snake = new Snake();
    }

}
