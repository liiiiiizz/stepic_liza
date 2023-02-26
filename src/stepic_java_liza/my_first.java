package stepic_java_liza;

import javax.swing.*;
import java.awt.*;

public class my_first extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FirstJLabel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);
        frame.setLocationRelativeTo(null); // чтобы  было по центру
        JLabel label = new JLabel("Моя первая надпись!");
        label.setFont(new Font("Calibri", Font.ITALIC, 50));
        frame.add(label);
        frame.setVisible(true);
    }
}