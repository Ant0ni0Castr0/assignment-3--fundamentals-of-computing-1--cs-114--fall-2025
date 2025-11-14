import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Diamond example");
    System.out.print("Please enter in a positive integer: ");

    int userInput = scanner.nextInt();

    if (userInput <= 1){
      System.out.println("We can't make a diamond with that number.");
    } else if (userInput %2 == 0) {
      int asterisks = 2;
      int spaces = userInput-1;

      System.out.println();

      for (int i = spaces; i >= 0; i--){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
      spaces--;

      for (int i = 0; i <= userInput-2; i += 2){
        int spacesTopRows = spaces;
        int asterisksTopRows = asterisks;

        while (spacesTopRows > 0){
          System.out.print(" ");
          spacesTopRows--;
        }
        while (asterisksTopRows > 0){
          System.out.print(" *");
          asterisksTopRows--;
          }
        System.out.println();
        asterisks += 2;
        spaces -= 2;
      }
      asterisks -= 4;
      spaces += 4;

      for (int i = 0; i < userInput-2; i += 2){
        int spacesBottomRows = spaces;
        int asterisksBottomRows = asterisks;

        while (spacesBottomRows > 0){
          System.out.print(" ");
          spacesBottomRows--;
        }
        while (asterisksBottomRows > 0){
          System.out.print(" *");
          asterisksBottomRows--;
          }
        System.out.println();
        asterisks -= 2;
        spaces += 2;
      }
      for (int i = spaces; i > 0; i--){
        System.out.print(" ");
      }
      System.out.print("*");
    } else if (userInput <= 0){
      System.out.println("We can't make a diamond with that number.");
    } else {
      int asterisks = 1;
      int spaces = (userInput - 1)/2;

      for (int i = 0; i < userInput; i += 2){
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
        System.out.println();
        asterisks += 2;
        spaces--;
      }
      asterisks -= 4;
      spaces += 2;

      for (int i = 0; i <= userInput-2; i += 2){
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
        System.out.println();
        asterisks -= 2;
        spaces++;
      }
    }
    scanner.close();
  }
}
