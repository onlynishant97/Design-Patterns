package DecrotorPattern;

public class RedShapeDecorator extends ShapeDecorator{
	public RedShapeDecorator(Shape shape) {
		super(shape);
	}
	@Override
	public void draw() {
		decoratorShape.draw();
		setRedBorder(decoratorShape);
	}
	private void setRedBorder(Shape decoratorShape) {
		System.out.println("Color:red");
	}
	
}
