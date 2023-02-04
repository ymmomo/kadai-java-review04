
public class SevenNumber {

    public static void main(String[] args) {
        //My Answer（微妙な答え）
        int answer = 0;
        for(int i = 0; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                answer = 10 * i + j;
                if(answer %7 == 0) {
                    System.out.println("clap!");
                }else if(i == 7 || j == 7) {
                    System.out.println("clap!");
                }else {
                    System.out.println(answer);
                }
            }
        }
        System.out.println(++answer);

        //解答例
        //for(int i = 1; i <= 100; i ++) {
            //if(i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                //System.out.println("clap!");
            //}else {
                //System.out.println(i);
            //}
        }

}

