package PrototypeDesignPattern;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs=new BookShop();
		bs.setShopName("Royal");
		bs.loadData();
		
		BookShop bs1=bs.clone();
		bs.getBooks().remove(2);
		bs1.setShopName("HighEnd");
		System.out.println(bs);
		System.out.println(bs1);
	}
}
