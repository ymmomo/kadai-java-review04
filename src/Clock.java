
public class Clock {

    public static void main(String[] args) {
        int hour = 18;
        int minute = 32;
        int second = 47;
        int result = getSeconds(18,32,47);

        System.out.println(hour + "時" + minute + "分" + second + "秒");
        System.out.println(result + "秒");

    }

    public static int getSeconds(int hours, int minutes, int seconds) {
        int toSeconds = hours * 60 * 60;
        int toMinutes = minutes * 60;
        return toSeconds + toMinutes + seconds;
    }

}
