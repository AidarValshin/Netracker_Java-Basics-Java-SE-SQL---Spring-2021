package week_2.task01;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Voice> voiceList = new ArrayList<>(3);
        voiceList.add(new Cat());
        voiceList.add(new Cow());
        voiceList.add(new Dog());
        voiceList.forEach(x->x.voice());

    }
}
