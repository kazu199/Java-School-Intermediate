package Question02;

class Coffee {

  String name;
  int price;
  String taste;
  String milk;

  public static void buyDrink(String name, String taste, String milk, int price) {
    System.out.println(name + "の甘さは" + taste + "、ミルク" + milk + "です。" + price + "円になります。");
  }
}

class Juice {

  int price;
  String taste;
  String name;

  public static void buyDrink(String name, String taste, int price) {
    System.out.println(name + "の" + taste + "です。" + price + "円になります。");
  }

}

public class ComprehensiveIntermediate02_05 {
  public static void main(String[] args) {

    Coffee coffeeBoss = new Coffee();
    Coffee coffeeGeorgia = new Coffee();
    Juice juiceBaya = new Juice();
    Juice juiceAfter = new Juice();

    coffeeBoss.name = "ボス";
    coffeeBoss.taste = "控え目";
    coffeeBoss.milk = "無し";
    coffeeBoss.price = 110;
    coffeeGeorgia.name = "ジョージア";
    coffeeGeorgia.taste = "甘め";
    coffeeGeorgia.milk = "入り";
    coffeeGeorgia.price = 120;

    juiceBaya.name = "バヤリース";
    juiceBaya.taste = "オレンジ";
    juiceBaya.price = 130;
    juiceAfter.name = "午後の紅茶";
    juiceAfter.taste = "レモンティー";
    juiceAfter.price = 150;

    Juice.buyDrink(juiceBaya.name, juiceBaya.taste, juiceBaya.price);
    Juice.buyDrink(juiceAfter.name, juiceAfter.taste, juiceAfter.price);

    Coffee.buyDrink(coffeeBoss.name, coffeeBoss.taste, coffeeBoss.milk, coffeeBoss.price);
    Coffee.buyDrink(coffeeGeorgia.name, coffeeGeorgia.taste, coffeeGeorgia.milk, coffeeGeorgia.price);

  }
}