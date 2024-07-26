package Lesson11;

public class Lesson11_01 {
  public static void main(String[] args) {
    int i = 0;
    while (i > -1) { // iが-1より大きかったら
      if (i > 10) { // iが10より大きかったら
        break;
      } else if (i % 2 == 0) { // iを2で割った余りが0だったら
        i++;
        continue;
      }
      System.out.println((i + 1) + "回目の処理です");
      i++;
    }
    System.out.println("処理が終了しました");
  }
}
