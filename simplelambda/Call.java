package simplelambda;
public class Call {
	public static void main(String... args) {
		Operable o = (a,b)-> a+b;		
		System.out.println(o.operate(2,3));
	}
}