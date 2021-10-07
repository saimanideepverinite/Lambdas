package sandd;

public interface inter {
	public void details();
	default void marks()
	{
		System.out.println("You are in default method of inter");
	}
static void branch()
{
	System.out.println("MPC");
}
}
