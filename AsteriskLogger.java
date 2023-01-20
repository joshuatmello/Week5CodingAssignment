package Week5CodingAssignment;

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String string) {
		System.out.println("***"+string+"***");
	}

	@Override
	public void Error(String string) {
		StringBuilder str= new StringBuilder();
		for(int i=0; i< (13+string.length()); i++) {
			str.append("*");			
		}
		System.out.println(str.toString());
		
		System.out.println("***ERROR: "+string+"***");
		
		System.out.println(str.toString());
	}

}
