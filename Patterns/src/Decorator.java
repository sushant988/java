
public class Decorator {
public static void main(String[] args) {
	Car c=new  SportsCar(new LuxuryCar(new BasicCar()));
			c.fetures();
}
}

interface Car{
	
	void fetures();
}

class BasicCar implements Car{
	
	public BasicCar() {
		
	}

	@Override
	public void fetures() {
		// TODO Auto-generated method stub
		System.out.println("basddic car");
	}
	
}

class DecoratorP implements Car{

	Car c;
	public DecoratorP(Car c) {
		this.c=c;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fetures() {
		this.c.fetures();
		
	}
	
}

class LuxuryCar extends  DecoratorP{

	public LuxuryCar(Car c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fetures() {
		super.fetures();
		System.out.println("LuxuryCar car");
		
	}
	
}

class SportsCar extends  DecoratorP{
	

	public SportsCar(Car c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fetures() {
		super.fetures();
		System.out.println("sports car");
		
	}
	
}


