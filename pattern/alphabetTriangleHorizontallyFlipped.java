import java.util.Scanner;

public class alphabetTriangleHorizontallyFlipped {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = sc.nextInt();
    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= n+1-i; j++) {
        //System.out.print((char)(96+j)+" ");
        //System.out.print((char)(64+j)+" ");
        System.out.print((char)(64+i)+" ");
      }
      System.out.println();
    }
  }
}
