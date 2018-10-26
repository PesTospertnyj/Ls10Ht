package tsk4;

public class Pants extends Clothes implements ManClothes {
    public Pants(int size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void gotOnMan() {
    }
}
