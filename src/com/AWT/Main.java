package com.AWT;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Main {

    public static void main(String[] args) {
        JFrame jFrame = getFrame(); // моя форма
        jFrame.add(new MyComponent()); // мои компоненты

    }

    static  class MyComponent extends JComponent{
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 =(Graphics2D)g; // графика

            //------------------------------------------------------------------------Rendering----------------------------------------

            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // прямой рендоринг (отл)
            Ellipse2D ellipse2D = new Ellipse2D.Double(50,50,100,100);
            g2.draw(ellipse2D);

            RenderingHints renderingHints = new RenderingHints(null);
            renderingHints.put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF); //через переменную (плохое)
            g2.setRenderingHints(renderingHints);
            Ellipse2D ellipse2D2 = new Ellipse2D.Double(150,50,100,100);
            g2.draw(ellipse2D2);
        }
    }

    private static JFrame getFrame() {
        JFrame jFrame = new JFrame(); // создать
        jFrame.setVisible(true); // видимость
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // закрытие
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension =toolkit.getScreenSize(); // выясняем центр экрана
        int widthFrame = 450, heightFrame = 350;
        jFrame.setBounds(dimension.width/2-widthFrame, dimension.height/2-heightFrame, widthFrame, heightFrame);
        return jFrame;
    }
}
