package AdapterDesignPattern;

public class AssignmentWork {
	private Pen pen;
	public void writeAssignment(String str) {
		pen.write(str);
	}
	public Pen getPen() {
		return pen;
	}
	public void setPen(Pen pen) {
		this.pen = pen;
	}
	
}
