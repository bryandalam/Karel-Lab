
package lab_2.individual_lab;

/**
   @Author:
      Date:
   Teacher: Appel
       Lab: Problem Set 3
      Misc: Karel says hello
  */
import kareltherobot.*;
import java.awt.Color;

public class Problem3Driver implements Directions
{
    public static void main(String args[])  {
        Problem3 karel = new Problem3(3, 2, North, -1);
        karel.setHello();
        karel.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/lab2-3.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(3);  
        World.setVisible(true);
    }
}