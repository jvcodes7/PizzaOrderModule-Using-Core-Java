package pizzaMAnia;


import java.util.ArrayList;

public class Pizza {
    
    //cuisine
	private String cuisine;
	public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

	// category
    private String category;
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    //Veraity
    private String veraity;
    public String getVeraity() {
        return veraity;
    }

    public void setVeraity(String veraity) {
        this.veraity = veraity;
    }

    //Veraity
    private String amount;
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    //size
    private String size;
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    //toppings
    private ArrayList<String> toppings;
    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public String toString() {
        return this.size + " pizza with " + this.getToppings();
    }
    public void pizzaSelectOption() {
	    String pizzaOption;
	    pizzaOption=getCategory();
	    switch (pizzaOption) {
	        case "Classic":
	        	System.out.println("-- Classic --");
	        	System.out.println("1. Tomchi");
	            System.out.println("2. Caponito");
	            break;
	        case "Premium":
	        	System.out.println("-- Premium --");
	        	System.out.println("1. Red_Indian");
	            System.out.println("2. Party_Lovers");
	            break;
	        case "Supreme":
	        	System.out.println("-- Supreme --");
	        	System.out.println("1. American_Heat");
	            System.out.println("2. Re-Union");
	            break;
	        default:
	        	System.out.println("Please Choose Pizza");
	            break;
    }
	}
     private String PizzaAmount;
    public String  setPizzaAmount(String PizzaAmount) {
    	
    if (getCategory().equalsIgnoreCase("Classic")) {
	      if (getSize().equalsIgnoreCase("Regular")) {
	    	  PizzaAmount="135";
	       
	      } else if (getSize().equalsIgnoreCase("Medium")) {
	    	  PizzaAmount="210";
	      } else if (getSize().equalsIgnoreCase("Large")) {
	    	  PizzaAmount="360";
	      }
	    } else if (getCategory().equalsIgnoreCase("Premium")) {
	      if (getSize().equalsIgnoreCase("Regular")) {
	    	  PizzaAmount="165"; 
	      } else if (getSize().equalsIgnoreCase("Medium") ){
	    	  PizzaAmount="240";
	      } else if (getSize().equalsIgnoreCase("Large")) {
	    	  PizzaAmount="395";
	      }
	    } else if (getCategory().equalsIgnoreCase("Supreme")) {
	      if (getSize().equalsIgnoreCase("Regular")) {
	    	  PizzaAmount="190";
	      } else if (getSize().equalsIgnoreCase("Medium")) {
	    	  PizzaAmount="290";
	      } else if (getSize().equalsIgnoreCase("Large")) {
	    	  PizzaAmount="425";
	      }
	    }
	return this.PizzaAmount=PizzaAmount;
    }
    public String getPizzaAmount() {
    	return this.PizzaAmount;
    	
    }

	
	}
    