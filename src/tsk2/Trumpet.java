package tsk2;

public class Trumpet implements Instrument{

    public static int diameter = 130;

    @Override
    public void play() {
        System.out.println("Now is playing Trumpet with diameter: " + diameter);
    }
}
