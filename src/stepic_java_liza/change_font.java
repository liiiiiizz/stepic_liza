package stepic_java_liza;

import javax.swing.*;
import java.awt.*;

public class change_font {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ChangeFont");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        JLabel label = new JLabel("Меняй мой шрифт!");
        label.setFont(new Font("Calibri", Font.ITALIC, 50));
        JSlider slider = new JSlider(5, 100, 50);//реализация слайдера
        slider.setMajorTickSpacing(5);//устанавливает интервал для основных делений
        slider.setPaintTicks(true);//логическое значение определяет, нарисованы ли галочки на ползунке или нет
        slider.addChangeListener(e -> label.setFont(new Font("Calibri", Font.ITALIC, slider.getValue())));//Добавляет ChangeListener к ползунку.
        frame.add(label);
        frame.add(slider, BorderLayout.SOUTH); //BorderLayout.SOUTH - чтобы ползунок был снизу
        frame.setVisible(true);
    }
}
