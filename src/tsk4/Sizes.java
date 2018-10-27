package tsk4;

public enum Sizes {
    XXS(32), XS(34), S(36), M(38), L(40);

    int[] euroSizes = {32, 34, 36, 38, 40};

    private int number;

    Sizes(int number) {
        this.number = number;
    }

    public static void getDescription(String a) {
        System.out.println("Взрослый размер");
    }
}
