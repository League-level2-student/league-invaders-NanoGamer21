import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;
	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 5;
		
	}
 void  update () {
	 
 }
void draw(Graphics g) {
	g.setColor(Color.BLUE);
	g.drawRect(x, y, width, height);
	System.out.println(x);
	System.out.println(y);
}


}
