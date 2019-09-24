import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class gamePanel extends JPanel implements ActionListener, KeyListener {
	Timer bob;
	final int MENU_STATE = 1;
	final int GAME_STATE = 2;
	final int END_STATE = 3;
	int currentState = MENU_STATE;
	Font titleFont;
	Rocketship Rocketship = new Rocketship(250,500,50,50);
	
	
	public gamePanel() {
		bob = new Timer(1000 / 60, this);
		titleFont = new Font("Ariel",Font.PLAIN,48);

		System.out.println("sup brother timer");
	}

	void gameStart() {
		bob.start();
		System.out.println("hey friend");
	}

	@Override
	public void paintComponent(Graphics g) {
		System.out.println("gamestate");
		if (currentState == MENU_STATE) {

			drawMenuState(g);

		} else if (currentState == GAME_STATE) {

			drawGameState(g);

		} else if (currentState == END_STATE) {

			drawEndState(g);

		}
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
		if (currentState == MENU_STATE) {

			updateMenuState();

		} else if (currentState == GAME_STATE) {

			updateGameState();

		} else if (currentState == END_STATE) {

			updateEndState();

		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

		int keyCode = arg0.getKeyCode();
		if (keyCode == KeyEvent.VK_ENTER) {
			currentState++;
			System.out.println(currentState);
			if (currentState > END_STATE) {
				currentState = MENU_STATE;
			}
		}
		int keyCodeup = arg0.getKeyCode();
		System.out.println(keyCodeup);
		if(keyCodeup == KeyEvent.VK_W) {
			Rocketship.y--;
			
		}
		int keycodedwn = arg0.getKeyCode();
		if(keycodedwn == KeyEvent.VK_S) {
			Rocketship.y++;
		}
		int keycodedlft = arg0.getKeyCode();
		if(keycodedlft == KeyEvent.VK_A) {
			Rocketship.x--;
		}
		int keycodedRght = arg0.getKeyCode();
		if(keycodedRght == KeyEvent.VK_D) {
			Rocketship.x++;
		}
		

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	void updateMenuState() {

	}

	void updateGameState() {
		Rocketship.update();
	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("Press Enter to  begin", 20, 650);
		g.drawString("LEAGUE INVADERS", 20, 100);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		Rocketship.draw(g);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setFont(titleFont);
		g.setColor(Color.BLACK);
		g.drawString("GAME OVER", 100, 100);
		g.drawString("Killed 0 aliens", 100, 250);
		g.drawString("Press enter to restart", 20, 500);
	}
}
