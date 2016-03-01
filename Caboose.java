import java.awt.*;


public class Caboose extends RailCar //This is the Caboose class, creating the graphical end of the train
{
	private Color carColor;
	private int xPos;
	private int yPos;

	public Caboose(Color cC, int xPos, int yPos)
	{
		super(cC,xPos,yPos);
      carColor = cC;
      this.xPos = xPos;
      this.yPos = yPos;
   }

	public void drawCar(Graphics g) //this draws the caboose
	{
		super.drawCar(g);
		drawWindows(g);
		drawCupola(g);
	}

	private void drawWindows(Graphics g) //this draws the windows for the train
	{
	    g.setColor(Color.white);
	    g.fillRect(xPos+30,yPos+30,30,30);
	    g.fillRect(xPos+90,yPos+30,30,30);
	}

	private void drawCupola(Graphics g) //this draws the different roof for the train
	{
	    g.setColor(Color.red);
	    g.fillRect(xPos+30,yPos-30,90,30);
	    g.setColor(Color.black);
	    g.fillRect(xPos+25,yPos-30,100,5);
	}
}

