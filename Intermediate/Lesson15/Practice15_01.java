package Lesson15;

import java.util.ArrayList;

public class Practice15_01 {
  public static void main(String[] args) {

    ArrayList<String> arr = new ArrayList<>();

    arr.add("kubo");
    arr.add("mitoma");
    arr.add("kamada");
    arr.add("kamada");

    for (String out : arr) {
      System.out.println(out);
    }

    /*
     * System.out.println(arr.get(0));
     * System.out.println(arr.get(1));
     * System.out.println(arr.get(2));
     * System.out.println(arr.get(3));
     */
  }
}
