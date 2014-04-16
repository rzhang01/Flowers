import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;

/**
   This class draws a stick Flowertemp.
*/
public class Flowertemp
{
   /**
      Constructs a Flowertemp object.
      @param aWidth the width
      @param aHeight the height
   */
   public Flowertemp(double aWidth, double aHeight)
   {
      width = aWidth;
      height = aHeight;
      data = new ArrayList<Integer>();
   }

   /**
      Adds the data value to the list.
      @param value the data value
   */
   public void add(int value)
   {
      data.add(new Integer(value));
   }

   /**
      Draws the stick Flowertemp.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {

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
			
				
				BufferedImage newImage = null;
				try {
					newImage = ImageIO.read(imgArray[i]);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//fill the array with the new resized, randomly picked images;
				finalImages[i] = newImage;
				

				
			}
			//pick random size
			int randomSize = random.nextInt(8);
			int x = 250;
		//	Graphics2D g = finalImages[0].createGraphics();
			for(int i = 0; i < finalImages.length; i++){
				randomSize++;
				x = x-25;
			//	Color c = new Color(5.0f,5.0f,5.0f,1.0f);	
				Color c = new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));		
				final float hue = random.nextFloat();
				c = Color.getHSBColor(hue, 0.9f, 1.0f);
				
				 WritableRaster raster = finalImages[i].getRaster();
				BufferedImage temp = finalImages[i];
				for(int y = 0; y < temp.getHeight(); y++){
					for(int z = 0; z < temp.getWidth(); z++){
						int pixel = temp.getRGB(y, z);
						
						if((pixel&0x00FFFFFF) != 0){		
							Color c2 = new Color(c.getRed(),c.getGreen(),c.getBlue(),128);
						temp.setRGB(y,z,c2.getRGB());
				//			temp.setRGB(y,z,c.getRGB());
						}
						/*
						int[] pixels = raster.getPixel(y, z, (int[]) null);
						
						if(pixels[0] == 0 && pixels[1] == 0 && pixels[2] == 0){
							pixels[0] = c.getBlue();
							pixels[1] = c.getGreen();
							pixels[2] = c.getRed();
							raster.setPixel(y, z, pixels);
						}
						
				*/	
					}
				}
				
				g2.drawImage(temp, x, x, (randomSize*50),(randomSize*50),null);
			}
			
	//		g2.drawImage(finalImages[0],0,0,null);
   }
   

   private double width;
   private double height;
   private ArrayList<Integer> data;
}