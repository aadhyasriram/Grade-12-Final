import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;
@SuppressWarnings("serial")
abstract class Button extends JPanel implements MouseListener, MouseMotionListener{
    Rectangle Transition;
    final int nextScreen;
    int x,y,width,length;
    public Button (int x, int y, int width, int length, int nextScreen) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.length = length;
        Transition = new Rectangle(x,y,width,length);
        this.nextScreen = nextScreen;
    }
    @Override
    public void mouseClicked(MouseEvent e){
        Point p = e.getPoint();
        if (Transition.contains(p)){
            Main.screen = nextScreen;
            repaint();
        }
    }
    @Override
    public void mouseMoved(MouseEvent e){
        Point p = e.getPoint();
        if (Transition.contains(p)){
            Transition = new Rectangle(x - 20, y - 20, width + 20, length + 20);
            repaint();
        }
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }

}