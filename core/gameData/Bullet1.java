package gameData;
import com.badlogic.gdx.math.Vector2;

public class Bullet1 {

	public Vector2 bulletLocation = new Vector2(0,0);
	private Vector2 bulletVelocity = new Vector2(0,0);
	
	public Bullet1(Vector2 sentLocation, Vector2 sentVelocity) {
		bulletLocation = new Vector2(sentLocation.x, sentLocation.y);
		bulletVelocity = new Vector2(sentVelocity.x, sentVelocity.y);
	}	
	public void update() {
		bulletLocation.y += bulletVelocity.y;
	}
}