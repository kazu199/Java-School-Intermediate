package Lesson14;

public class Lesson14_03 {
  public static void main(String[] args) {

    try {
      int[] intArray = new int[5];
      intArray[9] = 10;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("配列の要素を超えています。");
    } finally {
      System.out.println("計算終了");
    }
    System.out.println("処理終了");
  }
}
