package flappyDot;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Dot {

	public int pos_x, pos_y;
	public Image image;
	
	public Dot(int start_pos_x, int start_pos_y, String start_image) throws SlickException
	{
		pos_x = start_pos_x;
		pos_y = start_pos_y;
		image = new Image(start_image);
		
	}
	public void Render()
	{
		image.draw(pos_x, pos_y);
	}
	

}
