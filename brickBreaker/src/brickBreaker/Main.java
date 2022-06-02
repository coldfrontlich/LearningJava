package brickBreaker;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        Gameplay gameplay = new Gameplay();
        jFrame.setBounds(10,10,700,600);
        jFrame.setTitle("Brick Breaker");
        jFrame.setResizable(false);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(gameplay);
    }
}
