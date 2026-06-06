import java.util.Scanner;

public class quadrant {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter X co-odinate: ");
    int x = sc.nextInt();
    System.out.print("Enter Y co-odinate: ");
    int y = sc.nextInt();
    if(x > 0 && y > 0) {
      System.out.println("("+x+","+y+") is in first Quadrant");
    } else if(x < 0 && y > 0)  {
      System.out.println("("+x+","+y+") is in second Quadrant");
    } else if(x < 0 && y < 0)  {
      System.out.println("("+x+","+y+") is in third Quadrant");
    } else if(x > 0 && y < 0)  {
      System.out.println("("+x+","+y+") is in fourth Quadrant");
    } else {
      System.out.println("Not record found");
    }
  }
}
