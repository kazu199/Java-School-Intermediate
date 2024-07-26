package Lesson13;

class Greeting {
  String country;

  public String greet(String country) {
    return switch (country) {
      case "日本" -> "こんにちは";
      case "韓国" -> "アンニョンハセヨ";
      default -> "わかりません";
    };
  }
}

public class Practice13_03 {
  public static void main(String[] args) {

    Greeting greetJapan = new Greeting();
    Greeting greetKorea = new Greeting();
    Greeting greetUnknown = new Greeting();

    String japan = "日本";
    String korea = "韓国";
    String unknown = "その他";

    greetJapan.country = japan; // 日本
    greetKorea.country = korea; // 韓国
    greetUnknown.country = unknown; // その他

    String result1 = greetJapan.country + "は" + greetJapan.greet(japan);
    String result2 = greetKorea.country + "は" + greetKorea.greet(korea);
    String result3 = greetUnknown.country + "は" + greetUnknown.greet(unknown);

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
  }
}
