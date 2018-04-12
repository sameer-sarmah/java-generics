package fruitbasket;

public class Apple implements Fruit {
	
private int weightInGrams;	

 public Apple(int weightInGrams) {
	super();
	this.weightInGrams = weightInGrams;
}

@Override
public String getName() {
	return "Apple";
}

@Override
public String toString() {
	return "Apple [weightInGrams=" + weightInGrams + "]";
}


}
