
public class ArrayEx {
	public static void main(String[] args) {
		int a[][]=new int[3][4];
		byte b=4;
		float f=4.0f;
		a[0][0]=b;	
		a[0][1]= 2;
		a[0][2]=3;
		a[0][3]=4;
		
		
		
		a[1][0]=1;	
		a[1][1]= 2;
		a[1][2]=3;
		a[1][3]=4;
		
		a[2][0]=1;	
		a[2][1]= 2;
		a[2][2]=3;
		a[2][3]=4;
		
		System.out.println(a[2][1]);
		
		Integer i=80;
		System.out.println(i.intValue());
		System.out.println(i.longValue());
		System.out.println(i.byteValue());
		
		String i1="9";
		System.out.println(Integer.parseInt(i1));
		
		
		Integer k=Integer.valueOf(2);
		System.out.println(k);
		
		}
	
	
	

}


