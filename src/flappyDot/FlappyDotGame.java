package flappyDot;


import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class FlappyDotGame  extends BasicGame{
	

	public FlappyDotGame(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		FlappyDotGame game = new FlappyDotGame("Flappy Dot");
		AppGameContainer appgc;
		try {
			appgc = new AppGameContainer(game);
			appgc.setDisplayMode(800, 600, false);
			appgc.setTargetFrameRate(60);
			appgc.start();
		} catch (SlickException e) {
			
			e.printStackTrace();
		}

	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		Color background = new Color(128, 128, 128);
		arg0.getGraphics().setBackground(background);
		
	}
	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}

}
