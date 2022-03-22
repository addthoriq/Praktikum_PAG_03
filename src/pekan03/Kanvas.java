package pekan03;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Kanvas extends Canvas {
    public Kanvas(){
        setBounds(0, 101, 400, 399);
        setBackground(Color.red);
    }
    
    @Override
    public void paint(Graphics g){
        g.drawOval(40, 40, 100, 140);
        g.fillOval(50, 75, 30, 30);
        g.fillOval(90, 75, 30, 30);
        g.drawArc(60, 120, 60, 60, 20, 120);
        g.setColor(Color.yellow);
        g.drawString("Im sad", 40, 200);
    }
}
