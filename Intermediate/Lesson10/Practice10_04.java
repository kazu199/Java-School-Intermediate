package Lesson10;

import java.util.Random;

public class Practice10_04 {
  public static void main(String[] args) {
    int color = new Random().nextInt(5) + 1;
    String lang = "a";

    switch (color) {
      case 1:
        lang = "ピンク";
        break;
      case 2, 3, 4:
        lang = "レッド";
        break;
      case 5:
        lang = "ゴールド";
        break;
    }

    System.out.println("今日のラッキーカラーは" + lang + "です");
  }
}
