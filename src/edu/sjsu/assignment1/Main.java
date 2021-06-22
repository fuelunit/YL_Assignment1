/*
    Author: Yipeng Liu
    Project: Assignment 1
    Class: Main
    Date: 06/17/2021
 */
package edu.sjsu.assignment1;

public class Main {
    public static void main(String[] args) {
        // MyTime
        MyTime.printTimeDifference("0120", "1510");
        MyTime.printTimeDifference("1635", "0250");
        MyTime.printTimeDifference("1820", "1810");
        MyTime.printTimeDifference("1810", "1820");
        MyTime.printTimeDifference("1810", "1810");
        // Card
        Card card1 = new Card("10S");
        String fullDescription = card1.getDescription();
        System.out.println(fullDescription);
        Card card2 = new Card("QC");
        fullDescription = card2.getDescription();
        System.out.println(fullDescription);
        Card card3 = new Card("11H");
        fullDescription = card3.getDescription();
        System.out.println(fullDescription);
        // MySum
        int result = MySum.getAlternatingSum(new int[]{1, 4, 9, 16, 9, 7, 4, 9, 11});
        System.out.println(result);
        result = MySum.getAlternatingSum(new int[]{4, 2, 3, 4, 5, 6});
        System.out.println(result);
        // Matrix
        int[][] array1 = new int[][]{{2, 4}, {3, 4}};
        int[][] array2 = new int[][]{{1, 2}, {1, 3}};
        Matrix matrix1 = new Matrix(array1);
        Matrix matrix2 = new Matrix(array2);
        Matrix resultMatrix = matrix1.multiply(matrix2);
        int[][] resultArray = resultMatrix.getMatrix();
        Matrix.printMatrix(resultMatrix);
        int[][] array3 = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] array4 = new int[][]{{7, 8}, {9, 10}, {11, 12}};
        Matrix matrix3 = new Matrix(array3);
        Matrix matrix4 = new Matrix(array4);
        Matrix resultMatrix2 = matrix3.multiply(matrix4);
        int[][] resultArray2 = resultMatrix2.getMatrix();
        Matrix.printMatrix(resultMatrix2);
    }
}
