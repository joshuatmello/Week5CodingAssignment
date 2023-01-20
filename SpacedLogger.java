package Week5CodingAssignment;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String string) {
		
		StringBuilder spacedString = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
		   if (i > 0) {
		      spacedString.append(" ");
		    }
		   spacedString.append(string.charAt(i));
		}
		System.out.println(spacedString.toString());
	}

	@Override
	public void Error(String string) {
		StringBuilder errorSpaced= new StringBuilder();
		for(int i=0; i<string.length(); i++) {
			if(i>0) {
				errorSpaced.append(" ");
			}
			errorSpaced.append(string.charAt(i));
		}
		System.out.println("ERROR: "+ errorSpaced.toString());
	}

}
