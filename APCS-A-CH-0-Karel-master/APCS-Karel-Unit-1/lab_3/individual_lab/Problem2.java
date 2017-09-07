package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Problem1
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        faceEast();
        checkRooms();
        
    }
    public void checkRooms() {
        nextRoom();
        testRoom();
        nextRoom();
        testRoom();
        nextRoom();
        testRoom();
        nextRoom();
        testRoom();
        nextRoom();
        testRoom();
        nextRoom();
        testRoom();
        nextRoom();
        testRoom();
        nextRoom();
        testRoom();
    }
    public void nextRoom() {
        move();
        turnLeft();
    }
    public void testRoom() {
        move();
        if (!frontIsClear()) {
            turnLeft();
            if (!frontIsClear()) {
                turnLeft();
                turnLeft();
                if (!frontIsClear()) {
                    turnRight();
                    putBeeper();
                    move();
                    turnLeft();
                }
                else {
                    faceSouth();
                    move();
                    turnLeft();
                }
            }
            else {
                faceSouth();
                move();
                turnLeft();
            }
        }
        else {
            faceSouth();
            move();
            turnLeft();
        }
}
public void faceSouth() {
    if (facingNorth()) {
        turnLeft();
        turnLeft();
    }
    else {
        if (facingWest()) {
            turnLeft();
        }
        if (facingEast()) {
            turnRight();
        }
    }
}
}

