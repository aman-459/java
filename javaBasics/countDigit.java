import java.util.Scanner;

public class countDigit {
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int count = 0;
    if(num > 0) {
      while (num > 0) {
      num /= 10;
      count ++;
      }
    } else {
      while (num < 0) {
      num /= 10;
      count ++;
      }
    }
    System.out.println(count);
  }
}
