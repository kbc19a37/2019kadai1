/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteCafe;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author kbc19a37
 */
public class ITECafe {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //ドリンク品名
        Item HotCoffee = new Item(1, "ホットコーヒー", 280);
        Item Tea = new Item(2, "紅茶", 260);
        Item IceCoffee = new Item(3, "アイスコーヒー", 200);
        Item IceTea = new Item(4, "アイスティー", 260);

        //スイーツ品名
        Item ShortCake = new Item(5, "ショートケーキ", 400);
        Item CheeseCake = new Item(6, "チーズケーキ", 400);
        Item ChocoCake = new Item(7, "チョコレートケーキ", 450);
        Item ChocoBananaP = new Item(8, "チョコバナナパフェ", 390);
        Item StrawberryP = new Item(9, "イチゴパフェ", 390);

        //軽食品名
        Item MeatPasta = new Item(10, "ミートパスタ", 650);
        Item MixPizza = new Item(11, "ミックスピザ", 700);

        //パン品名
        Item Croissant = new Item(12, "クロワッサン", 180);
        Item ToastSand = new Item(13, "トーストサンド", 200);
        Item FrenchToast = new Item(14, "フレンチトースト", 210);

        Item[] items = new Item[20];
        items[0] = HotCoffee;
        items[1] = Tea;
        items[2] = IceCoffee;
        items[3] = IceTea;
        items[4] = ShortCake;
        items[5] = CheeseCake;
        items[6] = ChocoCake;
        items[7] = ChocoBananaP;
        items[8] = StrawberryP;
        items[9] = MeatPasta;
        items[10] = MixPizza;
        items[11] = Croissant;
        items[12] = ToastSand;
        items[13] = FrenchToast;

        //商品名を表示する
        System.out.println("いらしゃいませ、ITECafeへようこそ");
        System.out.println("以下のメニューから商品をお選びください");
        System.out.println("■■■■■■■■ITECafeシステム　メニュー一覧■■■■■■■■");

        System.out.println("[ドリンク]");
        System.out.println(HotCoffee.getNumber() + "." + HotCoffee.getName() + "：" + HotCoffee.getPrice() + "円");
        System.out.println(Tea.getNumber() + "." + Tea.getName() + "：" + Tea.getPrice() + "円");
        System.out.println(IceCoffee.getNumber() + "." + IceCoffee.getName() + "：" + IceCoffee.getPrice() + "円");
        System.out.println(IceTea.getNumber() + "." + IceTea.getName() + "：" + IceTea.getPrice() + "円");

        System.out.println("[スイーツ]");
        System.out.println(ShortCake.getNumber() + "." + ShortCake.getName() + "：" + ShortCake.getPrice() + "円");
        System.out.println(CheeseCake.getNumber() + "." + CheeseCake.getName() + "：" + CheeseCake.getPrice() + "円");
        System.out.println(ChocoCake.getNumber() + "." + ChocoCake.getName() + "：" + ChocoCake.getPrice() + "円");
        System.out.println(ChocoBananaP.getNumber() + "." + ChocoBananaP.getName() + "：" + ChocoBananaP.getPrice() + "円");
        System.out.println(StrawberryP.getNumber() + "." + StrawberryP.getName() + "：" + StrawberryP.getPrice() + "円");

        System.out.println("[軽食]");
        System.out.println(MeatPasta.getNumber() + "." + MeatPasta.getName() + "：" + MeatPasta.getPrice() + "円");
        System.out.println(MixPizza.getNumber() + "." + MixPizza.getName() + "：" + MixPizza.getPrice() + "円");

        System.out.println("[パン]");
        System.out.println(Croissant.getNumber() + "." + Croissant.getName() + "：" + Croissant.getPrice() + "円");
        System.out.println(ToastSand.getNumber() + "." + ToastSand.getName() + "：" + ToastSand.getPrice() + "円");
        System.out.println(FrenchToast.getNumber() + "." + FrenchToast.getName() + "：" + FrenchToast.getPrice() + "円");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

        Scanner scan = new Scanner(System.in);

        int inputNum; //入力された商品番号
        Calendar cal = Calendar.getInstance(); //支払い画面の日時を入力するための変数
        int kaikeiNo = 1; //支払い画面の会計番号

