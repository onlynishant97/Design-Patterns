package PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	private String shopName;
	List<Book> books=new ArrayList<>();
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public void loadData() {
		for(int i=1;i<=10;i++) {
			Book b=new Book();
			b.setBid(i);
			b.setBname("Book "+i);
			this.books.add(b);
		}
	}
	
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		BookShop shop=new BookShop();
		for(Book b:this.books) {
			shop.books.add(b);
		}
		return shop;
	}
}
