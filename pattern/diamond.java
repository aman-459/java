import java.util.Scanner;

public class diamond {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for(int j = 1; j <= n+i-1; j++) {
        if((i+j) > n) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      } 
      System.out.println();
    }
    for (int i = n-1; i >= 1; i--) {
      for(int j = n-i; j >= 1; j--) { 
         System.out.print("  ");
      } 
      for(int j = 1; j <= 2*i-1; j++) { 
         System.out.print("* ");
      } 
      System.out.println();
    }
  }
}

// correct it 
