import java.applet.Applet;
import java.awt.Graphics;
public  class Viszlat extends Applet {
		public void paint (Graphics g){
			g.drawRect(25,2,90,25);
			g.drawString("Viszlat!",50,20);
	}
}