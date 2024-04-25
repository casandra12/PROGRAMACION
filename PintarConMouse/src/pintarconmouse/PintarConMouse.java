import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PintarConMouse extends JFrame{
    JComboBox<String> colorComboBox;
    DrawingPanel drawingPanel;
    Container contentPane;

    public PintarConMouse(){
        setTitle("Paint");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setResizable(false);
       
        colorComboBox = new JComboBox<>(new String[]{"Rojo","Verde","Azul"});
        drawingPanel = new DrawingPanel(colorComboBox);
       
        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(colorComboBox, BorderLayout.NORTH);
        contentPane.add(drawingPanel);
    }   //fin contructor
    public static void main(String[] args) {
        PintarConMouse pcm = new PintarConMouse();
        pcm.setVisible(true);
    }
}

class DrawingPanel extends JPanel{
    JComboBox<String> colorComboBox;
    int lastX, lastY;
    Color currentColor;

    public DrawingPanel(){}
   
    public DrawingPanel(JComboBox colorComboBox){
    this.colorComboBox = colorComboBox;
   
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e){
                cambiarColor();
                lastX =e.getX();
                lastY =e.getY();
            }
        });
   
 
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e){
                Graphics g = getGraphics();
                g.setColor(currentColor);
                int x = e.getX();
                int y = e.getY();
                g.drawLine(lastX, lastY, x, y);
                lastX=x;
                lastY=y;
           }
        });        
    }
   
    public void cambiarColor(){
        String selectedColor = (String) colorComboBox.getSelectedItem();
       
        switch(selectedColor){
            case "Rojo": currentColor=Color.RED;break;                
            case "Verde": currentColor=Color.GREEN;break;
            case "Azul": currentColor=Color.BLUE;break;
        }
    }
}