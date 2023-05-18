package Basic.Ch6.Ex6_1;

public class Tv {
    String color;
    boolean power;
    int channel;

    public void power() {power = !power;}
    public void channelUp() {++channel;}
    public void channelDouwn() {--channel;}
}
