package tsk4;

public class SizeDemo {

    public static final String XXS = "XXS";
    public static final String XS = "XS";
    public static final String S = "S";
    public static final String M = "M";
    public static final String L = "L";

    public static void main(String[] args) {



        Sizes.getDescription("Детский размер");
        Sizes sizes = Sizes.XXS;
        switch(sizes){
            case XXS:
                System.out.println("Это детский разммер");
                break;
            case XS:
                break;
            case S:
                break;
            case M:
                break;
            case L:
                break;
        }
    }
}
