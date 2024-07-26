package Lesson15;

import java.util.TreeSet;

public class Practice15_02 {
  public static void main(String[] args) {

    TreeSet<String> arr = new TreeSet<>();

    arr.add("kubo");
    arr.add("mitoma");
    arr.add("kamada");
    arr.add("kamada");

    for (String out : arr) {
      System.out.println(out);
    }

  }
}