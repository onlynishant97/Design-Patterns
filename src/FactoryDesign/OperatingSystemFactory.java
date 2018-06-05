package FactoryDesign;

public class OperatingSystemFactory {
	public OperatingSystem getInstance(String str) {
		if(str.equals("open")) {
			return new Android();
		}
		else if(str.equals("closedplatform")) {
			return new IOS();
		}
		else {
			return new Windows();
		} 
	}
}
