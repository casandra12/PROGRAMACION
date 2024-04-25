import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Control extends JPanel implements ActionListener {
    private JButton btnIzquierda, btnDerecha, btnArriba, btnAbajo;
    private Bolita bolita;

    public Control(Bolita b) {
        setLayout(new BorderLayout());
        btnIzquierda = new JButton("Izquierda");
        btnDerecha = new JButton("Derecha");
        btnArriba = new JButton("Arriba");
        btnAbajo = new JButton("Abajo");

        btnIzquierda.addActionListener(this);
        btnDerecha.addActionListener(this);
        btnArriba.addActionListener(this);
        btnAbajo.addActionListener(this);

        bolita = b;

        add(btnIzquierda, BorderLayout.WEST);
        add(btnDerecha, BorderLayout.EAST);
        add(btnArriba, BorderLayout.NORTH);
        add(btnAbajo, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnIzquierda)) {
            bolita.setMoverX(bolita.getMoverX() - 5);
        } else if (e.getSource().equals(btnDerecha)) {
            bolita.setMoverX(bolita.getMoverX() + 5);
        } else if (e.getSource().equals(btnArriba)) {
            bolita.setMoverY(bolita.getMoverY() - 5);
        } else if (e.getSource().equals(btnAbajo)) {
            bolita.setMoverY(bolita.getMoverY() + 5);
        }
        bolita.repaint();
    }
}
