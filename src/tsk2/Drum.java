package tsk2;

public class Drum implements Instrument{
    public static int size = 7;

    @Override
    public void play() {
        System.out.println("Now is playing a drum which size is: " + size);

    }
}
