package fruitbasket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FruitBasket<T extends Fruit> implements Iterable<T> {
private List<T> list=new ArrayList<>();

public void addFruit(T fruit) {
	this.list.add(fruit);
}

public T getFruit(int index) {
	return this.list.get(index);
}

class CustomIterator implements Iterator<T>{

	Iterator<T> it;
	
	public CustomIterator(Iterator<T> it) {
		super();
		this.it = it;
	}

	@Override
	public boolean hasNext() {
		return it.hasNext();
	}

	@Override
	public T next() {
		return it.next();
	}
	
	@Override
	public void remove() throws NotSupportedOperation{
		//we wont let other remove items
	}
	
}

@Override
public Iterator<T> iterator() {
	return new CustomIterator(list.iterator());
}

}
