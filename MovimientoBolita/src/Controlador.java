import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class Controlador extends JFrame {
    private JPanel pBolita, pControl;

    public Controlador() {
        setTitle("Mover");
        setSize(400, 408);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        setResizable(false);

        Bolita b = new Bolita();
        pBolita = new JPanel();
        pControl = new Control(b);
        pBolita.add(b);
        add(pBolita);
        add(pControl);
    }

    public static void main(String[] args) {
        Controlador c = new Controlador();
        c.setVisible(true);
    }
}
