import java.util.Scanner;

public class reverse {
    public static void main(String agrs[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int rev = 0;
    if (n > 0) {
      while (n > 0) {
        rev = rev * 10 + (n % 10);
        n /= 10;
      }
    } else {
      while (n < 0) {
        rev = rev * 10 + (n % 10);
        n /= 10;
      }
    }
    System.out.println(rev);
  }
}
