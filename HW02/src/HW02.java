import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class HW02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do{
			System.out.println("Enter string containing numbers or 'exit' to quit: ");
			inputString = sc.nextLine();
			
			if (!inputString.equals("exit")) {
				int inputSum = getSumOfNumbers(inputString);
				System.out.println("Total numbers in string entered " + inputSum + "\n");
			} else {
				getSumOfNumbers(inputString);
			}
				
		} while (!inputString.equals("exit"));
		
		do{
			System.out.println("Enter words to be sorted: ");
			inputString = sc.nextLine();
			
			if (!inputString.equals("exit")) {
				String[] aString = inputString.split(" ");
				sortIgnoringSpaces(aString);
			} else {
				getSumOfNumbers(inputString);
			}
		} while (!inputString.equals("exit"));
		
		sc.close();
		System.out.println("Good bye!");
	}
	
	public static int getSumOfNumbers(String s) {
		Pattern p = Pattern.compile("-?\\d+");
		Matcher m = p.matcher(s);
		int inputSum = 0;
		
		while (m.find()) {
			inputSum = inputSum + Integer.parseInt(m.group());
		}
		return inputSum;
	}
	
	public static void sortIgnoringSpaces(String[] a) {
		Arrays.sort(a);
		System.out.println("Sorted list of words entered: ");
		for (int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}

}
