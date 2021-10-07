package sandd;
class mani implements inter,degree 
{
	public void details()
	{
		System.out.println("inter deatails name: sai manideep");
	}
	public void course()
	{
		System.out.println("course in degree :b.tech");
	}
	public void marks()
	{
		
		inter.super.marks();
		degree.super.marks();
	}
}

public class SandD {

	public static void main(String[] args) {
		mani m=new mani();
		m.marks();
		m.details();
		inter.branch();
		m.course();
		degree.branch();
		
		
		
		
		
	}

}
