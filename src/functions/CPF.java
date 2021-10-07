package functions;
import java.util.function.Predicate;
import java.util.Scanner;
import java.util.function.*;
public class CPF {
	public static void main(String []a)
	{
		Scanner sc=new Scanner(System.in);
		Scanner si=new Scanner(System.in);
		System.out.print("enter integer");
		int value=sc.nextInt();
		
		Consumer<String> str2=(x)->System.out.println(x);
		System.out.println("enter strinfg");
		String str1=si.nextLine();
		str2.accept(str1);
		Predicate<Integer> y=(x)->(x>0);
		System.out.println(y.test(value));
		Function <Integer,Boolean> z=(x)->(x%2==0);
		System.out.print(z.apply(value));
		
	}

}
