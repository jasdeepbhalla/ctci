package Question1_6;

import CtCILibrary.*;

public class Question {

	public static void rotate(int[][] matrix, int n) {
		for (int layer = 0; layer < n / 2; ++layer) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; ++i) {
				int offset = i - first;
			
				int top = matrix[first][i]; // save top

				// left -> top
				matrix[first][i] = matrix[last-offset][first]; 	
				//System.out.println();
				//AssortedMethods.printMatrix(matrix);

				// bottom -> left
				matrix[last-offset][first] = matrix[last][last - offset]; 
				//System.out.println();
				//AssortedMethods.printMatrix(matrix);

				// right -> bottom
				matrix[last][last - offset] = matrix[i][last]; 
				//System.out.println();
				//AssortedMethods.printMatrix(matrix);

				// top -> right
				matrix[i][last] = top; // right <- saved top
				//System.out.println();
				//AssortedMethods.printMatrix(matrix);
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = AssortedMethods.randomMatrix(3, 3, 0, 5);
		AssortedMethods.printMatrix(matrix);
		rotate(matrix, 3);
		System.out.println();
		AssortedMethods.printMatrix(matrix);
	}

}
