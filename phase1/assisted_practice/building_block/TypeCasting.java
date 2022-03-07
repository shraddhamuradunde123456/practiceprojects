package phase1.assisted_practice.building_block;

public class TypeCasting {

	public static void main(String[] args) {
		
		System.out.println("Implicit type casting");
		char a = 'A';
		System.out.println("value of a : "+ a);
		
		int b = a;
		System.out.println("value of b : "+ b);
		
		float c = a;
		System.out.println("value of c : "+ c);
		
		long d = a;
		System.out.println("value of d : "+ d);
		
		double e = a;
		System.out.println("value of e : "+ e);
		
		System.out.println("\n");
		
		System.out.println("explicit type casting");
		
		double x = 45.5;
		int y = (int)x;
		System.out.println("value of x : "+ x);
		System.out.println("value of y : "+ y);

	}

}
