import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;
	boolean moveUp = false;
	boolean moveDown = false;
	boolean moveRight = false;
	boolean moveLeft = false;
	
	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 5;
		
	}
 void  update () {
	 if (moveUp == true){
		 y-= speed;
	 }
	 else if (moveDown == true) {
		 y+= speed;
	 }
	 else if (moveRight == true) {
		 x-= speed;
	 }
	 else if (moveLeft == true) {
		 x+= speed;
	 }
 }
void draw(Graphics g) {
	g.setColor(Color.BLUE);
	g.drawRect(x, y, width, height);
	System.out.println(x);
	System.out.println(y);
}


}
