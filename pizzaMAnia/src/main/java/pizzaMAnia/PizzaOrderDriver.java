package pizzaMAnia;
import java.util.Scanner;
import java.util.ArrayList;

public class PizzaOrderDriver extends Pizza{

   public static void printWelcomeMessage() {
        System.out.println("Welcome to the Pizza Order");
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
    	ArrayList<String> toppings = new ArrayList<>();
        int totalToppings;
        Scanner scanner = new Scanner(System.in);

        printWelcomeMessage();

        ArrayList<Pizza> pizzas = new ArrayList<>();

            Pizza pizza = new Pizza();

            String pizzaCuisine;
            System.out.println("Choose the Cuisine of the pizza\n1. Regular\n2.Jain\n3.Non-Veg : ");
            pizzaCuisine = scanner.next();
            pizza.setCuisine(pizzaCuisine);
            
            String pizzaCategory;
            System.out.println("Choose the Category of the pizza\n1.Classic\n2.Premium\n3.Supreme : ");
            pizzaCategory = scanner.next();
            pizza.setCategory(pizzaCategory);
            
            String pizzaVeraity;
            pizza.pizzaSelectOption();//Print the menu of pizzas in category
            pizzaVeraity = scanner.next();
            pizza.setVeraity(pizzaVeraity);
            
            String pizzaSize;
            System.out.println("Enter the size of the pizza\n1.Regular\n2.Medium\n3.Large : ");
            pizzaSize = scanner.next();
            pizza.setSize(pizzaSize);
            
            
            
                        
            System.out.println("Enter the total amount of toppings on the pizza: ");
            totalToppings = scanner.nextInt();

            for (int j = 0; j < totalToppings; ++j) {
                System.out.println("Enter the topping: ");
                String topping = scanner.next();
                toppings.add(topping);
            }

            pizza.setToppings(toppings);
            pizzas.add(pizza);
        
            pizza.setPizzaAmount(pizzaSize);
        PizzaOrder order = new PizzaOrder(pizzas);

        order.printOrderSummary();

        // Cleanup
        scanner.close();
    }
}