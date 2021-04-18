package week_2.task04;

public class SleepyImpl implements Sleepy {
    private boolean awake;
    @Override
    public void sleep() {
        awake=false;
    }

    @Override
    public void wakeUp() {
        awake=true;
    }

    @Override
    public void ask() {
        System.out.println(awake?"BOO!":"zzz");
    }
}
