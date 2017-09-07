package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        rePosition();
        movetoTop();
        movetoBottom();
        endPosition();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
   public void rePosition() {
       turnRight();
    }
    public void movetoTop() {
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
    }
    public void movetoBottom() {
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
    }
    public void endPosition() {
        turnLeft();
    }
}