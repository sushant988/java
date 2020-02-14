import java.util.stream.IntStream;

public final class ImmutableClass {
	
	private final int[] myArray;
	
	public ImmutableClass(int[] a) {
		myArray=a.clone();
	}
	
	
	void getArray(){
		
		
		IntStream.of(myArray).forEach(System.out::println);
		}
	
	public static void main(String[] args)  {
		try {
			throw new MyOwnEException("Fail");
		}catch (MyOwnEException e) {
			System.out.println(e);
		}
		int a[]= {2,3};
		ImmutableClass m=new ImmutableClass(a);
		a[1]= 5;
		m.getArray();
		
		
	}

}
