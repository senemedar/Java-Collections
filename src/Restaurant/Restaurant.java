package Restaurant;

import Zadanie22.SortingOrder;

import java.util.*;

public class Restaurant {
	Set<Dish> menu = new HashSet<>();
	
	public boolean addDish(Dish dish) {
		return menu.add(dish);
	}
	
	public boolean removeDish(Dish dish) {
		return menu.remove(dish);
	}
	
	public Dish findDishByName(String name) {
		for (Dish dish : menu) {
			if (dish.getName().equals(name)) {
				return dish;
			}
		}
		throw new RestaurantException("Nie odnaleziono potrawy: " + name);
	}
	
	public List<Dish> findDishByType(type type) {
		List<Dish> selectedDishes = new ArrayList<>();
		for (Dish dish : menu) {
			if (dish.getType() == type) {
				selectedDishes.add(dish);
			}
		}
		return selectedDishes;
	}
	
	public Set<Dish> getMenu() {
		return menu;
	}
	
	public Set<Dish> getSortedMenu() {
		return new TreeSet<>(menu);
	}
	
	public List<Dish> sortMenuByPrice() {
		List<Dish> priceList = new ArrayList<>(menu);
		priceList.sort(Comparator.comparingDouble(Dish::getPrice));
		return priceList;
	}
	
	public List<Dish> sortMenuByCalories(SortingOrder modifier) {
		List<Dish> priceList = new ArrayList<>(menu);
		priceList.sort(new Comparator<Dish>() {
			@Override
			public int compare(Dish d1, Dish d2) {
				if (modifier == SortingOrder.ASC) {
					return d1.getCalories() - d2.getCalories();
				} else {
					return d2.getCalories() - d1.getCalories();
				}
			}
		});
		return priceList;
	}
	
	public List<Dish> sortMenuByReversedPrice() {
		List<Dish> priceList = new ArrayList<>(menu);
		priceList.sort(new Comparator<Dish>() {
			@Override
			public int compare(Dish d1, Dish d2) {
				double result = d2.getPrice() - d1.getPrice();
				if (result > 0) {
					return 1;
				} else if (result == 0) {
					return 0;
				} else {
					return -1;
				}
			}
		});
		return priceList;
	}
	
	@Override
	public String toString() {
		return "Restaurant{" +
				"menu=" + menu +
				'}';
	}
}
