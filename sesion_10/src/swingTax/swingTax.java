package swingTax;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class swingTax {
    private JButton calculate;
    private JTextField price;
    private JTextField tax;
    private JTextField total;
    private JPanel taxPanel;


    public swingTax() {
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double p = Double.parseDouble(price.getText());
                double t = Double.parseDouble(tax.getText());

                double result = p + (p / 100 * t);
                total.setText(Double.toString(result));
            }
        });
    }

    public static void main (String []args) {
        JFrame frame = new JFrame("Open Bootcamp");
        frame.setContentPane(new swingTax().taxPanel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
