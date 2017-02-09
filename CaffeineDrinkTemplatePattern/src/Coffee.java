import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineDrink{

	void brew() {
		System.out.println("Brewing coffee");
		
	}

	void addCondiments() {
		System.out.println("Adding cream to coffee");		
	}
	
	boolean CustomerWantsCondiments() {
		String input = userInput();
		if (input.toLowerCase().startsWith("y")){
			return true;
		}
		
		else {
			return false;
		}
	}		
		
	String userInput() {	
		String input = "";
		System.out.println("Do you want condiments with your coffee?");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			input = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO error trying to read your answer");
		}
		if (input == null) {
			return "no";
		}		
		return input;
	}
}
