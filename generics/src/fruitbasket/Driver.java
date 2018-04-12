package fruitbasket;

import java.util.Iterator;

public class Driver {
  public static void main(String [] args) {
	FruitBasket<Apple> appleBasket=new FruitBasket<>();
	Apple apple1=new Apple(100);
	Apple apple2=new Apple(125);
	Apple apple3=new Apple(150);
	appleBasket.addFruit(apple1);
	appleBasket.addFruit(apple2);
	appleBasket.addFruit(apple3);
	Iterator<Apple> it= appleBasket.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	Orange org=new Orange();
	//appleBasket.addFruit(org);  compilation error apple basket should only have apples and not oranges
}
}
