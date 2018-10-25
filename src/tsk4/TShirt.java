package tsk4;

public class TShirt extends Clothes implements ManClothes {
    TShirt(){
        super(40,20,"red");
        this.size = getSize();
        this.cost = getCost();
        this.color = getColor();
    }
    @Override
    public void gotOnMan() {
        System.out.println("T-Shirt is on! It is  " + '\t' + size + " size and has a price " + cost + " pounds! It is " + color);
    }

    public static void main(String[] args) {
        TShirt tShirt = new TShirt();
        tShirt.gotOnMan();
    }
}
