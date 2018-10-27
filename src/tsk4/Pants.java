package tsk4;

public class Pants extends Clothes implements ManClothes {
    public Pants(Sizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void gotOnMan() {
    }

    @Override
    public String toString() {
        return "Pants{" +
                "size=" + size +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
