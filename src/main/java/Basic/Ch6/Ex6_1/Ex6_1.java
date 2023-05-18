package Basic.Ch6.Ex6_1;

public class Ex6_1 {
    public static void main(String[] args) {

        Tv t = new Tv();
        t.channel = 7;
        t.channelDouwn();
        System.out.println("현재 채널은 " + t.channel + " 입니다");
    }
}
