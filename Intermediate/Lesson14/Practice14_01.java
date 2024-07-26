package Lesson14;

class nullp {
  String text;

  public void NullPointerException(String text) {
    try {
      System.out.println(text.length());
    } catch (NullPointerException e) {
      System.out.println("ぬるぽをキャッチしました。");
    } finally {
      System.out.println("finally　ブロックです。");
    }
    System.out.println("処理終了");
  }
}

public class Practice14_01 {
  public static void main(String[] args) {
    nullp nu = new nullp();
    nu.text = null;
    nu.NullPointerException(nu.text);
  }
}
