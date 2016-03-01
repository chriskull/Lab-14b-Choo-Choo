//This is Kyle and Chris' lab 14b, creating a graphics train!

import java.awt.*;
import java.applet.*;


public class Lab14bMacLeanStevensv100 extends Applet
{
	public void paint(Graphics g)
	{
      //this.setSize(2000,800);
      Train train = new Train(100,300); //this creates the train, with the addCar method adding each car onto the train
      train.addCar("Locomotive",Color.blue);
      train.addCar("PassengerCar",Color.gray);
      train.addCar("PassengerCar",Color.gray);
      train.addCar("FreightCar",Color.green);
      train.addCar(3,"PassengerCar",Color.gray);
      train.addCar("FreightCar",Color.green);
      train.addCar("Caboose",Color.red);
      train.addCar(6,"FreightCar",Color.green);
      train.showCars(g); //this shows the train
	}
}

