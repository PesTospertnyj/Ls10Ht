package tsk2;

public class Guitar implements Instrument {

    public static int numberOfStrings = 6;

    @Override
    public void play() {
        System.out.println("Now is playing guitar with " + numberOfStrings + " strings!");
    }


}
