import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Pick an option:\n a) Calculate area of the circle or\n b) Calculate area of the square");
    String letter = sc.next();

    if (letter.equals("a")) {
      System.out.println("Insert the radius of the circle");
      double radius = sc.nextDouble();
      if (radius <= 0) {
        System.out.println("Error. The radius of the square is negative or 0");
      } else {
        System.out.println("The area is: " + 3.14 * radius * radius);
      }
      if (letter.equals("b")) {
        System.out.println("Insert the value of one side of the square");
        double side1 = sc.nextDouble();
        System.out.println("Insert the value of other side of the square");
        double side2 = sc.nextDouble();
        if (side1 <= 0 || side2 <= 0) {
          System.out.println("Error. The sides of the square must be positive");
        } else {
          System.out.println("The area is: " + side1 * side2);
        }
      }
    }
  }
}