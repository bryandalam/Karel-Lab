package lab_3.pair_programming;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void checkSurrounded(){
        faceNorth();
        if (frontIsClear() == false) {
            turnLeft();
            if (frontIsClear() == false) {
                turnLeft();
                if (frontIsClear() == false) {
                    turnLeft();
                    if (frontIsClear() == false) {
                        turnLeft();
                        turnOff();
                  }
               }
           }
       }
  }
  public void faceNorth(){
     if (facingEast()) {
         turnLeft();
         turnLeft();
         turnLeft();
        }
     if (facingSouth()) {
         turnLeft();
         turnLeft();
        }
     if (facingWest()) {
         turnLeft();
        }
  }
}



