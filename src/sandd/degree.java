package sandd;

public interface degree {
	public void course();
	default void marks()
	{
		System.out.print("");
	}
	static void branch()
	{
		System.out.println("CSE");
	}

}
