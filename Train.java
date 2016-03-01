import java.util.*;
import java.awt.*;

public class Train
{
   protected ArrayList<RailCar> cars;
   protected ArrayList<Color> colors;
   protected ArrayList<String> types;
   protected int x;
   protected int y;
   protected int startX;
     
   public Train(int x, int y)
   {
      cars   = new ArrayList<RailCar>();
      colors = new ArrayList<Color>();
      types = new ArrayList<String>();
      this.x = x;
      this.y = y;
      startX = x;
   }
     
   public void addCar(String type, Color color)
   {
      switch (type)
      {
         case "Locomotive"    : cars.add(new Locomotive(color, x, y));  break;
         case "PassengerCar"  : cars.add(new PassengerCar(color, x, y)); break; 
         case "FreightCar"    : cars.add(new FreightCar(color, x, y));   break;
         case "Caboose"       : cars.add(new Caboose(color, x, y));      break;
      }
      
      types.add(type);
      colors.add(color);
      x += 175;
   }
     
   public void addCar(int loc, String type, Color color)
   {
      ArrayList<RailCar> temp = new ArrayList<RailCar>();
      int tempX = startX;
      for (int k = 0; k < loc; k++)
      {
         temp.add(cars.get(k));
         tempX += 175;
      }
      
      switch (type)
      {
         case "Locomotive"    : temp.add(new Locomotive(color, tempX, y));  break;
         case "PassengerCar"  : temp.add(new PassengerCar(color, tempX, y)); break; 
         case "FreightCar"    : temp.add(new FreightCar(color, tempX, y));   break;
         case "Caboose"       : temp.add(new Caboose(color, tempX, y));      break;
      }
      types.add(loc,type);
      colors.add(loc, color);
      tempX += 175;
      
      for (int k = loc + 1; k < types.size(); k++)
      {
         switch (types.get(k))
         {
            case "Locomotive"    : temp.add(new Locomotive(colors.get(k), tempX, y));     break;
            case "PassengerCar"  : temp.add(new PassengerCar(colors.get(k), tempX, y));   break; 
            case "FreightCar"    : temp.add(new FreightCar(colors.get(k), tempX, y));     break;
            case "Caboose"       : temp.add(new Caboose(colors.get(k), tempX, y));        break;
         }
         tempX += 175;
      }
      int tempSize = cars.size();
      for (int k = 0; k < tempSize; k++)
         cars.remove(0);
      for (RailCar car : temp)
         cars.add(car);
      x = tempX;
   }
     
   public void showCars(Graphics g)
   {
      for (RailCar car : cars)
         car.drawCar(g);
   }
}
