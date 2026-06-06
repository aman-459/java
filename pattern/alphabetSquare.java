import java.util.Scanner;

public class alphabetSquare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of column: ");
    int c = sc.nextInt();
    System.out.print("Enter number of rows: ");
    int r = sc.nextInt();
    for(int i = 1; i <= r; i++) {
      for(int j = 1; j <= c; j++) {
        System.out.print((char)(64+j)+" ");
        //System.out.print((char)(96+j)+" "); // for small letter
      }
      System.out.println();
    }
  }
}
