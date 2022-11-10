package pizzaMAnia;

import java.util.ArrayList;

public class PizzaOrder {
	private final ArrayList<Pizza> pizzas;

	public PizzaOrder(ArrayList<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

	public void printOrderSummary() {
		for (Pizza pizza : pizzas) {
			System.out.println("You choose Pizza ");
			System.out.println("Cuisine :" + pizza.getCuisine());
			System.out.println("Category :" + pizza.getCategory());
			System.out.println("Pizza :" + pizza.getVeraity());
			System.out.println("Ordered Size : " + pizza.getSize());
			System.out.println("Toppings with :" + pizza.getToppings());
			 System.out.println("Your Amount is :" +  pizza.getPizzaAmount());
			System.out.println("You Have Selected " + pizza.getCategory() + " " + pizza.getVeraity() + " "
					+ pizza.getSize() + " " + "With" + " " + pizza.getToppings() + " worth price "+ pizza.getPizzaAmount());
		}
	}
}