
public class BuilderP {
	
	
	
	
	public static void main(String[] args) {
		B b=new B();
		b.setName("Sushan");
		A a=b.getA();
		System.out.println(a);
	}

}

class A{
	
private String name;
	
	private String tech;
	
	public A(String name, String tech) {
		this.name=name;
		this.tech=tech;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name+"----"+tech;
		}
}


class B{
	
private String name;
	
	private String tech;

	public B setName(String name) {
		this.name=name;
		return this;
	}

	public B setTech(String tech) {
		this.tech=tech;
		return this;
	}
	
	public A getA(){
		return new A(name,tech);
		
	}
}