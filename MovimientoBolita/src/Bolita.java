import java.awt.Canvas;
import java.awt.Graphics;

public class Bolita extends Canvas {
    private int moverX, moverY;
    private final int areaAncho = 370; // Ancho máximo del área de movimiento
    private final int areaAlto = 160;  // Alto máximo del área de movimiento

    public Bolita() {
        this.setSize(400, 200);
        moverX = 185; // Posición inicial en el centro horizontal
        moverY = 85;  // Posición inicial en el centro vertical
    }

    public int getMoverX() {
        return moverX;
    }

    public void setMoverX(int moverX) {
        // Verificar si la nueva posición está dentro del área de movimiento
        if (moverX >= 0 && moverX <= areaAncho) {
            this.moverX = moverX;
        }
    }

    public int getMoverY() {
        return moverY;
    }

    public void setMoverY(int moverY) {
        // Verificar si la nueva posición está dentro del área de movimiento
        if (moverY >= 0 && moverY <= areaAlto) {
            this.moverY = moverY;
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(moverX, moverY, 30, 30);
    }
}
