import javax.swing.Timer;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Dinosaur implements ActionListener {

    public static Dinosaur dinosaur;

    public final int WIDTH = 800, HEIGHT = 800;

    public Renderer renderer;

    public Rectangle dino;

    public Dinosaur() {
        JFrame jframe = new JFrame();
        Timer timer = new Timer(20, this);

        renderer = new Renderer();

        jframe.add(renderer);
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setSize(WIDTH, HEIGHT);
        jframe.setVisible(true);

        dino = new Rectangle(WIDTH / 2, HEIGHT / 2 , 20, 20);

        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        renderer.repaint();
    }

    public void repaint(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(0,0, WIDTH, HEIGHT);

        g.setColor(Color.green);
        g.fillRect(dino.x, dino.y, dino.width, dino.height);
    }

    public static void main(String[] args) {

        dinosaur = new Dinosaur();
    }
}