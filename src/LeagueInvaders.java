import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	int height = 800;
	int width = 500;
	public static void main(String[] args) {
		new LeagueInvaders().createUI();
	}
		private void createUI(){
			frame = new JFrame();
			frame.setSize(width, height);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}