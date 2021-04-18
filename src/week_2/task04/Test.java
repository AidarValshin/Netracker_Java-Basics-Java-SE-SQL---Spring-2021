package week_2.task04;

public class Test {
    public static void main(String[] args) {
        Sleepy sleepy=new SleepyImpl();
        sleepy.sleep();
        sleepy.ask();
        sleepy.wakeUp();
        sleepy.ask();
    }

}
