package AdapterDesignPattern;

public class School {
	public static void main(String[] args) {
		PenAdaptor pa= new PenAdaptor();
		AssignmentWork aw = new AssignmentWork();
		aw.setPen(pa);
		aw.writeAssignment("done..!");
	}
}
