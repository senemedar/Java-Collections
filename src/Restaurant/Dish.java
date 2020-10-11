package Restaurant;

import java.util.Objects;

enum type {
	BREAKFAST,
	DINNER,
	APPETIZER
}

public class Dish implements Comparable<Dish> {
	private String name;
	private double price;
	private int calories;
	private type type;
	
	public Dish(String name, double price, int calories, type type) {
		this.name = name;
		this.price = price;
		this.calories = calories;
		this.type = type;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Dish dish = (Dish) o;
		return price == dish.price &&
				calories == dish.calories &&
				Objects.equals(name, dish.name) &&
				type == dish.type;
	}
	
	public String getName() {
		return name;
	}
	
	public type getType() {
		return type;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getCalories() {
		return calories;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, price, calories, type);
	}
	
	@Override
	public String toString() {
		return name + ": " + price + "zł; kalorie: " + calories;
	}
	
	@Override
	public int compareTo(Dish otherDish) {
		int result = this.name.compareTo(otherDish.name);
		if (result == 0) {
			double result2 = this.getPrice() - otherDish.getPrice();
//			result = (int)result2;
// rzutowanie nie do końca działa, bo ucinając końcówki danie za 33zł wskakuje przed danie za 33.20
			
			if (result2 > 0) {
				result = 1;
			} else if (result2 == 0) {
				result = 0;
			} else {
				result = -1;
			}
		}
		return result;
	}
}
