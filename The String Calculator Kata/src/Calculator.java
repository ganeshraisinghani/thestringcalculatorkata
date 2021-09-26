
public class Calculator {
	
	private final String delimiter = ",|\n";

	public int calculate(String input) {
		String[] numbers = input.split(delimiter);
		if(isEmpty(input)) {
			return 0;	
		}
		if(input.length() == 1) {
			return stringToInt(input);
		}
		else {
			return getSum(numbers[0],numbers[1]);
			
		}
	}
	
	private int getSum(String numA, String numbB) {
		return Integer.parseInt(numA) + Integer.parseInt(numbB);
	}
	
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}

	private int stringToInt(String input) {
		return Integer.parseInt(input);
		
	}
}
