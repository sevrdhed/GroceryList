
/**
 * Write a description of class FoodItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class FoodItem implements Comparable<FoodItem> //Calling this Comparable and then modifying the CompareTo allows me to resort the list based on my own values. 
{
    // instance variables - replace the example below with your own
   
    private int Quadrant;
    private String Location;
    private String Name;
    private double Price;
    
    
    
    


    public FoodItem(String Name, int Quadrant, String Location, double Price)
    {
       this.Name = Name;
       this.Quadrant = Quadrant;
       this.Location = Location;
       this.Price = Price;
    }  
    
    public String getLocation()
    
    {
        return Location;
    }
    
    public int getQuadrant()
    
   {
       return Quadrant;
    }
    
    public String getName()
    {
        return Name;
    }
    
    public double getPrice()
    {
        return Price;
    }
    
    @Override //This allows me to resort an Arraylist of FoodItems by using the collections.sort method. This bit of code now sorts based on the quadrant of the food item. FUCK YEAH. 
    public int compareTo(FoodItem comparesquad)
    {
        int comparisonres=((FoodItem)comparesquad).getQuadrant();
        return this.Quadrant-comparisonres;
        }
        
  
    
  
    
}

