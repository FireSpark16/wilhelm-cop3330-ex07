/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package Ex07.base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        final double factor = 0.09290304;
        int length = myApp.getLength();
        int width = myApp.getWidth();
        int resultF = myApp.calculateF(length, width);
        double resultM = myApp.calculateM(resultF, factor);

        myApp.output(length, width, resultF, resultM);
    }

    private void output(int length, int width, int resultF, double resultM) {
        System.out.print("You entered dimensions of " + length + " by " + width + " feet. \nThe area is\n" + resultF + " square feet\n" + resultM + " square meters");
    }

    private double calculateM(double resultF, double factor) {
        return Math.round((resultF * factor) * 1000.0) / 1000.0;
    }

    private int calculateF(int length, int width) {
        return length * width;
    }


    private int getLength() {
        System.out.print("What is the length of the room in feet? ");
        return Integer.parseInt(in.nextLine());
    }

    private int getWidth() {
        System.out.print("What is the width of the room in feet? ");
        return Integer.parseInt(in.nextLine());
    }
}