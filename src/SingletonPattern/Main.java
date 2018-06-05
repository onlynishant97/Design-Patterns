package SingletonPattern;

public class Main {
	public static void main(String[] args) {
		SingleObject so=SingleObject.getInstance();
		so.showMessage();
	}
}
