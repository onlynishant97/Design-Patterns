package CompositeDesignPattern;

public class CompositeTest {
	public static void main(String[] args) {
		Component hd=new Leaf(3000,"hdd");
		Component mouse=new Leaf(300,"mouse");
		Component monitor=new Leaf(6000,"monitor");
		Component ram=new Leaf(2000,"ram");
		Component cpu=new Leaf(10000,"cpu");
		
		Composite ph=new Composite("peri");
		Composite cabinet=new Composite("cabinet");
		Composite mb=new Composite("mb");
		Composite computer=new Composite("computer");
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		mb.addComponent(cpu);
		mb.addComponent(ram);
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		ram.showPrice();
		ph.showPrice();
		computer.showPrice();
		
		
	}
}
