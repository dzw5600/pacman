import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Point;
import java.util.List;
import java.awt.image.BufferedImage;
import javax.sound.sampled.*;
import levels.FirstLevel;

public class PacmanGame extends JFrame {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    public PacmanGame() {
        setTitle("Pac-Man Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        FirstLevel.startLevel(this, 0);
        add(FirstLevel.getPanel());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PacmanGame().setVisible(true);
            }
        });
    }
}