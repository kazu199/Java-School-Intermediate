package Question01;

import java.util.Scanner;

public class ComprehensiveIntermediate01_02 {
  public static void main(String[] args) {

    System.out.println("整数を3つ入力してください");
    System.out.print(">");
    int num1 = new java.util.Scanner(System.in).nextInt();
    System.out.print(">");
    int num2 = new java.util.Scanner(System.in).nextInt();
    System.out.print(">");
    int num3 = new java.util.Scanner(System.in).nextInt();

    if (num1 <= num2 && num2 <= num3) {
      System.out.println("OK");
    } else {
      System.out.println("NG");
    }
  }
}
