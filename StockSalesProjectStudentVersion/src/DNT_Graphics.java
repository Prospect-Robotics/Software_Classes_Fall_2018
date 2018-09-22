

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

@SuppressWarnings("serial")
public class DNT_Graphics extends JPanel implements Runnable{
	/*   _____   ____    _   _  ____ _______   _______ ____  _    _  _____ _    _ 
		|  __ \ / __ \  | \ | |/ __ \__   __| |__   __/ __ \| |  | |/ ____| |  | |
		| |  | | |  | | |  \| | |  | | | |       | | | |  | | |  | | |    | |__| |
		| |  | | |  | | | . ` | |  | | | |       | | | |  | | |  | | |    |  __  |
		| |__| | |__| | | |\  | |__| | | |       | | | |__| | |__| | |____| |  | |
		|_____/ \____/  |_| \_|\____/  |_|       |_|  \____/ \____/ \_____|_|  |_|
	                                                                   
	 */
	public Thread thread1 = new Thread(this);
	int graphx = 7, graphy = 520;
	
	public void run() {
		while(true){
			repaint();
			try{
				//DNT_Messenger.getInstance().StockPrice++;
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
	public DNT_Graphics(){
		setPreferredSize(DNT_Window.windowsize);
		thread1.start();
	}
	public void paintComponent(Graphics g){
		g.clearRect(0, 0, DNT_Window.width, DNT_Window.height/2);
		Grid grid = new Grid(g, graphx, graphy, 38, 10, 50);
		grid.draw();
		g.drawString(DNT_Messenger.getInstance().StockPrice + "", 100, 100);
		for(int r = 0; r < DNT_Messenger.getInstance().points.length; r++) {
			for(int i = 0; i < DNT_Messenger.getInstance().points[r].get().size(); i++){
				g.drawOval(grid.bx - 2 + (i*grid.boxsize), grid.by - 2 - ((DNT_Messenger.getInstance().points[r].get().get(i))*grid.boxsize), 4, 4);
			}
		}
		DNT_Messenger.getInstance().StockPrice = Math.round((DNT_Messenger.getInstance().Cautious.get().get(DNT_Messenger.getInstance().Cautious.get().size()-1)+
				DNT_Messenger.getInstance().Cautious.get().get(DNT_Messenger.getInstance().Cautious.get().size()-1)+
				DNT_Messenger.getInstance().Cautious.get().get(DNT_Messenger.getInstance().Cautious.get().size()-1))/3);
	}
	private class Grid {
		int x;
		int y;
		int width;
		int length;
		int boxsize;
		Graphics g;
		
		private Grid(Graphics g, int x, int y, int width, int length, int boxsize) {
			this.g = g;
			this.width = width;
			this.length = length;
			this.x = x;
			this.y = y;
			this.boxsize = boxsize;
			
			bx = x;
			by = y + (length * boxsize);
		}
		
		int bx;
		int by;
		
		public void draw() {
			for(int i = 0; i < width + 1; i++) {
				g.drawLine(x + (i * boxsize), y, x + (i * boxsize), y + (length * boxsize));
			}
			for(int i = 0; i < length + 1; i++) {
				g.drawLine(x, y  + (i * boxsize), x + (width * boxsize), y + (i * boxsize));
			}
		}
	}
}
