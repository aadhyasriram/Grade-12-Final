import javax.swing.*;
public class Main extends JFrame{
    static public Integer screen;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Physics Sim");
        Main panel = new Main();

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        panel.setFocusable(true);
        panel.requestFocusInWindow();
        // Instantiate screen objects
        Portal portal = new Portal("gee",1);
    }
}