
public class AdapterClass {
	public static void main(String[] args) {
		A1 a=new C1();
		a.writeWithPen("get out");
	}
	

}

interface A1 {
	
	public void writeWithPen(String write) ;
}


class B1{
	
	public void writeWithMarker(String write) {
		System.out.println("name is "+write);
	}
}

class C1 implements A1{
	B1 b=new B1();

	@Override
	public void writeWithPen(String write) {
		b.writeWithMarker("hello " +write);
		
	}
	
}



