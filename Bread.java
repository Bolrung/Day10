
public abstract class Bread implements Food{

    protected  Float price;
    protected  int calories;

    protected int bakingTime=0;

    public Bread(Float price, int calories) {
        this.price = price;
        this.calories = calories;
    }

    public int getBakingTime() {
        return bakingTime;
    }
    public int getCalories() {
        return calories;
    }
    public Float getPrice() {
        return price;
    }
    


    
}