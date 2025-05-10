package Day5;

public class pattern7 {
    public static void main(String[] args) {
        int n = 5;
          for (int i = 1; i <= n; i++) {
              printStars(i);
          }
          for (int i = n - 1; i >= 1; i--) {
              printStars(i);
          }
      }
      public static void printStars(int count) {
          for (int i = 0; i < count; i++) {
              System.out.print("* ");
          }
          System.out.println();
    }
    
}