        while (true) {
            int zeikomi;
            while(true){
            int goukei = 0;
            //商品注文
            while (true) {

                //商品番号を入力する
                System.out.println("商品番号を入力してください");

                try {

                    String inputStr;
                    inputStr = scan.next();
                    inputNum = Integer.parseInt(inputStr);

                    //数量を入力する
                    System.out.println("数量を入力してください");
                    int kosuu = new java.util.Scanner(System.in).nextInt();

                    System.out.println(items[inputNum - 1].getNumber() + "："
                            + items[inputNum - 1].getName() + items[inputNum - 1].getPrice()
                            + "円が" + kosuu + "個" + "入力されました");
                    System.out.println("代金は" + items[inputNum - 1].getPrice() * kosuu + "円です");

                    goukei += items[inputNum - 1].getPrice() * kosuu;

                } catch (NumberFormatException e) {
                    System.out.println("【入力エラー】：数値を入力してください");
                }

                System.out.println("他の商品も注文いたしますか？");
                System.out.println("１：はい　　２：いいえ");
                System.out.println("「１」か「２」の数字でお答えください");

                //if文でそのほかの注文の有無を問う
                int order = new java.util.Scanner(System.in).nextInt();
                if (order == 1) {
                    System.out.println("かしこまりました");
                    System.out.println("それでは、追加で注文する商品の番号を入力してください");

                } else {
                    System.out.println("かしこまりました");
                    System.out.println("それでは、以上の注文で会計をさせていただきます");
                    break;
                }

            }

            //会計
            System.out.println("▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼");
            System.out.println("合計金額：" + goukei + "円");
            //合計金額を税込みの値段にする計算
            zeikomi = (int) (goukei * 1.08);
            System.out.println("税込み価格：" + zeikomi + "円");
            System.out.println("▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲");
            
            System.out.println("以上の内容で会計となりますがよろしいですか？");
            System.out.println("１：はい　　２：いいえ");
            System.out.println("「１」か「２」の数字でお答えください");
            int kaikei = new java.util.Scanner(System.in).nextInt();
            if (kaikei == 1) {
                System.out.println("かしこまりました");
                System.out.println("それでは、支払い画面に移ります");
                break;
            } else {
                System.out.println("かしこまりました");
                System.out.println("お手数ですが、もう一度初めから商品番号を入力し直してください");
            }
            }
            
            System.out.println("▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼");
            System.out.println("お支払い額を入力してください");
            System.out.print("支払い額：");
            //支払額の入力
            int siharai;
            while(true){ //万一、税込み価格より支払額が少なかった時のために入力し直すためのwhile文
            siharai = new java.util.Scanner(System.in).nextInt();
            if(siharai > zeikomi){
                break;
            }else{
                System.out.println("お支払いの金額が不足しています");
                System.out.println("お手数ですが、もう一度入力し直してください");
            }
            }    
            //お釣りの計算・入力
            int oturi = siharai - zeikomi;
            System.out.println("お釣り：" + oturi + "円");
            
            //会計時の日付日時の入力
            System.out.println(cal.get(Calendar.YEAR) + "年" 
                              + cal.get(Calendar.MONTH) + "月"
                              + cal.get(Calendar.DATE) + "日"
                              + cal.get(Calendar.HOUR_OF_DAY) + "時"
                              + cal.get(Calendar.MINUTE) + "分");
            
            //会計番号の入力
            System.out.println("会計番号：" + kaikeiNo);
            kaikeiNo++;
            System.out.println("▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲");
            
            System.out.println("ご来店、誠にありがとうございました");
            System.out.println("またのご来店をお待ちしています");
            
            //１つのレジシステムがここで終了
            
            
            // システムを終了するか？
            System.out.println("ITECafeシステムを終了いたしますか？");
            System.out.println("１：はい　　２：いいえ");
            System.out.println("「１」か「２」の数字でお答えください");
            
            int owari = new java.util.Scanner(System.in).nextInt();
            if (owari == 1) {
                System.out.println("かしこまりました");
                System.out.println("システムを終了します");
                break;
            } else {
                System.out.println("かしこまりました");
                System.out.println("システムを継続します");

            }
        }

    }
}
