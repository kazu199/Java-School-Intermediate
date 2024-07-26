package Question01;

public class ComprehensiveIntermediate01_05 {
  public static void main(String[] args) {
    int num;

    for (int x = 1; x <= 9; x++) {
      for (int y = 1; y <= 9; y++) {
        num = x * y;
        if (y < 9) {
          System.out.print(num + "　");
        } else {
          System.out.println(num + "　");
        }
      }
    }
  }

}
