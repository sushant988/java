import java.util.Arrays;
import java.util.Comparator;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"c","d","b","a","e"};
		InnerClass in=new InnerClass();
		Arrays.sort(arr,in);
Arrays.stream(arr).forEach(System.out::println);
System.out.println(Arrays.binarySearch(arr, "b"));
	}
	
	static class InnerClass implements Comparator<String>{

		@Override
		public int compare(String arg0, String arg1) {
			// TODO Auto-generated method stub
			return arg1.compareTo(arg0);
		}
		
	}

}
