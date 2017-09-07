package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        //Complete this method, using the methods you create below so that all rows are harvested
        move();
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();
        repositionToPlant();
        plantTwoRows();
        plantTwoRows();
        plantTwoRows();
        
    }
    //your methods go below
    
    /**
     * Precondition: Robot is facing east one block away from a beeper
     * Precondition: Robot is facing east two streets above where it started
     */
    public void harvestTwoRows() {
        harvestOneRow();
        repositionRight();
        harvestOneRow();
        repositionLeft();
    }
    public void harvestOneRow() {
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
    public void repositionRight() {
        turnLeft();
        move();
        turnLeft();
    }
    public void repositionLeft() {
        turnRight();
        move();
        turnRight();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void repositionBackLeft() {
        turnLeft();
        move();
        turnLeft();
    }
    public void plantOneRow() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    public void repositionBackRight() {
        turnRight();
        move();
        turnRight();
    }
    public void plantTwoRows() {
        plantOneRow();
        repositionBackRight();
        plantOneRow();
        repositionBackLeft();
    }
    public void repositionToPlant() {
        turnRight();
        move();
        turnLeft();
    }
        
}

