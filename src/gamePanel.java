import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class gamePanel extends JPanel implements ActionListener, KeyListener   {
Timer bob;
GameObject GameObject;

public gamePanel() {
	bob = new Timer(1000/60,this);	
	GameObject = new GameObject();
	System.out.println("sup brother timer");
}
void gameStart() {
	bob.start();
	System.out.println("hey friend");
}
@Override
public void paintComponent(Graphics g){
	GameObject.draw(g);
     }
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	repaint();
}
@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("Key pressed");
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
