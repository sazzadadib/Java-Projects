
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Gameplay3 extends JPanel implements KeyListener, ActionListener {

	private boolean play = false;
	private int score = 0;

	private int totalBricks = 65;
	private Timer timer;
	private int delay = 8;

	private int playerX = 310;

	private int ballposX = 350;
	private int ballposY = 530;
	private int ballXdir = -3;
	private int ballYdir = -7;

	private MapGenerator map;

	public Gameplay3() {
		map = new MapGenerator(5, 13);
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay, this);
		timer.start();
	}

	public void paint(Graphics g) {
		// background
		g.setColor(Color.black);
		g.fillRect(1, 1, 692, 592);

		// drawing
		map.draw((Graphics2D) g);

		// border
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 3, 592);
		g.fillRect(0, 0, 692, 3);
		g.fillRect(691, 0, 3, 592);

		// Score

		g.setColor(Color.white);
		g.setFont(new Font("serif", Font.BOLD, 25));
		g.drawString("" + score, 590, 30);

		// paddle
		g.setColor(Color.green);
		g.fillRect(playerX, 550, 100, 8);

		// ball
		g.setColor(Color.yellow);
		g.fillOval(ballposX, ballposY, 20, 20);

		if (totalBricks <= 0) {
			play = false;
			ballXdir = 0;
			ballYdir = 0;
			g.setColor(Color.green);
			g.setFont(new Font("serif", Font.BOLD, 30));
			g.drawString("You Won", 230, 300);

			g.setFont(new Font("serif", Font.BOLD, 20));
			g.drawString("To Play Again, Press Enter", 230, 350);
		}

		if (ballposY > 570) {
			play = false;
			ballXdir = 0;
			ballYdir = 0;
			g.setColor(Color.red);
			g.setFont(new Font("serif", Font.BOLD, 30));
			g.drawString("Game Over!", 250, 300);

			g.setFont(new Font("serif", Font.BOLD, 20));
			g.drawString("Press Enter To Restart", 230, 350);

		}

		g.dispose();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		timer.start();
		if (play) {
			if (new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 550, 100, 8))) {
				ballYdir = -ballYdir;
			}
			aa: for (int i = 0; i < map.map.length; i++) {
				for (int j = 0; j < map.map[0].length; j++) {
					if (map.map[i][j] > 0) {
						int brickX = j * map.brickWidth + 80;
						int brickY = i * map.brickHeight + 50;
						int brickWidth = map.brickWidth;
						int brickHeight = map.brickHeight;

						Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
						Rectangle ballRect = new Rectangle(ballposX, ballposY, 20, 20);
						Rectangle brickRect = rect;

						if (ballRect.intersects(brickRect)) {
							map.setBrickValue(0, i, j);
							totalBricks--;
							score += 5;

							if (ballposX + 19 <= brickRect.x || ballposX + 1 >= brickRect.x + brickRect.width) {
								ballXdir = -ballXdir;
							} else {
								ballYdir = -ballYdir;
							}
							break aa;
						}
					}
				}

			}

			ballposX += ballXdir;
			ballposY += ballYdir;
			if (ballposX < 0) {
				ballXdir = -ballXdir;
			}
			if (ballposY < 0) {
				ballYdir = -ballYdir;
			}
			if (ballposX > 670) {
				ballXdir = -ballXdir;
			}

		}

		repaint();

	}

	public void keyTyped(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (playerX >= 600) {
				playerX = 600;
			} else {
				moveRight();
			}

		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			if (playerX < 10) {
				playerX = 10;
			} else {
				moveLeft();
			}

		}

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (!play) {
				play = true;
				ballposX = 350;
				ballposY = 530;
				ballXdir = 3;
				ballYdir = -7;
				playerX = 310;
				score = 0;
				totalBricks = 65;
				map = new MapGenerator(5, 13);
				repaint();
			}

		}

	}

	public void moveRight() {
		play = true;
		playerX += 20;
	}

	public void moveLeft() {
		play = true;
		playerX -= 20;
	}

}
