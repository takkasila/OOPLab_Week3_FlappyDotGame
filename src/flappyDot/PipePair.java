package flappyDot;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class PipePair {

	final static String PIPE_TOP = "res/pipe-top.png";
	final static String PIPE_BOTTOM = "res/pipe-bottom.png";
	final static public float GAP_SIZE = 200;
	
	public Image pipe_top;
	public Image pipe_bottom;
	
	public float pos_x, pos_y;
	
	public PipePair(float start_pos_x, float start_pos_y) throws SlickException
	{
		pos_x = start_pos_x;
		pos_y = start_pos_y;
		pipe_top = new Image(PIPE_TOP);
		pipe_bottom = new Image(PIPE_BOTTOM);
		
		
	}
	public void Render()
	{
		pipe_top.draw(pos_x - pipe_top.getWidth()/2 
				, pos_y - pipe_top.getHeight() - GAP_SIZE/2);
		pipe_bottom.draw(pos_x - pipe_bottom.getWidth()/2
				, pos_y + GAP_SIZE/2);
	}
	

}
