import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Capitales extends JFrame implements ActionListener {
    HashMap<String, String> edocap;
    JComboBox<String> estados;
    JLabel cap;
    JPanel panel;

    public Capitales() {
        setTitle("Estados y Capitales");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        edocap = new HashMap<>();
        edocap.put("Sonora", "Hermosillo");
        edocap.put("Ciudad de Mexico", "CDMX");
        edocap.put("Edo de Mexico", "Toluca");
        edocap.put("Guadalajara", "Jalisco");
        edocap.put("Monterrey", "Nuevo Leon");

        estados = new JComboBox<>();
        for (String e : edocap.keySet()) {
            estados.addItem(e);
        }

        estados.addActionListener(this);

        cap = new JLabel();

        panel = new JPanel(new BorderLayout());
        panel.add(estados, BorderLayout.NORTH);
        panel.add(cap, BorderLayout.SOUTH);
        add(panel);
    }

    public static void main(String[] args) {
        Capitales c = new Capitales();
        c.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String estadoSelec = (String) estados.getSelectedItem();
        String capitalSelec = edocap.get(estadoSelec);
        cap.setText(capitalSelec);
    }
}
