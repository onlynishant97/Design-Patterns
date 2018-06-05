package DecrotorPattern;

public class ShapeDecorator implements Shape{
	protected Shape decoratorShape;
	public ShapeDecorator(Shape shape) {
		decoratorShape=shape;
	}
	public void draw() {
		decoratorShape.draw();
	}
}
