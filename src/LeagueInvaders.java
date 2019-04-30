import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	final static int height = 800;
	final static int width = 500;
	gamePanel gamePanel;
	public static void main(String[] args) {
		LeagueInvaders game = new LeagueInvaders();
		game.setup();
}
	public LeagueInvaders(){
		frame = new JFrame();
		gamePanel = new gamePanel();
	}
	void setup() {
		frame.setSize(width, height);
		frame.add(gamePanel);
		frame.getContentPane();
		frame.setPreferredSize(new Dimension (width,height));
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(gamePanel);
		System.out.println("Sup buddy");
	}
}