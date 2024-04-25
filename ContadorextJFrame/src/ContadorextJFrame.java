import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ContadorextJFrame implements Runnable {
    JLabel num;
    int i = 0;
    boolean inf = true;
    JFrame interfaz = new JFrame("Thread v1.0");

    public ContadorextJFrame() {
        interfaz.setTitle("Contador");
        interfaz.setSize(300, 200);
        interfaz.setLocationRelativeTo(null);
        interfaz.setLayout(new FlowLayout()); // Usando el constructor predeterminado
        num = new JLabel("0");
        interfaz.add(num);
        interfaz.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
    }

    public void run() {
        while (inf) {
            i++;
            num.setText(i + "");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Detenido");
            }
        }
    }

    public static void main(String[] args) {
        ContadorextJFrame c = new ContadorextJFrame();
        c.interfaz.setVisible(true);
        Thread t = new Thread(c);
        t.start();
    }
}
