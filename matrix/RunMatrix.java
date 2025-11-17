import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Matrix example");
    System.out.print("Please enter in the size of the matrix: ");
    int size = scanner.nextInt();

    Matrix matrix = new Matrix(size);
    System.out.println("Printing matrix with defualt values: ");
    matrix.printMatrix();

    System.out.println("Populating matrix...matrix populated");
    matrix.populateMatrix();

    System.out.println("Priting Matrix: ");
    matrix.printMatrix();

    System.out.println("Flipping matrix...matrix flipped");
    matrix.flipMatrix();

    System.out.println("Printing flipped Matrix: ");
    matrix.printMatrix();

    scanner.close();
  }
}
