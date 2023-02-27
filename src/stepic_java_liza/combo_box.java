package stepic_java_liza;

import javax.swing.*;
import java.awt.*;

public class combo_box {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ChangeFont");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        JButton button = new JButton("Ответить");//создаем кнопку
        String[] items = {
                "красный",
                "синий",
                "желтый"
        };
        JComboBox comboBox = new JComboBox(items);
        comboBox.setMaximumSize(new Dimension(50,30));
        frame.add(comboBox);
        frame.add(Box.createVerticalStrut(40));
        frame.add(button);
        frame.setVisible(true);
    }


}

