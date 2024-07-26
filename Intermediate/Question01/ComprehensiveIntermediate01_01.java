package Question01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComprehensiveIntermediate01_01 {
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);

      System.out.print("整数を入力してください＞");
      int num = sc.nextInt();

      if (num % 2 == 0) {
        System.out.println("even");
      } else {
        System.out.println("odd");
      }

    } catch (InputMismatchException e) {
      System.out.println("整数を入力してください。");
    }

  }

}
