
public abstract class Drink implements Food{
    protected Float price;
    protected int calories;
    protected boolean aCan = false;
    
    public Drink(Float price , int calories){
        this.price=price;
        this.calories=calories;

    }
    public Boolean isACan() {
        return aCan; 
    }

    public int getCalories() {
        // TODO Auto-generated method stub
        return calories;
    }

    
    public Float getPrice() {
        // TODO Auto-generated method stub
        return price;
    }
}