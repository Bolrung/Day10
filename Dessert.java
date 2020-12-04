/**
 * Dessert
 */
public abstract class Dessert implements Food{
    protected Float price;
    protected int calories;

    
    public Dessert(Float price ,int calories){
        this.calories=calories;
        this.price=price;

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