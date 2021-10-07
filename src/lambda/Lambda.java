package lambda;
import java.util.*;

public class Lambda {
	public static void main(String []args) {
		
		ArrayList<Integer> array1=new ArrayList<Integer>();
		System.out.println("enter length of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++)
		{
			
		 array1.add(i);
		}
		array1.forEach(x->System.out.println(x));
	}

}
