package tests;
/**
 * This tests the ability of an analysis to resolve a simply dynamic dispatch
 * 
 * @author Ben Holland
 */
public class TestSimpleDynamicDispatch {

	public static void main(String[] args) {
		Object o = new TestSimpleDynamicDispatch();
		System.out.println(o.toString());
	}

	@Override
	public String toString() {
		return "TestSimpleDynamicDispatch$toString";
	}
}
