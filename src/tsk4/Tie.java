package tsk4;

public class Tie extends Clothes implements ManClothes {
    public Tie(Sizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void gotOnMan() {
    }

    @Override
    public String toString() {
        return "Tie{" +
                "size=" + size +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
