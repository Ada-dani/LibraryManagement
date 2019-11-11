
package swing;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;

/**
 *
 * @author Nurul
 */
public class Button extends JButton {

    public Paint paint;

    public Shape shape;

    public Paint glass;

    public boolean over;

    public Button() {
        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);

        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                setOver(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setOver(false);
            }
        });
    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D gd = (Graphics2D) g.create();

        paint = new GradientPaint(0, 0, Color.blue
                , 0, getHeight(), Color.BLACK);
        shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), getHeight(), getHeight());
        if (isOver()) {
            glass = new GradientPaint(0, 0, new Color(1F, 1F, 1F, 0F), 0, getHeight(), new Color(1F, 1F, 1F, 0.5F));
        } else {
            glass = new GradientPaint(0, 0, new Color(1F, 1F, 1F, 0.5F), 0, getHeight(), new Color(1F, 1F, 1F, 0F));
        }

        gd.setPaint(paint);
        gd.fill(shape);

        super.paintComponent(g);

        gd.setPaint(glass);
        gd.fill(shape);

        gd.dispose();
    }
}
