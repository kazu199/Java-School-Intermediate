package Question02;

import java.util.Random;
import java.util.Scanner;

public class ComprehensiveIntermediate02_03 {
  public static void main(String[] args) {

    System.out.println("ゾロ目で大当たり！チャンスは30回");
    System.out.print("beginと入力してください>");

    Scanner sc = new Scanner(System.in, "Shift-JIS");

    String begin = sc.next();

    if (begin.equals("begin")) {
      for (int i = 1; i <= 30; i++) {
        int num1 = new Random().nextInt(9 + 1);
        int num2 = new Random().nextInt(9 + 1);
        int num3 = new Random().nextInt(9 + 1);
        System.out.println(i + "回目：" + num1 + num2 + num3);
        if (num1 == num2 && num2 == num3) {
          System.out.println(i + "回目で大当たりです。おめでとうございます！");
          break;
        } else if (30 <= i) {
          System.out.println("残念でした。終わります。");
        }
      }
    } else {
      System.out.println("正しく入力してください。");
    }

  }

}
