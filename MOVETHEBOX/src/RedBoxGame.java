import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RedBoxGame extends JFrame {
    private static final int WIDTH = 1920;
    private static final int HEIGHT = 1080;
    private static final int BOX_SIZE = 50;
    private static final int MOVE_SPEED = 5;
    private static final double GRAVITY = 0.5;
    private static final double JUMP_FORCE = -12;
    private static final int FPS = 120;

    // Margin settings (space where box cannot go)
    private static final int TOP_MARGIN = 50;
    private static final int BOTTOM_MARGIN = 50;
    private static final int LEFT_MARGIN = 50;
    private static final int RIGHT_MARGIN = 50;

    private int boxX = WIDTH / 2 - BOX_SIZE / 2;
    private int boxY = HEIGHT / 2 - BOX_SIZE / 2;
    private double velocityY = 0;
    private boolean isJumping = false;
    private boolean leftPressed = false;
    private boolean rightPressed = false;

    public RedBoxGame() {
        setTitle("Red Box Game with Margins");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        leftPressed = true;
                        break;
                    case KeyEvent.VK_RIGHT:
                        rightPressed = true;
                        break;
                    case KeyEvent.VK_SPACE:
                        if (!isJumping) {
                            velocityY = JUMP_FORCE;
                            isJumping = true;
                        }
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        leftPressed = false;
                        break;
                    case KeyEvent.VK_RIGHT:
                        rightPressed = false;
                        break;
                }
            }
        });

        JPanel gamePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawGame(g);
            }
        };

        gamePanel.setBackground(Color.BLACK);
        add(gamePanel);

        // Game loop
        Timer gameLoop = new Timer(1000/FPS, e -> {
            updateGame();
            repaint();
        });
        gameLoop.start();
    }

    private void updateGame() {
        // Horizontal movement
        if (leftPressed) boxX -= MOVE_SPEED;
        if (rightPressed) boxX += MOVE_SPEED;

        // Apply gravity
        velocityY += GRAVITY;
        boxY += velocityY;

        // Boundary checks with margins
        // Left boundary
        if (boxX < LEFT_MARGIN) {
            boxX = LEFT_MARGIN;
        }
        // Right boundary
        if (boxX > WIDTH - RIGHT_MARGIN - BOX_SIZE) {
            boxX = WIDTH - RIGHT_MARGIN - BOX_SIZE;
        }
        // Top boundary
        if (boxY < TOP_MARGIN) {
            boxY = TOP_MARGIN;
            velocityY = 0;
        }
        // Bottom boundary (ground)
        if (boxY > HEIGHT - BOTTOM_MARGIN - BOX_SIZE) {
            boxY = HEIGHT - BOTTOM_MARGIN - BOX_SIZE;
            velocityY = 0;
            isJumping = false;
        }
    }

    private void drawGame(Graphics g) {
        // Draw margins (visual representation)
        g.setColor(new Color(50, 50, 50)); // Dark gray for margins
        g.fillRect(0, 0, WIDTH, TOP_MARGIN); // Top margin
        g.fillRect(0, HEIGHT - BOTTOM_MARGIN, WIDTH, BOTTOM_MARGIN); // Bottom margin
        g.fillRect(0, 0, LEFT_MARGIN, HEIGHT); // Left margin
        g.fillRect(WIDTH - RIGHT_MARGIN, 0, RIGHT_MARGIN, HEIGHT); // Right margin

        // Draw play area border
        g.setColor(Color.DARK_GRAY);
        g.drawRect(LEFT_MARGIN, TOP_MARGIN,
                WIDTH - LEFT_MARGIN - RIGHT_MARGIN,
                HEIGHT - TOP_MARGIN - BOTTOM_MARGIN);

        // Draw the box
        g.setColor(Color.RED);
        g.fillRect(boxX, boxY, BOX_SIZE, BOX_SIZE);

        // Display instructions
        g.setColor(Color.WHITE);
        g.drawString("Use arrows to move, SPACE to jump", LEFT_MARGIN + 10, TOP_MARGIN + 20);
        g.drawString("Margins: " + LEFT_MARGIN + "px all around", LEFT_MARGIN + 10, TOP_MARGIN + 40);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RedBoxGame game = new RedBoxGame();
            game.setVisible(true);
        });
    }
}