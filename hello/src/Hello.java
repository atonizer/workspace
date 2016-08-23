
public class Hello {

	public static void main(String[] args) {
		// System.out.println("Hello, World");

		// int x = 8;
		//
		// String message = "Hello, Java ";
		// System.out.println(message + x + "!");
		try {
			String name = args[0];
			System.out.println("Hello," + name);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Hello, Nobody");
		}
		
		// Start at 32-40  2013-01-07 13.51.mov

	}
}
