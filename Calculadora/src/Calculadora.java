
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {
    JPanel pp, pb;
    JTextField p;
    JButton b[];
    String bt[] = new String[] {"7", "8", "9", "+",
                                "4", "5", "6", "-",
                                "1", "2", "3", "*",
                                "0", ".", "=", "/"};
    double num1 = 0, num2 = 0, resultado = 0;
    char operacion;

    public Calculadora() {
        setTitle("Calculadora");
        setSize(400, 170);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        setLocationRelativeTo(null);
        pp = new JPanel();
        p = new JTextField(20);
        pb = new JPanel(new GridLayout(4, 4));
        pp.add(p);
        add(pp, BorderLayout.NORTH);
        add(pb);
        b = new JButton[16];
        for (int i = 0; i < 16; i++) {
            b[i] = new JButton(bt[i]);
            b[i].addActionListener((ActionListener) this);
            pb.add(b[i]);
        }
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch (comando) {
            case "+" -> {
                num1 = Double.parseDouble(p.getText());
                p.setText("");
                operacion = '+';
            }
            case "=" -> {
                num2 = Double.parseDouble(p.getText());
                if (operacion == '+') {
                    resultado = num1 + num2;
                    p.setText(Double.toString(resultado));
                }
            }
            default -> p.setText(p.getText() + comando);
        }
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        c.setVisible(true);
    }
}