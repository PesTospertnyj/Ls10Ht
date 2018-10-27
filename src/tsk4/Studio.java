package tsk4;

public class Studio {
    public static void dressMan(Clothes clothes[]) {
        System.out.println("Man clothes: T-Shirt: " + clothes[0].toString() + " Pants " + clothes[1].toString() + " Tie " + clothes[3].toString());
    }

    public void dressWoman(Clothes clothes[]) {
        System.out.println("Woman clothes: T-Shirt: " + clothes[0] + " Pants: " + clothes[1] + " Skirt: " + clothes[2]);
    }

    public Studio() {
    }

    public static void main(String[] args) {
        Studio std = new Studio();
        Clothes[] clothes = {new TShirt(Sizes.XS, 15, "yellow"),
                new Pants(Sizes.L, 45, "black"),
                new Skirt(Sizes.M, 55, "violet"),
                new Tie(Sizes.XXS, 29, "red")};

        std.dressMan(clothes);
        std.dressWoman(clothes);

    }
}
