package Restaurant;

import Zadanie22.SortingOrder;

public class GrandOpening {
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		
		restaurant.addDish(new Dish("Ogórkowa", 28.20, 128, type.APPETIZER));
		restaurant.addDish(new Dish("Schabowy", 33, 421, type.DINNER));
		restaurant.addDish(new Dish("Jajecznica", 21.55, 301, type.BREAKFAST));
		restaurant.addDish(new Dish("Kaszanka", 33.20, 218, type.BREAKFAST));
		restaurant.addDish(new Dish("Kaszanka", 29.70, 218, type.BREAKFAST));
		restaurant.addDish(new Dish("Wątróbka", 28.80, 128, type.DINNER));
		restaurant.addDish(new Dish("Krokiety", 28.80, 238, type.DINNER));
		
//		System.out.println(restaurant);
		System.out.println("Szukamy wątróbki:");
		System.out.println(restaurant.findDishByName("Wątróbka"));
		
//		throws exception
//		System.out.println(restaurant.findDishByName("Carbonara"));
		
		System.out.println("Szukamy śniadania:");
		System.out.println(restaurant.findDishByType(type.BREAKFAST));
		
		System.out.println("Menu: " + restaurant.getMenu());
		System.out.println("Menu posortowane \"naturalnie\", czyli wg. nazwy/ceny:");
		System.out.println(restaurant.getSortedMenu());
		
		System.out.println("Menu wg. cen: " + restaurant.sortMenuByPrice());
		System.out.println("Menu wg. cen, malejąco: " + restaurant.sortMenuByReversedPrice());
		System.out.println("Menu wg. kalorii: " + restaurant.sortMenuByCalories(SortingOrder.ASC));
		System.out.println("Menu wg. kalorii, malejąco: " + restaurant.sortMenuByCalories(SortingOrder.DESC));
		
	}
}
