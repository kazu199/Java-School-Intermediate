package Lesson10;

import java.util.Random;

class Lesson10_02 {
  public static void main(String[] args) {
    System.out.println("あなたの運勢を占います。");
    int fortune = new Random().nextInt(4) + 1;

    switch (fortune) {
      case 1:
        System.out.println("大吉");
        break;
      case 2:
        System.out.println("中吉");
        break;
      case 3:
        System.out.println("吉");
        break;
      case 4:
        System.out.println("凶");
        break;
    }
  }
}
