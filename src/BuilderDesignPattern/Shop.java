package BuilderDesignPattern;

public class Shop {
	public static void main(String[] args) {
		Phone p=new PhoneBuilder().setOs("android").setRam(2).getPhone();
		System.out.println(p);
	}
}
