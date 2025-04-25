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
    private static final int PLAYER_WIDTH = 50;
    private static final int PLAYER_HEIGHT = 50;
    private static final int OBSTACLE_WIDTH = 20;
    private static final int OBSTACLE_HEIGHT = 20;
    private static final int PROJECTILE_WIDTH = 5;
    private static final int PROJECTILE_HEIGHT = 10;
    private static final int PLAYER_SPEED = 5;
    private static final int OBSTACLE_SPEED = 3;
    private static final int PROJECTILE_SPEED = 10;
    private int score = 0;

    private JPanel gamePanel;
    private JLabel scoreLabel;
    private Timer timer;
    private boolean isGameOver;
    private int playerX, playerY;
    private int projectileX, projectileY;
    private boolean isProjectileVisible;
    private boolean isFiring;
    private java.util.List<Point> obstacles;
    private BufferedImage shipImage;
    private BufferedImage backgroundImage;
    private BufferedImage spriteSheet;
    private int spriteWidth = 64;
    private int spriteHeight = 64;
    private Clip clip;

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