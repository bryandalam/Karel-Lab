package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Problem2
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        faceEast();
        doRooms();
    }
    public void moveEndOfRoom() {
        if (frontIsClear()) {
            move();
            if (frontIsClear()) {
                move();
                if (frontIsClear()) {
                    move();
                    if (frontIsClear()) {
                        move();
                        if (frontIsClear()) {
                            faceSouth();
                            move();
                            move();
                        }
                    }
                }
            }
        }
        
    }
    public void testLongRoom() {
        moveEndOfRoom();
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
                }
            }
            else {
                faceSouth();
                move();
            }
        }
        else {
            faceSouth();
            move();
        }
    }
    public void doRooms() {
        nextLongRoom();
        testLongRoom();
        nextLongRoom();
        testLongRoom();
        nextLongRoom();
        testLongRoom();
        nextLongRoom();
        testLongRoom();
        nextLongRoom();
        testLongRoom();
        nextLongRoom();
        testLongRoom();
        nextLongRoom();
        testLongRoom();
        nextLongRoom();
        testLongRoom();
        
    }
    public void nextLongRoom() {
        faceSouth();
        if (frontIsClear()) {
            move();
            if (frontIsClear()) {
                move();
                if (frontIsClear()) {
                    move();
                    if (frontIsClear()) {
                        move();
                        if (frontIsClear()) {
                            move();
                        }
                        else {
                            faceEast();
                            move();
                            turnLeft();
                        }
                    }
                    else {
                        faceEast();
                        move();
                        turnLeft();
                    }
                }
                else {
                    faceEast();
                    move();
                    turnLeft();
                }
            }
            else {
                faceEast();
                move();
                turnLeft();
            }
        }
        else {
            faceEast();
            move();
            turnLeft();
        }
                    }
            
                     
                
                }

