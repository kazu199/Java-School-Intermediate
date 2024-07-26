package Question01;

import java.util.Scanner;

public class ComprehensiveIntermediate01_03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("3つの係数を入力してください。");
    System.out.println("ax^2 + bx + c = 0");
    System.out.print("係数a : ");
    int a = sc.nextInt();
    System.out.print("係数b : ");
    int b = sc.nextInt();
    System.out.print("係数c : ");
    int c = sc.nextInt();

    System.out.println(a + "x^2 " + "+ " + b + "x " + "+ " + c + " = " + 0 + " の解は");

    System.out.println("判別式 : D = b^2 - 4ac へ代入すると");
    System.out.print("D =");
    double D = b * b - (4 * a * c);
    System.out.print(D + " のため、");

    if (D > 0) {
      System.out.print("「実数解」です。");
    } else if (D == 0) {
      System.out.print("「重解」です。");
    } else if (D < 0) {
      System.out.print("「虚数解」です。");
    }

  }

}
