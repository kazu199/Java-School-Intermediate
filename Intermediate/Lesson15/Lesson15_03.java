package Lesson15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lesson15_03 {
  public static void main(String[] args) {

    List<String> list = new ArrayList<String>();

    list.add("C");
    list.add("C");
    list.add("B");
    list.add("A");

    Set<String> set = new HashSet<String>(list);

    System.out.println(set);
  }
}
