import java.util.ArrayList;
import java.util.List;

public class CompositePattern {
	
	public static void main(String[] args) {
		Component c1=new Leaf("Saphire",100);
		Component c2=new Leaf("amethyst",150);
		Component c3=new Leaf("emerald",200);
		
		Composite c4=new Composite("PPC");
		c4.addCom(c1);
		c4.addCom(c2);
		c4.addCom(c3);
		
		c4.showPrice();
		
	}

}


interface Component{
	void showPrice();
}

class Leaf implements Component{
	private String name;
	private int price;
	
	
	public Leaf(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}


	@Override
	public void showPrice() {
		System.out.println(name+"===="+price);
		
	}
	
	
	
}


class Composite implements Component{
	private String name;
	
	List<Component> com=new ArrayList<>();
	
	
	
	public Composite(String name) {
		super();
		this.name = name;
	}



	public void addCom(Component cf) {
		com.add(cf);
		

	}



	@Override
	public void showPrice() {
		System.out.println("===="+name);
		
		for(Component b:com) {
			b.showPrice();
		}
		
	}
	
}