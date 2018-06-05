package AdapterDesignPattern;

public class PenAdaptor implements Pen{
	PilotPen pp=new PilotPen();
	@Override
	public void write(String str) {
		pp.mark(str);		
	}
}
