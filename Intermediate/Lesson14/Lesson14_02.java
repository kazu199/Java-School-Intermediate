package Lesson14;

public class Lesson14_02 {
  public static void main(String[] args) {

    try {
      calcTest();
    } catch (ArithmeticException e) {
      System.out.println("0では除算はできません。");
    }
    System.out.println("処理終了");
  }

  static void calcTest() {
    int num = 10 / 0;

    System.out.println("10/0の結果は " + num);
  }
}
