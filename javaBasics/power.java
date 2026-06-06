import java.util.Scanner;

public class power {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter base: ");
    int b = sc.nextInt();
    System.out.print("Enter power: ");
    int p = sc.nextInt();
    int num = 1;
    for(int i = 1; i <= p; i++) {
      num *= b;
    }
    System.out.println(num);
  }
}
