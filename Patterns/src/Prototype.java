import java.util.ArrayList;
import java.util.List;

public class Prototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		HeavyWeightClass cl=new HeavyWeightClass();
		cl.load();
		System.out.println(cl.toString());
		HeavyWeightClass cl1=(HeavyWeightClass)cl.clone();
		System.out.println(cl1.toString());
		
		System.out.println(cl.books==cl1.books);
	}
	
	
}
class HeavyWeightClass implements Cloneable {
	
	public List<String> books=new ArrayList<>();
	
	
	public void load() {
		for (int i=0;i<10;i++){
			books.add("book"+i);
		}
	}
	
	
	private void addBooks(String book){
		books.add(book);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		
		  HeavyWeightClass c=new HeavyWeightClass(); for(String book:this.books) {
		  c.addBooks(book); } return c;
		 
	}
	
	
	
	
}