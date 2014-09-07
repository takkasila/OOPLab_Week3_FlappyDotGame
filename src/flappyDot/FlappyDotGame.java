package flappyDot;


import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class FlappyDotGame  extends BasicGame{
	
	final static int SCREEN_WIDTH = 800;
	final static int SCREEN_HEIGHT = 600;
	final static float GRAVITY = -0.5f;
	
	private boolean isStarted = false;
	
	static Dot dot;
	static PipePair pipePair1;

	public FlappyDotGame(String title) {
		super(title);
	}

	public static void main(String[] args) {
		FlappyDotGame game = new FlappyDotGame("Flappy Dot");
		AppGameContainer appgc;
		try {
			appgc = new AppGameContainer(game);
			appgc.setDisplayMode(SCREEN_WIDTH, SCREEN_HEIGHT, false);
			appgc.setTargetFrameRate(60);
			appgc.start();
		} catch (SlickException e) {
			
			e.printStackTrace();
		}

	}
	
	@Override
	public void keyPressed(int key, char c)
	{
		if(!isStarted)
		{
			isStarted = true;
		}
		if(key == Input.KEY_SPACE)
		{
			dot.Jump();
			
		}
	}
	
	@Override
	public void init(GameContainer arg0) throws SlickException {
		Color background = new Color(128, 128, 128);
		arg0.getGraphics().setBackground(background);
		dot = new Dot(SCREEN_WIDTH/12, SCREEN_HEIGHT/2 - 20);
		pipePair1 = new PipePair(SCREEN_WIDTH/2 , SCREEN_HEIGHT/2);
		
	}
	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		dot.Render();
		pipePair1.Render();
		
	}
	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		if(isStarted)
		{
			dot.Update(GRAVITY);
		}
		
	}

}
