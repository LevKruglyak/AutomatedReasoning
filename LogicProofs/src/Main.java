import engine.ProofSpace;
import engine.Statement;

public class Main {

	public static void main(String[] args) {
		ProofSpace space = new ProofSpace();
		space.addPremise("(~(A+B)->C)");
		space.addPremise("~A"); 
		space.addPremise("~C");
		
		for (int i = 0; i < 10; i++) {
			space.infer();
		}
		
		print(space);
	}
	
	public static void print(String string) {
		System.out.println(string);
	}

	public static void print(boolean bool) {
		System.out.println(bool);
	}

	public static void print(ProofSpace space) {
		System.out.println(space.toString());
	}

	public static void print(Statement statement) {
		System.out.println(statement.toPrintString());
	}
}
