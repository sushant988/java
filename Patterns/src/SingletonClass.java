
public class SingletonClass {
	
public String s;
	
	
	private static SingletonClass singletonClass;
	
	private SingletonClass(String s) {
		this.s=s;
	
		
	}
	
	
	public static SingletonClass getSingletonClass() {
		if(singletonClass==null) {
			System.out.println("creating");
			singletonClass= new SingletonClass("hello");
		}
		return singletonClass;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return s;
	}

}
