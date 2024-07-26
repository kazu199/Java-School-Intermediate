package Question01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComprehensiveIntermediate01_04 {
  public static void main(String[] args) {
    try {
      int peple;

      System.out.print("人数を入力してください＞");
      int num = new java.util.Scanner(System.in).nextInt();

      // 人数処理
      if (num < 5) {
        peple = 1;
      } else if (5 <= num && num < 20) {
        peple = 2;
      } else {
        peple = 3;
      }

      // 料金計算
      switch (peple) {
        case 1:
          System.out.println("料金は" + num * 600 + "円です。");
          break;
        case 2:
          System.out.println("料金は" + num * 550 + "円です。");
          break;
        case 3:
          System.out.println("料金は" + num * 500 + "円です。");
          break;
      }
    } catch (InputMismatchException e) {
      System.out.println("整数を入力してください。");
    }
  }
}
