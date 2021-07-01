/*
    Author: Yipeng Liu
    Project: Assignment 1
    Class: Matrix
    Date: 06/15/2021
 */
package edu.sjsu.assignment1;

import java.util.Arrays;

public class Matrix {
    private int[][] matrix;

    /**
     * The constructor takes a 2-d integer array.
     *
     * @param inputMatrix a 2-d integer array
     */
    public Matrix(int[][] inputMatrix) {
        this.matrix = new int[inputMatrix.length][inputMatrix[0].length];
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                this.matrix[i][j] = inputMatrix[i][j];
            }
        }
    }

    /**
     * The {@code multiply} method takes another Matrix as a parameter,
     * computes the matrix multiplication (between the current Matrix
     * and the parameter Matrix), and returns the resulting Matrix.
     *
     * @param otherMatrix a {@code Matrix}
     * @return result a {@code Matrix}
     */
    public Matrix multiply(Matrix otherMatrix) {
        if (otherMatrix.getMatrix().length != this.matrix[0].length) {
            return null;
        }
        int resultRows = this.matrix.length;
        int resultColumns = otherMatrix.getMatrix()[0].length;
        int[][] tempResult = new int[resultRows][resultColumns];
        // Populating tempResult
        for (int i = 0; i < resultRows; i++) {
            for (int j = 0; j < resultColumns; j++) {
                // Getting the sum for tempResult[i][j]
                int sum = 0;
                for (int s = 0; s < this.matrix[i].length; s++) {
                    sum += this.matrix[i][s]
                            * otherMatrix.getMatrix()[s][j];
                }
                tempResult[i][j] = sum;
            }
        }
        return new Matrix(tempResult);
    }

    public int[][] getMatrix(){
        return this.matrix;
    }

    public static void printMatrix(Matrix inputMatrix) {
        int rows = inputMatrix.getMatrix().length;
        int columns = inputMatrix.getMatrix()[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(inputMatrix.getMatrix()[i][j]);
                if (j < columns - 1) {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
