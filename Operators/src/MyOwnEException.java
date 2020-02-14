
public class MyOwnEException extends Exception{
	
	String exc;
	public MyOwnEException(String myExc) {
		super(myExc);
		exc=myExc;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return exc;
	}

}
