import java.io.FileOutputStream;

public class MultipleException {

	public static void main(String[] args) {
		   try{    
	            int array[] = new int[10];    
	            array[10] = 30/0;    
	        }    
	        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){  
	            System.out.println(e.getMessage());  
	        }  
		   
		   try(FileOutputStream fileOutputStream =new FileOutputStream("/java7-new-features/src/abc.txt")){      
			   String msg = "Welcome to javaTpoint!";      
			   byte byteArray[] = msg.getBytes(); //converting string into byte array      
			   fileOutputStream.write(byteArray);  
			   System.out.println("Message written to file successfuly!");      
			   }catch(Exception exception){  
			          System.out.println(exception);  
			   }      
	}
}
