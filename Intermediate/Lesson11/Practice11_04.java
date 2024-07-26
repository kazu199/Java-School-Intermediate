package Lesson11;

import java.util.Scanner;

public class Practice11_04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputNum = 0;

    int x = 5; // 横軸

    // 段数を入力（5以上はもう一度）
    do {
      System.out.print("何段>");
      inputNum = sc.nextInt();
    } while (inputNum > 5);

    // 座標処理
    for (int i = 1; i <= inputNum; i++) { // 縦
      for (int j = 1; j <= 6; j++) { // 横
        if (j < x) { // 空白
          System.out.print(" ");
        } else if (j <= 5) { // アスタリスク
          System.out.print("*");
        } else if (j <= 6) { // 改行
          System.out.println();
          x--;
        }
      }
    }
  }
}
