package ru.mirea.lab20.task5;

import java.util.Arrays;
public class matrix<T extends Number> {
    private final int numRows;
    private final int numCols;
    private final T[][] elements;

    // Constructor for creating a matrix
    public matrix(int numRows, int numCols, T[][] data) {
        this.numRows = numRows;
        this.numCols = numCols;
        this.elements = data;
    }

    // Addition of matrices
    public matrix<T> add(matrix<T> other) {
        if (this.numRows != other.numRows || this.numCols != other.numCols) {
            throw new IllegalArgumentException("Matrices should have the same dimensions for addition.");
        }

        T[][] result = Arrays.copyOf(this.elements, numRows);
        for (int i = 0; i < numRows; i++) {
            result[i] = Arrays.copyOf(this.elements[i], numCols);
            for (int j = 0; j < numCols; j++) {
                result[i][j] = addElements(this.elements[i][j], other.elements[i][j]);
            }
        }
        return new matrix<>(numRows, numCols, result);
    }

    // Multiplication of matrices
    public matrix<T> multiply(matrix<T> other) {
        if (this.numCols != other.numRows) {
            throw new IllegalArgumentException("Matrices must have compatible dimensions for multiplication.");
        }

        T[][] result = (T[][]) new Number[this.numRows][other.numCols];
        for (int i = 0; i < this.numRows; i++) {
            for (int j = 0; j < other.numCols; j++) {
                result[i][j] = multiplyElements(i, j, other);
            }
        }
        return new matrix<>(this.numRows, other.numCols, result);
    }

    // Addition of elements
    private <T extends Number> T addElements(T a, T b) {
        double sum = a.doubleValue() + b.doubleValue();

        if (a instanceof Integer) {
            return (T) Integer.valueOf((int) sum);
        } else if (a instanceof Double) {
            return (T) Double.valueOf(sum);
        } else if (a instanceof Float) {
            return (T) Float.valueOf((float) sum);
        } else if (a instanceof Long) {
            return (T) Long.valueOf((long) sum);
        } else if (a instanceof Short) {
            return (T) Short.valueOf((short) sum);
        } else if (a instanceof Byte) {
            return (T) Byte.valueOf((byte) sum);
        }

        throw new IllegalArgumentException("Unsupported number type");
    }

    // Multiplication of elements
    private T multiplyElements(int row, int col, matrix<T> other) {
        double sum = 0;
        for (int i = 0; i < this.numCols; i++) {
            sum += ((Number) this.elements[row][i]).doubleValue() * ((Number) other.elements[i][col]).doubleValue();
        }
        return (T) ((Number) sum);
    }

    // Print the matrix
    public void printMatrix() {
        for (T[] row : this.elements) {
            for (T element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
