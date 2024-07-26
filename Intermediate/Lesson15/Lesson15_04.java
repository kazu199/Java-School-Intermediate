package Lesson15;

import java.util.HashMap;
import java.util.Map;

public class Lesson15_04 {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();

    map.put("リンゴ", 80);
    map.put("オレンジ", 120);
    map.put("ブドウ", 90);

    System.out.println(map.size()); // 3

    map.remove("オレンジ");
    System.out.println(map.size()); // 2

    map.clear();
    System.out.println(map.size()); // 0
  }
}
