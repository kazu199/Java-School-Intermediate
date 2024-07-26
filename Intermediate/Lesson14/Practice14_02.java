package Lesson14;

import java.util.Random;

public class Practice14_02 {
  public static void main(String[] args) {
    try {
      int intRan = new Random().nextInt(2);
      switch (intRan) {
        case 0:
          int num = 10 / 0;
          System.out.println(num);
          break;
        case 1:
          String nullp = null;
          System.out.println(nullp.length());
          break;
      }
    } catch (ArithmeticException e) {
      System.out.println("例外処理をキャッチしました。"); // 0の場合
    } catch (NullPointerException e) {
      System.out.println("ぬるぽをキャッチしました。"); // 1の場合
    } finally {
      System.out.println("finally 計算終了");
    }
    System.out.println("処理終了");
  }
}
