import java.awt.*;
public class Portal {
    public final String name;
    public final int age;
    static Image portal;
    static Rectangle GameStageButton;

    public Portal(String name, int age) {
        this.name = name;
        this.age = age;
        portal = Toolkit.getDefaultToolkit().getImage("start.png");
    }
    
}