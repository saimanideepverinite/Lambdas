package lambda;
public class Lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=()->{System.out.print("in runnable class");
		
	};
	new Thread(r1).start();
	

}}