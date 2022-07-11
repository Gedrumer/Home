package by.academy.oop;

public class MatrixTest {

	public static void main(String[] args) {
		Matrix matrix = new Matrix(4, 5);
		Matrix matrix2 = new Matrix(4, 5);
		matrix.fill();
		matrix2.fill();
		matrix.sumMatrix();
		matrix.multiply(10);
		matrix.matrixAddition(matrix, matrix2);
		matrix.matrixMultiplication(matrix, matrix2);

	}

}
