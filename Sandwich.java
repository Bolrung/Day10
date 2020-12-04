import java.util.*;

/**
 * Sandwich
 */
public abstract class Sandwich implements Food{
    protected Float price;
    protected int calories;
    protected boolean vegetarian =false;
    protected List<String> ingredients=new ArrayList<>();
    
    public Sandwich(Float price,int calories){
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
    
    public List<String> getIngredients() {
        return ingredients;
    }

       
    public Boolean isVegetarian() {
        return vegetarian; 
    }
}