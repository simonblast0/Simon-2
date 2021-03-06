package simonjim;
//
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;

import guiPractice.components.Component;

public class Progress extends Component implements ProgressInterfaceSimon {
	
	private static final int WIDTH = 200;
	private static final int HEIGHT = 100;
	private String round;
	private String sequence;
	private boolean gameOver;


	public Progress() {
		super(200,50,WIDTH,HEIGHT);
		// TODO Auto-generated constructor stub
	
	}

	@Override
	public void gameOver() {
		gameOver = true;
		update();
	}

	@Override
	public void setRound(int roundNumber) {
		// TODO Auto-generated method stub
		round = "Round "+roundNumber;
		update();
	}

	@Override
	public void setSequenceSize(int size) {
		sequence = "Sequence "+size;
		update();

	}

	@Override
	public void update(Graphics2D g) {
		FontMetrics fm = g.getFontMetrics();
		if(gameOver){
			g.setColor(Color.gray);
			g.fillRect(0, 0, WIDTH, HEIGHT);
			g.setColor(Color.red);
			String go = "GAME OVER!";
			g.drawString(go, (WIDTH - fm.stringWidth(go))/2, 20);
			g.drawString(sequence, (WIDTH - fm.stringWidth(sequence))/2, 40);

		}else{
			g.setColor(Color.cyan);
			g.fillRect(0, 0, WIDTH, HEIGHT);
			g.setColor(Color.black);
			g.drawRect(0, 0, WIDTH-1, HEIGHT-1);
			if(round !=null && sequence!= null){

				g.drawString(round, (WIDTH - fm.stringWidth(round))/2, 20);
				g.drawString(sequence, (WIDTH - fm.stringWidth(sequence))/2, 40);
			}
		}
		
	}

}
