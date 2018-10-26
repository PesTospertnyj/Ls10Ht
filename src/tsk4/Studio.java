package tsk4;

public class Studio {
    public void dressMan() {
        System.out.println();
    }
    public void dressWoman() {
        System.out.println();
    }
    public Studio(){
    }
    public static void main(String[] args) {
    Studio std = new Studio();
        Studio[] clothes = {TShirt, Pants, Skirt, Tie};

        std.dressMan();
        std.dressWoman();
    }
}
