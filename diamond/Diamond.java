import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Diamond example");
    System.out.print("Please enter in a positive integer: ");
    int userInput = scanner.nextInt();

    if (userInput %2 == 0) {
    } else {
      int asterisks = 1;
      int spaces = (userInput - 1)/2;
      for (int i = 0; i <= userInput-2; i = i + 2){
        int spacesTopRows = spaces;
        int asterisksTopRows = asterisks;
        while (spacesTopRows > 0){
          System.out.print(" ");
          spacesTopRows--;
        }
        while (asterisksTopRows > 0){
          System.out.print("*");
          asterisksTopRows--;
          }
        System.out.println("");
        asterisks = asterisks + 2;
        spaces--;
      }
      int asterisksMiddleRow = asterisks;
      while (asterisksMiddleRow > 0) {
        System.out.print("*");
        asterisksMiddleRow--;
      }
      asterisks = asterisks - 2;
      spaces++;
      System.out.println("");
      for (int i = 0; i <= userInput-2; i = i + 2){
        int spacesBottomRows = spaces;
        int asterisksBottomRows = asterisks;
        while (spacesBottomRows > 0){
          System.out.print(" ");
          spacesBottomRows--;
        }
        while (asterisksBottomRows > 0){
          System.out.print("*");
          asterisksBottomRows--;
          }
        System.out.println("");
        asterisks = asterisks - 2;
        spaces++;
      }
    }



    scanner.close();
  }
}
