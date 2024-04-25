import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;

public class Edad extends JFrame implements ActionListener {
    JTextField txtEdad;
    JPanel panel01;
    JButton b1 = null;

    public Edad() {
        setSize(300, 90); 
        setTitle("Edad"); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txtEdad = new JTextField(20);
        panel01 = new JPanel(new GridLayout(2, 1));
        b1 = new JButton("Dame tu edad");
        b1.addActionListener(this);
        panel01.add(txtEdad);
        panel01.add(b1);
        add(panel01);
    }

    public void actionPerformed(ActionEvent e) {
        int edad = Integer.parseInt(txtEdad.getText());
        String res = null;
        if (edad >= 18) { 
            res = "Eres mayor de edad";
        } else {
            res = "Eres menor de edad";
        }

        JOptionPane.showMessageDialog(null, res); 
    }
}
