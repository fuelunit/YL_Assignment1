/*
    Author: Yipeng Liu
    Project: Assignment 1
    Class: Main
    Date: 06/17/2021
 */
package edu.sjsu.assignment1;

public class Main {
    public static void main(String[] args) {
        MyTime.printTimeDifference("0120", "1510");
        MyTime.printTimeDifference("1635", "0250");
        MyTime.printTimeDifference("1820", "1810");
        Card card1 = new Card("10S");
        String fullDescription = card1.getDescription();
        System.out.println(fullDescription);
        Card card2 = new Card("QC");
        fullDescription = card2.getDescription();
        System.out.println(fullDescription);
        Card card3 = new Card("11H");
        fullDescription = card3.getDescription();
        System.out.println(fullDescription);
    }
}
