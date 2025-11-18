public class Matrix {
  private int[][] matrix;
  private int size;

  public Matrix(int size) {
    this.size = size;
    matrix = new int[size][size];
    System.out.println("Your matrix is created with dimensions: " + size + " x "
                      + size);
  }

  private void swap(int x1, int y1, int x2, int y2) {
    int temp = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = temp;
  }

  public void populateMatrix() {
    int value = 1;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        matrix[i][j] = value++;
      }
    }
  }

  public void printMatrix() {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (j == size - 1 - i) {
          System.out.print("\u001B[33m" + matrix[i][j] + "\u001B[0m\t");
        } else {
          System.out.print(matrix[i][j] + "\t");
        }
      }
      System.out.println();
    }
  }
  public void flipMatrix() {
    int num = size;

    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num - i -1; j++) {
        int x2 = num - 1 - j;
        int y2 = num - 1 - i;

        if (j == num - 1 - i || (i == y2 && j == x2)) {
          continue;
        }
        swap(i, j, y2, x2);
      }
    }
  }
}
