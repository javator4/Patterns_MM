package com.sda.factory;

public class RobotFactory {

    public Robot createRobot(char type){
        if (type == 'A') {
            return new RobotA();
        }
        if (type == 'B') {
            return new RobotB();
        }
        return null;
    }
}
