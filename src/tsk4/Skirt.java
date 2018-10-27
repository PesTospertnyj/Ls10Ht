package tsk4;

public class Skirt extends Clothes implements WomanClothes {
    public Skirt(Sizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void gotOnWomen() {
    }
}
