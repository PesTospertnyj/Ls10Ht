package tsk4;

public class Tie extends Clothes implements ManClothes{
    public Tie(int size, int cost, String color){
        super(size, cost, color);
    }
    @Override
    public void gotOnMan(){
    }
}
