import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class gamePanel extends JPanel implements ActionListener, KeyListener   {
Timer bob;
final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState = MENU_STATE;



public gamePanel() {
	bob = new Timer(1000/60,this);	
	
	System.out.println("sup brother timer");
}
void gameStart() {
	bob.start();
	System.out.println("hey friend");
}
@Override
public void paintComponent(Graphics g){
    if(currentState == MENU_STATE){

        drawMenuState(g);

}else if(currentState == GAME_STATE){

        drawGameState(g);

}else if(currentState == END_STATE){

        drawEndState(g);

}
     }
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	repaint();
}
@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("Key pressed");
    if(currentState == MENU_STATE){

        updateMenuState();

}else if(currentState == GAME_STATE){

        updateGameState();

}else if(currentState == END_STATE){

        updateEndState();

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

void updateMenuState(){
	
}
void updateGameState() {

}
void updateEndState(){
	
}
void drawMenuState(Graphics g) {
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);  
}
void drawGameState(Graphics g) {
	
}
void drawEndState(Graphics g) {
	
}
}

