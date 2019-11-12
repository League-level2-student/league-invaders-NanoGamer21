import java.awt.Graphics;

public class objectManager {
	Rocketship pepito;
	objectManager(Rocketship pepito){
		this.pepito = pepito;
		
	}
	void update() {
		pepito.update();
	}
	void draw(Graphics g) {
		pepito.draw(g);
}
	
}
