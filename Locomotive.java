import java.awt.*;


public class Locomotive extends RailCar //this is the Locomotive class, creating the front of the train
{
	private Color carColor;
	private int xPos;
	private int yPos;

	public Locomotive(Color cC, int xPos, int yPos)
	{
		super(cC,xPos,yPos);
      carColor = cC;
      this.xPos = xPos;
      this.yPos = yPos;
   }

	public void drawCar(Graphics g) //This draws the locomotive car of the train
	{
		super.drawCar(g);
		drawScoop(g);
		drawFunnel(g);
	}

	private void drawScoop(Graphics g) //This draws the scoop of the locomotive car
	{
		Polygon scoop = new Polygon();
		scoop.addPoint(xPos,yPos+50);
		scoop.addPoint(xPos,yPos+100);
		scoop.addPoint(xPos-50,yPos+100);
	   g.setColor(Color.black);
	   g.fillPolygon(scoop);
	}

	private void drawFunnel(Graphics g) //this draws the funnel of the locomotive car
	{
		Polygon funnel = new Polygon();
		funnel.addPoint(xPos+20,yPos);
		funnel.addPoint(xPos+20,yPos-30);
		funnel.addPoint(xPos,yPos-50);
		funnel.addPoint(xPos,yPos-60);
		funnel.addPoint(xPos+60,yPos-60);
		funnel.addPoint(xPos+60,yPos-50);
		funnel.addPoint(xPos+40,yPos-30);
		funnel.addPoint(xPos+40,yPos);
	   g.setColor(Color.black);
	   g.fillPolygon(funnel);
	}
}

