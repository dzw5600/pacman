package levels;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FirstLevel implements KeyListener
{
    static BufferedImage backgroundImage;
    static JPanel gamePanel;

    public static JPanel getPanel()
    {
        return gamePanel;
    }


    public static void startLevel(JFrame frame, int currentSpeed)
    {
        try {
            backgroundImage = ImageIO.read(new File("maps/map1.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        gamePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                draw(g);
            }
        };
    }

    private static void draw(Graphics g){
        int imageX = (gamePanel.getWidth() - backgroundImage.getWidth())/2;
        int imageY = (gamePanel.getHeight() - backgroundImage.getHeight())/2;
        g.drawImage(backgroundImage, imageX, imageY, null);
    }


    private void update() {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}