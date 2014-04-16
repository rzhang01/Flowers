import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class Flower extends JComponent
{
public void paintComponent(Graphics g)
{
Graphics2D g2 = (Graphics2D) g;
Flowertemp f = new Flowertemp(400.0,400.0);
f.draw(g2);
}
}