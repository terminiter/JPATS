package tests;
/**
 * This tests interprocedural array access
 * 
 * @author Ben Holland
 */
public class TestInterproceduralArrayAccess {

	private static Object[] a = new Object[1];

	static class Object1 {
		public Object1() {}

		@Override
		public String toString() {
			return "TestInterproceduralArrayAccess$Object1$toString";
		}
	}

	public static Object reader() {
		return a[0];
	}

	public static void writer(Object object) {
		a[0] = object;
	}

	public static void main(String[] args) {
		writer(new Object1());
		Object o2 = reader();
		System.out.println(o2.toString());
	}

}
