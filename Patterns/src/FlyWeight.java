import java.util.HashMap;
import java.util.Map;

public class FlyWeight {
public static void main(String[] args) {
	Circle s=(Circle)ShapeFactory.getCircle("red");
	s.setRadius(100);
	Circle s1=(Circle)ShapeFactory.getCircle("red");
	s1.setRadius(100);
	Circle s11=(Circle)ShapeFactory.getCircle("red");
	s11.setRadius(100);
	Circle s1111=(Circle)ShapeFactory.getCircle("red");
	s1111.setRadius(100);
	s1111.draw();
	s11.draw();
	s1.draw();
}
}

interface Shape{
	void draw();
}
class Circle implements Shape{
	
	private String color;
	public int radius;
	
	 public Circle(String color){
		 System.out.println("creating object");
		this.color=color;
	}

	 public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing with color "+color+" and radis "+radius);
		
	}
	
}

class ShapeFactory{
	
	static final Map m= new HashMap<>();
	
	public static  Shape getCircle(String color) {
		Shape s=null;
		if(m.get(color)==null) {
			s=new Circle(color);
			m.put(color, s);
		}else {
			return (Circle)m.get(color);
		}
		
		return s;
		
	}
	
	
}