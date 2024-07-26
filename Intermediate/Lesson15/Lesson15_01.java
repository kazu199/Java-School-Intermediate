package Lesson15;

import java.util.HashSet;
import java.util.Set;

public class Lesson15_01 {
  public static void main(String[] args) {
    Set<Integer> hs = new HashSet<Integer>();

    hs.add(1);
    hs.add(2);
    hs.add(3);
    hs.add(2);
    hs.add(null);
    hs.add(4);
    hs.remove(3);

    System.out.println(hs);

  }
}
