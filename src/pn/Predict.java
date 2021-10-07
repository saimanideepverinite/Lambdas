package pn;
import java.util.function.Predicate;
import java.util.Scanner;
public class Predict {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no");
		Predicate <Integer> no=(x)->(x>0);
		int x=sc.nextInt();
		System.out.print(no.test(x));
		
	}

}
