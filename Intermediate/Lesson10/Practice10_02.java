package Lesson10;

import java.util.Random;

public class Practice10_02 {
  public static void main(String[] args) {
    int age = new Random().nextInt(21);

    int a = 0;

    if (age <= 3) {
      a = 1;
    } else if (age > 3 && age < 18) {
      a = 2;
    } else if (18 <= age) {
      a = 3;
    }

    switch (a) {
      case 1:
        System.out.println("あなたはbabyです");
        break;
      case 2:
        System.out.println("あなたはkidです");
        break;
      case 3:
        System.out.println("あなたはadlutです");
        break;
    }
  }
}