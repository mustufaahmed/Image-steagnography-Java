package steagnography;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Singleton extends EmbedMessage{

private static Singleton uniqueInstance = null;
	BufferedImage sourceImage;

	private Singleton() {
		sourceImage = null;
	}
	
	public static Singleton getInstance() {
		
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
	protected void openImage() {
		  java.io.File f = showFileDialog(true);
		  if(sourceImage == null) {
		  try {                                    
		     sourceImage = ImageIO.read(f);
		     JLabel l = new JLabel(new ImageIcon(sourceImage));
		     originalPane.getViewport().add(l);
		     this.validate();
		     } catch(Exception ex) { ex.printStackTrace(); }
}
		  }
}
