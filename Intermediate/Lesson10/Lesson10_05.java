package Lesson10;

import java.util.Random;

public class Lesson10_05 {
  public static void main(String[] args) {
    int day = new Random().nextInt(7) + 1;

    System.out.println(
        switch (day) {
          case 1, 3, 5 -> "燃えないゴミの日です。";
          case 2 -> "燃えるゴミの日です。";
          case 4 -> "プラスチックごみの日です。";
          case 6 -> "ビン、缶ごみの日です。";
          default -> "ゴミの回収はありません。";
        });
  }
}
