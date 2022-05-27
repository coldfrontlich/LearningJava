import javax.swing.JFrame;

public class Dinosaur {

    public static Dinosaur dinosaur;

    public final int WIDTH = 800, HEIGHT = 800;

    public Dinosaur() {
        JFrame jframe = new JFrame();

        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setSize(WIDTH, HEIGHT);
        jframe.setVisible(true);

    }

    public static void main(String[] args) {
        dinosaur = new Dinosaur();
    }
}