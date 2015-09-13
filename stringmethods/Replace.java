package stringmethods;
public class Replace {
	public static void main(String... args) {
		String in = "animal farm";
		StringBuilder sb = new StringBuilder("al");
		String out = in.replace(sb,"");
		System.out.println(out);
		sb.delete(1,2);
		/*out = in.replace(sb,'b');no suitable method found*/
		System.out.println(out);
	}
}