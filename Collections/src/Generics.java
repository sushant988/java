import java.util.ArrayList;
import java.util.List;

public class Generics {
	
	public static void main(String[] args) {
		
		List<String> li=new ArrayList<String>();
		li.add("qq");
		li.add("ggg");
		//not allowed
		//List<Animal> lo=new ArrayList<Dog>();
		List<Animal> lo=new ArrayList<Animal>();
		lo.add(new Dog());
		
		for(String s:li) {//no cast required
			System.out.println(s);
		}
		AddingTypeSafeToUnSafeType as=new AddingTypeSafeToUnSafeType();
		as.addList(li);
		
		List<Dog> dogList=new ArrayList<Dog>();
		//not allowed
		//setListOfTypeAnimal(dogList);
		//allowed
		
		List<? extends Animal> asty=setListOfTypeAnimal1(dogList);
		//can access but cant modify
		//asty.add(new Dog());
	}
	
	
	public List<Animal> setListOfTypeAnimal(List<Animal> animalList ) {
		//not allowed
		//return new ArrayList<Dog>();
		return null;
	}
	
	public static List<? extends Animal> setListOfTypeAnimal1(List<? extends Animal> animalList ) {
		//not allowed
		//return new ArrayList<Dog>();
		
		
		//can access the list bit cant modify
		//animalList.add(new Animal());
		
		
		return null;
	}
	
	

}
class AddingTypeSafeToUnSafeType{
	
	List l1=new ArrayList();
	public void addList(List l) {
		l1.add(1);
		l1.add(2);
		l1.addAll(l);
		
	}
	
	
}
class Animal{
	
}

class Dog extends Animal{
	
}