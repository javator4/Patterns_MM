package com.sda.factory;

public class App {

    public static void main(String[] args) {

        RobotFactory robotFactory = new RobotFactory();
        robotFactory.createRobot('A').work();
        robotFactory.createRobot('B').work();

    }
}
