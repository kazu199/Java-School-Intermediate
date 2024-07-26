package Lesson10;

import java.util.Random;

public class Practice10_03 {
  public static void main(String[] args) {
    int age = new Random().nextInt(21);
    int gender = new Random().nextInt(2);
    int swbox;
    String langAge = "a";
    String langGen = "b";

    if (age <= 3) {
      // baby
      swbox = 1;
    } else if (3 < age && age < 6) {
      // child
      swbox = 2;
    } else if (6 <= age && age < 18) {
      // kid
      swbox = 3;
    } else {
      // adult
      swbox = 4;
    }

    switch (gender) {
      case 0:
        langGen = "男";
        break;
      case 1:
        langGen = "女";
        break;
    }
    switch (swbox) {
      case 1:
        langAge = "baby";
        break;
      case 2:
        langAge = "child";
        break;
      case 3:
        langAge = "kid";
        break;
      case 4:
        langAge = "adult";
        break;
    }
    System.out.print("あなたは" + langAge + "な" + langGen + "です");
  }
}
