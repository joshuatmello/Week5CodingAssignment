package Week5CodingAssignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AsteriskLogger asteriskLogger= new AsteriskLogger();
		String errorMessage= "Oh snap! I messed up.";
		String errMsg= "Different sized error message to show off!";
		
		asteriskLogger.Log(errorMessage);
		
		System.out.println("\n-------------------\n");
		
		asteriskLogger.Error(errorMessage);
		asteriskLogger.Error(errMsg);
		
		System.out.println("\n-------------------\n");
		
		SpacedLogger spacedLogger= new SpacedLogger();
		spacedLogger.Log(errorMessage);
		
		System.out.println("\n-------------------\n");
		
		spacedLogger.Error(errorMessage);
	}

}
