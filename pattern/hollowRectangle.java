import java.util.Scanner;

public class hollowRectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a length of rectangle: ");
    int l = sc.nextInt();
    System.out.print("Enter a breadth of recatangle: ");
    int b = sc.nextInt();
    for(int i = 1; i <= b; i++) {
      for(int j = 1; j <= l; j++) {
        if(i == 1 || j == 1 || i == b || j == l) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
