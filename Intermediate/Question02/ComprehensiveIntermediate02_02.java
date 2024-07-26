package Question02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class MenuManger {
  Map<String, ArrayList> map = new HashMap<>();

  MenuManger() {
    ArrayList<String> list = new ArrayList<>();
    list.add("ハンバーガー");
    list.add("チーズバーガー");
    list.add("ダブルチーズバーガー");
    map.put("sandwitch", list); // sandwitchとlistを追加

    list = new ArrayList<>();
    list.add("コーラ");
    list.add("オレンジジュース");
    list.add("コーヒー");
    map.put("drink", list); // drinkとlistを追加

    list = new ArrayList<>();
    list.add("フライドポテト");
    list.add("チキンナゲット");
    list.add("アップルパイ");
    map.put("sidemenu", list); // sidemenuとlistを追加

  }

  public void serchMenu(String menu) { // --メニュー検索--
    int i = 0;
    for (String allList : map.keySet()) { // allListへキーを追加
      i++;
      if (map.get(allList).contains(menu)) { // allListの中の要素にmenuが入っているならtrue
        System.out.println(menu + "は" + allList + "に含まれています。");
        break;
      } else if (map.size() <= i) {
        System.out.println("該当するメニューはありません。");
        break;
      }
    }
  }

  public void setMenu(String category, String menu) { // --追加処理--
    for (String keySerch : map.keySet()) { // キーをkeySerchへ追加
      if (keySerch.contains(category)) { // keyserchがカテゴリーのキーと一致するならture
        map.get(category).add(menu); // categoryキーの中の要素にmenuを追加
        break;
      } else {
        System.out.println("該当しません");
        break;
      }
    }
  }

  public void showMenu(String category) { // --表示処理--
    System.out.println(map.get(category));
  }
}

public class ComprehensiveIntermediate02_02 {
  public static void main(String[] args) {
    MenuManger manger = new MenuManger();
    manger.showMenu("sandwitch"); // 表示

    manger.setMenu("sandwitch", "ビッグバーガー"); // 追加

    manger.showMenu("sandwitch"); // 表示

    manger.serchMenu("ホットミルク");

    manger.serchMenu("オレンジジュース");
  }

}
