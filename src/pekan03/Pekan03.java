package pekan03;

import java.awt.*;
import javax.swing.*;

public class Pekan03 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(0,0,500,100);
        panel.setBackground(Color.magenta);
        panel.setLayout(null);
        
        JLabel label = new JLabel();
        label.setText("Kang Thoriq");
        Font fontku = new Font("Arial", Font.BOLD, 18);
        label.setFont(fontku);
        label.setBounds(0, 80, 150, 20);
        panel.add(label);
        
        Kanvas k = new Kanvas();
        
        frame.add(k);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
