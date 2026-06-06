import java.util.*;
public class square {
  public static void main (String agrs[]) {
    System.out.print("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    System.out.println("Square of "+l+" is: "+(l*l));
  }
}