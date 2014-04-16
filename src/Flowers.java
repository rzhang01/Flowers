import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/*
public class Surface extends JPanel {
	
		private void doDrawing(){
		File img1 = new File("1.png");
		File img2 = new File("2.png");
		File img3 = new File("3.png");
		File img4 = new File("4.png");
		File img5 = new File("5.png");
		File img6 = new File("6.png");
		File img7 = new File("7.png");
		File img8 = new File("8.png");
		File img9 = new File("9.png");
		File img10 = new File("10.png");
	
		File[] imgArray = {img1,img2,img3,img4,img5,img6,img7,img8,img9,img10};
		
		BufferedImage[] bufImg = new BufferedImage[10];
		
		for(int i = 0; i < 10; i++){
			BufferedImage in = null;
			try {
				in = ImageIO.read(imgArray[i]);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bufImg[i] = in;
		}
		
		//random # of flowers
		Random random = new Random();
		int numImages = random.nextInt(10);
		System.out.println("asdf");
		BufferedImage[] finalImages = new BufferedImage[numImages];
		
		for(int i = 0; i < numImages; i++){
			//pick random image
			BufferedImage in = bufImg[random.nextInt(10)];
		

			BufferedImage newImage = new BufferedImage(in.getWidth(), in.getHeight(), BufferedImage.TYPE_INT_RGB);
			
			//fill the array with the new resized, randomly picked images;
			finalImages[i] = newImage;
			

			
		}
		//pick random size
		int randomSize = random.nextInt(8);
	//	Graphics2D g = finalImages[0].createGraphics();
		for(int i = 0; i < finalImages.length; i++){
			g.drawImage(finalImages[i], 0, 0, 50*(randomSize+1),50*(randomSize+1),null);
		}
		

		Color c = new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
		
		final float hue = random.nextFloat();
		
		c = Color.getHSBColor(hue, 0.9f, 1.0f);
		}
}
*/

public class Flowers  {

	public static void main(String[] args)
	{
	JFrame frame = new JFrame();
	final int FRAME_WIDTH = 1000;
	final int FRAME_HEIGHT = 1000;
	frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	frame.setTitle("ChartViewer");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Flower component = new Flower();
	frame.add(component);
	frame.setVisible(true);
}
}

