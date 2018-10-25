package tsk2;

public class InstrumentDemo {

    public static void main (String[] args) {
        Guitar guitar = new Guitar();
        Drum drum = new Drum();
        Trumpet trumpet = new Trumpet();

        Instrument[] array = {guitar, drum, trumpet};

        for (Instrument t : array)
        {
            t.play();
        }
    }

}
