package Lesson13;

class Animal {
  String name = "Jhon";
  String type = "nothing";

  public void cryAnimals(String type) {
    System.out.println(
        switch (type) {
          case "cat" -> "nya-";
          case "dog" -> "wan";
          default -> "特定できませんでした";
        });
  }
}

public class Practice13_01 {
  public static void main(String[] args) {

    Animal ani01 = new Animal();
    ani01.name = "pochi";
    System.out.println(ani01.name);
    ani01.cryAnimals("dog");

    Animal ani02 = new Animal();
    ani02.name = "tama";
    System.out.println(ani02.name);
    ani02.cryAnimals("cat");

  }
}
