import javax.swing.JPanel;
import java.awt.*;

public class Renderer extends JPanel {

    private static final long serialVersionUID = 1l;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Dinosaur.dinosaur.repaint(g);
    }

}
