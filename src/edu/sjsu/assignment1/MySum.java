/*
    Author: Yipeng Liu
    Project: Assignment 1
    Class: MySum
    Date: 06/15/2021
 */
package edu.sjsu.assignment1;

public class MySum {

    /**
     * A public static function that takes an integer array and returns
     * the alternating sum (an integer) of all elements in the array.
     *
     * @param array an array of integers
     */
    public static int getAlternatingSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                // if i is even: 0, 2, 4, etc., add the number
                // at index i to sum
                sum += array[i];
            } else {
                // if i is odd, subtract the number
                // from the sum
                sum -= array[i];
            }
        }
        return sum;
    }
}
