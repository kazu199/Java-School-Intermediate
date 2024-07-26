package Lesson12;

import java.util.Scanner;

public class Practice12_02 {
  public static void main(String[] args) {

    System.out.print("時間帯を入力>");

    Scanner sc = new Scanner(System.in, "Shift-JIS");
    String day = sc.next();

    String good = greet(day);

    System.out.println(good);

  }

  public static String greet(String day) {

    if (day.equals("朝")) {
      return "Good morning!!";
    } else if (day.equals("昼")) {
      return "Good afternoon!!";
    } else if (day.equals("夜")) {
      return "Good eveing!!";
    } else {
      return "正しく入力してください。";
    }
  }
}
