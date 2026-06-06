public class numberSpiral {

  public static void printPat(int n) {
    // Upper half
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int j = 0; j < 2 * i - 1; j++) {
        System.out.print(" ");
      }
      if (i > 0)
        System.out.print("*");
      System.out.println();
    }

    // Lower half
    for (int i = n - 2; i >= 0; i--) {
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int j = 0; j < 2 * i - 1; j++) {
        System.out.print(" ");
      }
      if (i > 0)
        System.out.print("*");
      System.out.println();
    }
  }

  public static void printPat2(int n) {
     // Outer loop for rows
    for (int i = 0; i < 2 * n - 1; i++) {

      int comp;
      if (i < n)
        comp = 2 * (n - i) - 1;
      else
        comp = 2 * (i - n + 1) + 1;

      // Print leading spaces
      for (int j = 0; j < comp; j++)
        System.out.print(" ");

      // Print stars and inner spaces
      for (int k = 0; k < 2 * n - comp; k++) {
        if (k == 0 || k == 2 * n - comp - 1)
          System.out.print("* ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
  }
  
  public static boolean isArmstrong(int n) {
    int temp = n;
    int sum = 0;
    while (temp > 0) {
      int rem = temp % 10;
      sum += rem * rem * rem;
      temp /= 10;
    }
    return sum == n;
  }
  public static void main(String[] args) {
    System.out.println(isArmstrong(153));
    System.out.println(isArmstrong(123));
    
  }
}
