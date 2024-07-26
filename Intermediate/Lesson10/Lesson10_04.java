package Lesson10;

import java.util.Random;

public class Lesson10_04 {
  public static void main(String[] args) {
    System.out.println("今日のごみ回収の種類は");

    int day = new Random().nextInt(7) + 1;

    switch (day) {
      case 1, 3, 5 -> System.out.println("燃えないゴミの日です。");
      case 2 -> System.out.println("燃えないゴミの日です。");
      case 4 -> System.out.println("プラスチックゴミの日です。");
      case 6 -> System.out.println("びん、缶ごみの日です。");
      default -> System.out.println("ゴミの回収はありません。");
    }
  }
}
