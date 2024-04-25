import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Galeria extends JFrame implements ActionListener{
    JButton btnatras, btnadelante;
    JPanel pb;
    PanelImagenes pi;
       
    public Galeria(){
        setTitle("Galeria Imagenes");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
       
        pi = new PanelImagenes();
        pi.setActualI(2);
               
        btnatras = new JButton("anterior");
        btnadelante = new JButton("siguiente");  
       
        btnatras.addActionListener(this);
        btnadelante.addActionListener(this);
       
        add(pi, BorderLayout.CENTER);
        pb = new JPanel();
        pb.add(btnatras);
        pb.add(btnadelante);
        add(pb, BorderLayout.SOUTH);
    }    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnadelante)){
            pi.setActualI((pi.getActualI()+1)%4);
        }
        if(e.getSource().equals(btnatras)){
            pi.setActualI((pi.getActualI()-1+4)%4);            
        }
        pi.repaint();
    }
   
    public static void main(String[] args) {
        Galeria gi = new Galeria();
        gi.setVisible(true);
    }
}
