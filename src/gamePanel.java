import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class gamePanel extends JPanel implements ActionListener  {
Timer bob;

public gamePanel() {
	bob = new Timer(1000/60,this);	
}
void gameStart() {
	bob.start();
}
@Override
public void paintComponent(Graphics g){
	g.fillRect(10, 10, 100, 100);
     }
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	repaint();
}
}
