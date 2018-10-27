package tsk4;

public class TShirt extends Clothes implements ManClothes {
    TShirt(Sizes size, int cost, String color) {
        super(Sizes.XS, 20, "red");
        this.size = getSize();
        this.cost = getCost();
        this.color = getColor();
    }

    @Override
    public void gotOnMan() {
        System.out.println("T-Shirt is on! It is  " + '\t' + size + " size and has a price " + cost + " pounds! It is " + color);
    }

    public static void main(String[] args) {
        TShirt tShirt = new TShirt(Sizes.XS, 15, "white");
        tShirt.gotOnMan();
    }
}
