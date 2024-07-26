package Question02;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ComprehensiveIntermediate02_04 {
  public static void main(String[] args) {

    boolean flg = false;
    int my = 0;

    // 相手の手
    int opponent = new Random().nextInt(2);

    // 自分の手
    do {
      try {
        Scanner sc = new Scanner(System.in);
        System.out.println("ジャンケン");
        System.out.println("0:グー 1:チョキ 2: パー ＞数字を入力してください");
        my = sc.nextInt();

        // 入力判定
        if (3 <= my) {
          System.out.println("上記以外の数字が入力されました。");
          flg = true;
          continue;
        } else if (my < 0) {
          System.out.println("上記以外の数字が入力されました。");
          flg = true;
          continue;
        } else {
          flg = false;
        }

      } catch (InputMismatchException e) {
        System.out.println("上記以外の数字が入力されました。");
        continue;
      }
    } while (flg);

    // 確認
    System.out.println();
    System.out.println("あなた:" + my);
    System.out.println("相手:" + opponent);
    System.out.println();

    // 判定
    if (my == 2) { // 2 ->
      if (opponent == 0) { // 2 -> 0
        System.out.println("あなたの勝ちです");
      } else if (my == opponent) { // 2 == 2
        System.out.println("あいこです");
      } else if (opponent < my) { // 2 -> 1
        System.out.println("あなたの負けです");
      }
    } else if (my < opponent) {
      System.out.println("あなたの勝ちです");
    } else if (opponent < my) {
      System.out.println("あなたの負けです");
    } else {
      System.out.println("あいこです");
    }

  }
}
