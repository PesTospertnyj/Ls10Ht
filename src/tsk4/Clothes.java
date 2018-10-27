package tsk4;

public abstract class Clothes {
    public Sizes size;
    public int cost;
    public String color;

    public Clothes(Sizes size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
