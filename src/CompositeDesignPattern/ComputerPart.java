package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

interface Component{
	void showPrice();
}

class Leaf implements Component{	
	int price;
	String name;
	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	@Override
	public void showPrice() {
		System.out.println(name + " " + price);
	}
}

class Composite implements Component{
	String name;
	List<Component> list=new ArrayList<>();
	public void addComponent(Component c) {
		list.add(c);	
	}
	public Composite(String name) {
		super();
		this.name = name;
	}

	@Override
	public void showPrice() {
		System.out.println(name);
		for(Component c:list) {
			c.showPrice();
		}
	}
}