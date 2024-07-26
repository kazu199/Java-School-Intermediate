package Lesson11;

public class Lesson11_03 {
  public static void main(String[] args) {
    int i = 0;
    do {
      System.out.println((i + 1) + "回目の処理です");
      i++;
    } while (i > 100); // iが100より大きかったら続ける
    System.out.println("処理が終了しました");
  }
}
