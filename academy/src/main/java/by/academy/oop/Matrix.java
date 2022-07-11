package by.academy.oop;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
//	3.	Создать класс "Матрица". Класс должен иметь следующие поля:
//		1) двумерный массив вещественных чисел;
//		2) количество строк и столбцов в матрице.
//
//		Класс должен иметь следующие методы:
//		1) сложение с другой матрицей;
//		2) умножение на число;
//		3) вывод на печать; 
//		4) умножение матриц - по желанию.
	int[][] matrix;
	int rows;
	int columns;

	public Matrix() {

	}

	public Matrix(int rows, int columns) {
		matrix = new int[rows][columns];
		this.rows = rows;
		this.columns = columns;

	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getRows() {
		return rows;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public int getColumns() {
		return columns;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void fill() {
		Random rand = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(-10, 10);
			}
		}
		System.out.println(Arrays.deepToString(matrix));
	}

	public void sumMatrix() {
		int sum = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sum += matrix[i][j];
			}

		}
		System.out.println("Sum of matrix elements: " + sum);
	}

	public void multiply(int m) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] *= m;
			}
		}
		System.out.println(Arrays.deepToString(matrix));
	}

	public Matrix matrixAddition(Matrix matrix1, Matrix matrix2) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix1.matrix[i][j] = matrix1.matrix[i][j] + matrix2.matrix[i][j];
			}
		}
		System.out.println("Matrix addition: " + Arrays.deepToString(matrix));
		return matrix1;
	}

	public Matrix matrixMultiplication(Matrix matrix3, Matrix matrix4) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix3.matrix[i][j] = matrix3.matrix[i][j] * matrix4.matrix[i][j];
			}
		}
		System.out.println("Matrix multiplication: " + Arrays.deepToString(matrix));
		return matrix3;

	}

}