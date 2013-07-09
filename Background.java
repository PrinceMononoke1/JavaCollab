import java.applet.Applet;
import java.awt.Image;
import java.net.URL;

public class Background extends Applet{
	private Image food, water, land;
	private URL base;
	private final int[] coordinates = {0,0,10,10};
	private int count;
	
	public Background() {
		food = getImage(base, "Food.png");
		water = getImage(base, "Blue.png");
		land = getImage(base, "Green.png");
		count=0;
	}
	
	public int getSpot(){
		int temp = coordinates[count];
		count++;
		return temp;
	}
	
	public Image getImages(){
		
		
		return water;
	}
}
