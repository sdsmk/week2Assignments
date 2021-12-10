package Day2Assignments;
@FunctionalInterface
interface func{
	public void met();
}


public class Assignment3 {
	public static void main(String args[]) {
		met9(()-> { 
			System.out.println("this is functional interface example");}

		);
	}
	private static void met9(func fi) {
	// TODO Auto-generated method stub
		fi.met();
}
}
