
public class Review01 {

    public static void main(String[] args) {

        int price;
        int tax;
        int priceIncludedtax;

        price = 1500;

        tax = calculateTax(price);

        priceIncludedtax = price + tax;

        System.out.println(price + "円の商品の税込価格は" + priceIncludedtax + "円（消費税は" + tax + "円）です。");
    }

    //消費税額を計算するメソッド
    public static int calculateTax(int price) {

        //消費税額の計算
        double tax= price * 0.1;

        //int型にキャスト
        int result = (int)tax;

        return result;
    }

}
