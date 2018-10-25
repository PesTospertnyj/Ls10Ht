package tsk4;

public enum Sizes {
    XXS(32), XS(34), S(36), M(38), L(40);

    public String a;

    public int euroSize;

    //Sizes[] array = {XXS,XS,S,M,L};

    Sizes(int i, euroSize) {
    }

    /*Sizes(euroSize){

    }*/
    public static void getDescription(String a){
        System.out.println("Взрослый размер");
    }
}
