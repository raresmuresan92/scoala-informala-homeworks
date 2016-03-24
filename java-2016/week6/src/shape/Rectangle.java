package shape;

public class Rectangle implements Shape {
	
	float length;
	float width;
	
	public Rectangle(float length, float width){
		this.length = length;
		this.width = width;
	}
	
	@Override
	public float calculateArea() {
		return length*width;
	}

	@Override
	public float calculatePerimeter() {
		return 2*(length+width);
	}

}
