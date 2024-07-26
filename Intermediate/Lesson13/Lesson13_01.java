package Lesson13;

class Student { // 点数計算
  String name = "sato";

  public void calculateAve(int math, int english) { // calculateAve関数を作成
    System.out.println((math + english) / 2);
  }
}

public class Lesson13_01 { // 名前、点数格納場所
  public static void main(String[] args) {

    Student a001 = new Student(); // インスタンス化(a001のオブジェクト作成)
    a001.name = "sato";
    System.out.println(a001.name);
    a001.calculateAve(90, 80);

    Student a002 = new Student();
    a002.name = "suzuki";
    System.out.println(a002.name);
    a002.calculateAve(70, 80);
  }
}