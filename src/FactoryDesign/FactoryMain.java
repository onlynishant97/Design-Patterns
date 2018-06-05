package FactoryDesign;

public class FactoryMain {
	public static void main(String[] args) {
		OperatingSystemFactory osf=new OperatingSystemFactory();
		OperatingSystem os=osf.getInstance("open");
		os.spec();
	}
}
