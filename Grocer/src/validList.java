import java.util.*;
import java.util.ArrayList;


public class validList
{
    private ArrayList<FoodItem> origList;
    
    
    //Quadrants are as follows: 1 Bakery, 2 Deli/Cheese/Sushi area, 3 Produce, 4, Frozen Seafood, 5 - 8 Main Grocery Aisles, 9 Meats, 10 Frozen food aisles
    //11 Holiday items, 12 Dog/Cat food, 13 - 16 Non-Grocery items, 17 Dairy, 18 Both snack aisles, 19 Beer aisle, 20 Drug section.
    
    
    
    public validList()
   
    {
        origList = new ArrayList<FoodItem>();
        origList.add(new FoodItem("Onion", 3, "	Produce", 0.69));
        origList.add(new FoodItem("Bread", 7, "	Aisle 7", 1.50));
        origList.add(new FoodItem("Beer", 19, "	Beer Aisle", 12.00));
        origList.add(new FoodItem("Cheese", 8, "	Aisle 8", 3.69));
        origList.add(new FoodItem("Shredded Cheese", 8, "	Aisle 8", 3.69));
        origList.add(new FoodItem("Shredded Lettuce", 3, "	Produce", 1.89));
        origList.add(new FoodItem("Milk", 17, "	Milk Case", 2.99));
        origList.add(new FoodItem("Lettuce", 3, "	Produce", 0.99));
        origList.add(new FoodItem("Cilantro", 3, "	Produce",	0.99));
        origList.add(new FoodItem("Mushrooms",	3	,"	Produce	",	1.99	));
        origList.add(new FoodItem("Carrots",	3	,"	Produce	",	0.69	));
        origList.add(new FoodItem("Shredded carrots	",	3	,"	Produce	",	0.99	));
        origList.add(new FoodItem("Baby Carrots",	3	,"	Produce	",	1.99	));
        origList.add(new FoodItem("Strawberries",	3	,"	Produce	",	2.69	));
        origList.add(new FoodItem("Raspberries",	3	,"	Produce	",	3.69	));
        origList.add(new FoodItem("Blueberries",	3	,"	Produce	",	3.69	));
        origList.add(new FoodItem("Red Onion",	3	,"	Produce	",	0.99	));
        origList.add(new FoodItem("Sweet Onion",	3	,"	Produce	",	0.99	));
        origList.add(new FoodItem("Yellow Onion",	3	,"	Produce	",	0.69	));
        origList.add(new FoodItem("Bag Salad",	3	,"	Produce	",	3.49	));
        origList.add(new FoodItem("Red Leaf Lettuce",	3	,"	Produce	",	1.59	));
        origList.add(new FoodItem("Sushi",	2	,"	Deli	",	12.99	));
        origList.add(new FoodItem("Potatoes",	3	,"	Produce	",	4.99	));
        origList.add(new FoodItem("Red Potatoes",	3	,"	Produce	",	3.99	));
        origList.add(new FoodItem("Ginger",	3	,"	Produce",	1.99	));
        origList.add(new FoodItem("Garlic",	3	,"	Produce",	0.59	));
        origList.add(new FoodItem("Celery",	3	,"	Produce	",	2.39	));
        origList.add(new FoodItem("Avocado",	3	,"	Produce	",	1.5	));
        origList.add(new FoodItem("Crostinis",	1	,"	Bakery	",	1.79	));
        origList.add(new FoodItem("Frozen Veggies",	10	,"	Frozen Foods	",	2.79	));
        origList.add(new FoodItem("Marie Calendars",	10	,"	Frozen Foods	",	2.5	));
        origList.add(new FoodItem("Edemame",	10	,"	Frozen Foods	",	1	));
        origList.add(new FoodItem("Coke",	19	,"	Produce	",	1	));
        origList.add(new FoodItem("Black Beans",	7	,"	Aisle 7	",	1	));
        origList.add(new FoodItem("Cream Cheese",	8	,"	Aisle 8	",	1	));
        origList.add(new FoodItem("Kraft Singles",	8	,"	Aisle 8	",	3.49	));
        origList.add(new FoodItem("Sleep Aid",	20	,"	Drugs	",	3.79	));
        origList.add(new FoodItem("Yogurt",	17	,"	Dairy	",	0.77	));
        origList.add(new FoodItem("Hummus",	2	,"	Deli	",	2.5	));
        origList.add(new FoodItem("Steak",	9	,"	Meat	",	8	));
        origList.add(new FoodItem("Ranch",	8	,"	Aisle 8	",	3.19	));
        origList.add(new FoodItem("Olives",	8	,"	Aisle 8	",	2	));
        origList.add(new FoodItem("String Cheese",	8	,"	Aisle 8	",	4.34	));
        origList.add(new FoodItem("Steak Marinade",	8	,"	Aisle 8	",	2.5	));
        origList.add(new FoodItem("Fancy Cheese",	2	,"	Deli	",	16	));
        origList.add(new FoodItem("Cat Food",	12	,"	Aisle 12	",	4.99	));
        origList.add(new FoodItem("Dog Food",	12	,"	Aisle 12	",	14	));
        origList.add(new FoodItem("Dog bones",	12	,"	Aisle 12	",	3	));
        origList.add(new FoodItem("Bacon",	9	,"	Meat	",	2.99	));
        origList.add(new FoodItem("Ground Beef",	9	,"	Meat	",	1.89	));
        origList.add(new FoodItem("Hot Italian Sausage",	9	,"	Meat	",	2.99	));
        origList.add(new FoodItem("Chicken Breasts",	9	,"	Meat	",	3.99	));
        origList.add(new FoodItem("Fajita meat",	9	,"	Meat	",	5.99	));
        origList.add(new FoodItem("Tortillas",	8	,"	Aisle 8	",	2.99	));
        origList.add(new FoodItem("Corn Tortillas",	8	,"	Aisle 8	",	1.99	));
        origList.add(new FoodItem("Gravy",	7	,"	Aisle 7	",	.99	));
        origList.add(new FoodItem("Tilapia",	9	,"	Meat	",	2.59	));
        origList.add(new FoodItem("Baby Pouches",	16	,"	Aisle 16	",	.99	));
        origList.add(new FoodItem("Taco kit",	7	,"	Aisle 7	",	2.49	));
        origList.add(new FoodItem("Sour Cream", 17, "	Milk Case", 1));
        origList.add(new FoodItem("Cottage Cheese", 17, "	Milk Case", 1.99));
        origList.add(new FoodItem("Guacamole",	3	,"	Produce	",	3	));
        



       
      }
      
      public ArrayList<FoodItem> getList()
      {
          
          return origList;
        }
      
    
   
}