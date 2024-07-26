package Lesson10;

import java.util.Random;

public class Lesson10_03 {
  public static void main(String[] args) {
    System.out.println("赤ちゃんの性別は");
    int gender = new Random().nextInt(4) + 1;

    switch (gender) {
      case 1:
      case 2:
        System.out.println("女の子です。");
        break;
      case 3:
        System.out.println("男の子です。");
        break;
      default:
        System.out.println("特定できません。");
        break;
    }
  }

}