package Lesson12;

public class Practice12_01 {
  public static void main(String[] args) {

    int x = 10;
    int y = 7;

    int min = minDown(x, y);

    System.out.println("min = " + min);
  }

  private static int minDown(int x, int y) {
    return x - y;
  }
}
