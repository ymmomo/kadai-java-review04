
public class IfElseSample {

    public static void main(String[] args) {
        int score = 40;

        if(score >= 60) {
            System.out.println("合格です！");
        }else {
            System.out.println("赤点です...");
        }
        //三項演算子
        String result = (score >= 60)?"合格です！":"赤点です...";
        System.out.println(result);

    }

}
