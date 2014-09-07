package flappyDot;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Dot {

	final static float JUMP_POWER = 10;
	public int pos_x, pos_y;
	public float vel_x, vel_y;
	public Image image;
	
	public void Jump()
	{
		vel_y = -JUMP_POWER;
	}
	public Dot(int start_pos_x, int start_pos_y, String start_image) throws SlickException
	{
		pos_x = start_pos_x;
		pos_y = start_pos_y;
		vel_x = 0;
		vel_y = 0;
		image = new Image(start_image);
		
	}
	public void Update(float gravity)
	{
		
		vel_y -= gravity;
		pos_x += vel_x;
		pos_y += vel_y;
		
	}
	public void Render()
	{
		image.draw(pos_x, pos_y);
	}
	

}
