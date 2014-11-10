import java.util.Scanner;

public class FractionCalculator {

	public static void main(String[] args) {
		
		// sets value in memory to zero
		Fraction value = new Fraction(0,1);
		System.out.println("Hello Luis, enter line to calculate:");
		
		boolean on = true;
		while(on){
			
			System.out.println("Calculator: " + value);
			System.out.println("");
			
			Scanner in = new Scanner(System.in);
			String input = in.nextLine();
			
			if(input.equals("stop")){
				on = false;
				in.close();
				System.out.println("Goodbye");
			}else{
			value = evaluate(value, input);
			}
			System.out.println("");
		}
	}
	
	public static Fraction evaluate(Fraction f1, String inputString){
		String[] inputLine = inputString.split(" ");

		System.out.println("");
		
		Fraction result = f1;
		String operator = "";	
		
		for(int i = 0; i < inputLine.length; i++){
			if(inputLine[i].length() >= 3){
				String[] frac = inputLine[i].split("/");
				
				int num = Integer.parseInt(frac[0]);
				int denom = Integer.parseInt(frac[1]);
				
				Fraction f2 = new Fraction(num, denom);
				
				if(operator.isEmpty()){
					result = f2;
				}else if(operator.equals("+")){
					result = result.add(f2);
					operator = "clear";
				}else if(operator.equals("-")){
					result = result.subtract(f2);
					operator = "clear";
				}else if(operator.equals("*")){
					result = result.multiply(f2);
					operator = "clear";
				}else if(operator.equals("/")){
					result = result.divide(f2);	
					operator = "clear";
				}	
			}else if(inputLine[i].length() == 1){
				operator = inputLine[i];
			}
		}
		return result;
	}
}

//3/2 + 1/3 * 1/5 / 2/5

//System.out.println("result("+i+"): " + result);
//System.out.println("operator("+i+"): " + operator);
//System.out.println("");
