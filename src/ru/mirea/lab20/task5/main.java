package ru.mirea.lab20.task5;

public class main {
    public static void main(String[] args) {
    Integer[][] matrixData1 = { { 2, 4, 6 }, { 8, 10, 12 }, { 14, 16, 18 } };
    Integer[][] matrixData2 = { { 18, 16, 14 }, { 12, 10, 8 }, { 6, 4, 2 } };

    matrix<Integer> matrix1 = new matrix<>(3, 3, matrixData1);
    matrix<Integer> matrix2 = new matrix<>(3, 3, matrixData2);

    System.out.println("matrix 1:");
    matrix1.printMatrix();

    System.out.println("matrix 2:");
    matrix2.printMatrix();

    System.out.println("Sum of matrices:");
    matrix1.add(matrix2).printMatrix();

    System.out.println("Product of matrices:");
    matrix1.multiply(matrix2).printMatrix();
    }
}