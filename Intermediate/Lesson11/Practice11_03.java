package Lesson11;

import java.util.Random;

public class Practice11_03 {
  public static void main(String[] args) {
    int i = 0;

    while (i < 10) {
      i++;
      int num = new Random().nextInt(6) + 1;
      if (num % 2 != 0) {
        System.out.println(i + "回目、" + num + "が出ました");
        continue;
      }
    }
  }
}
