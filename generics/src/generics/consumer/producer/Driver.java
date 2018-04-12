package generics.consumer.producer;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<Animal> list=new ArrayList<>();
		producer(list);
		consumer(list);
	}

	public static void producer(List<? super Animal> list) {
		list.add(new Dog());
		list.add(new Cat());
	}
	
	public static void consumer(List<? extends Animal> list) {
	    for(Animal a : list) {
	    	a.trait();
	    }
	}
}
